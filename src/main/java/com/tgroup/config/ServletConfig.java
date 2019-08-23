package com.tgroup.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.tgroup"})
public class ServletConfig implements WebMvcConfigurer{

    @Bean
    public InternalResourceViewResolver getinInternalResourceViewResolver() {
        InternalResourceViewResolver intr = new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
        return intr;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/resources/");
    }
    
}
