package com.deepti.spring.multipleProfile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyComponentTest {

    @Autowired
    MyComponent myComponent;

    @Autowired
    @Qualifier("component1")
    MyComponent myComponent1;

    @Autowired
    @Qualifier("component2")
    MyComponent myComponent2;

    @Test
    public void testDefaultBean() {
        assertEquals("componentDefault", myComponent.prefix);
    }

    @Test
    public void testComponentPrimary() {
        assertEquals("component1", myComponent1.prefix);
    }

    @Test
    public void testComponent2() {
        assertEquals("component2", myComponent2.prefix);
    }

}