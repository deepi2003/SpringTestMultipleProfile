package com.deepti.spring.multipleProfile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyComponentTest {

    @Autowired
    MyComponent myComponent;

    @Test
    public void testName() {
        assertEquals("component2", myComponent.prefix);
    }

}