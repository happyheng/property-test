package com.happyheng.config;

import com.happyheng.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * Created by happyheng on 16/11/13.
 */
//@Configuration
//@ComponentScan(basePackages = "com.happyheng")
//@PropertySource("classpath*:**/*.properties")
//@PropertySource("classpath:property/enviroment.properties")

//@Configuration
//@ComponentScan(basePackages = "com.happyheng")
//@PropertySource("classpath:*.properties")
public class MainConfig {

    @Autowired
    Environment env;

    @Bean
    public People people() {

        People people = new People();
        people.setName(env.getProperty("connection.username"));
        people.setAge(env.getProperty("age"));
        return people;
    }

    @Bean
    public PropertiesFactoryBean configProperties(){
        PropertiesFactoryBean bean = new PropertiesFactoryBean();
        bean.setLocation(new ClassPathResource("property/enviroment.properties"));
        return bean;
    }
}
