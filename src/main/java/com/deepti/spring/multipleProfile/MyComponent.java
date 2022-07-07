package com.deepti.spring.multipleProfile;

import org.springframework.stereotype.Component;

public class MyComponent {

    public final String prefix;

    public MyComponent(String prefix) {

        this.prefix = prefix;
    }
}
