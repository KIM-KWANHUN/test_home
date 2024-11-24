package org.ohgiraffers.menu.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.ohgiraffers.menu")
@MapperScan(basePackages = "org.ohgiraffers.menu",
            annotationClass = Mapper.class)
public class ContextConfig {
}
