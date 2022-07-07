package com.deepti.spring.multipleProfile;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public final String prefix;

    public MyComponent() {
        prefix = "componentDefault";
    }

    public MyComponent(String prefix) {

        this.prefix = prefix;
    }
}
