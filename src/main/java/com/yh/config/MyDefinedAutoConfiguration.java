package com.yh.config;

import com.yh.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyDefinedAutoConfiguration {

    @Bean
    public WebMvcConfigurer getWebMvc(){
        return new WebMvcConfigurer(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }
        };
    }
    @Bean
    public LocaleResolver localeResolver(){

        return new MyLocaleResolver();
    }
   /* @Bean
    public WebMvcConfigurationSupport getWebMvcConfigurationSupport(){
        return new WebMvcConfigurationSupport();
    }*/
}
