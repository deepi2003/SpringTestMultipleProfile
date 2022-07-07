package com.deepti.spring.multipleProfile;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfiguration {

    @Bean
    @Qualifier("component1")
    public MyComponent component1() {
        return new MyComponent("component1");
    }


    @Bean
    @Qualifier("component2")
    public MyComponent component2() {
        return new MyComponent("component2");
    }
}
