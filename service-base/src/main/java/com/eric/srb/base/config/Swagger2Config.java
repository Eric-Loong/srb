package com.eric.srb.base.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket adminBackendApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Backend API")
                .apiInfo(adminBackendApiInfo())//添加接口文档信息
                .select()
                .paths(Predicates.and(PathSelectors.regex("/admin/.*")))//文档分组展示
                .build();
    }

    private ApiInfo adminBackendApiInfo() {//接口文档信息
        return new ApiInfoBuilder()
                .title("尚融宝后台管理系统API文档")
                .description("本文档描述了尚融宝后台管理系统中各个模块的接口的调用方式")
                .version("1.0")
                .contact(new Contact("Eric", "https://atguigu.com", "eric@live.com"))
                .build();
    }

    @Bean
    public Docket adminWebApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Web API")
                .select()
                .paths(Predicates.and(PathSelectors.regex("/api/*")))
                .build();
    }
}
