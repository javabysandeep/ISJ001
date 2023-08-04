package com.itshaala.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.itshaala"})
public class InternalResourceConfig {
    @Bean
    public InternalResourceViewResolver ivr() {
        InternalResourceViewResolver ivr = new InternalResourceViewResolver();
        ivr.setPrefix("/WEB-INF/view/");
        ivr.setSuffix(".jsp");
        return ivr;
    }
}
