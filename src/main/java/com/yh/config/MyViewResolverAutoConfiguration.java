package com.yh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@Configuration
public class MyViewResolverAutoConfiguration {

    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }

}

class MyViewResolver implements ViewResolver {

    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {
        return null;
    }
}
