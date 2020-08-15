package com.deepti.spring.multipleProfile;

import org.junit.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(properties = {"spring.profiles.active: test, profile1"})
@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@RunWith(SpringRunner.class)
public class TestWithProfile1 {

    @Value("${applicationid}")
    String applicationID;

    @Value("${bootstrap-servers}")
    String bootstrapServers;


    @Test
    public void testProfile() {
        assertEquals("Spring-profile1",applicationID);
        assertEquals("localhost:9093",bootstrapServers);
    }

}
