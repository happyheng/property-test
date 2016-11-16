package com.happyheng;

import com.happyheng.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * Created by happyheng on 16/11/13.
 */
public class Main {


    public static void main(String args[]){
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);


    }

}
