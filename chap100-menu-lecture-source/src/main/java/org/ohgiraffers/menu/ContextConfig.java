package org.ohgiraffers.menu;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.ohgiraffers.menu")
@MapperScan(basePackages = "org.ohgiraffesr.menu",
            annotationClass = Mapper.class)
public class ContextConfig {
}
