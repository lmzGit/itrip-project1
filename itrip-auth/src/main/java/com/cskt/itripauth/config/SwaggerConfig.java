package com.cskt.itripauth.config;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 李谟卓
 * @Description: Swagger配置文件
 * @date 2020-09-17 18:40
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket authApiConfig() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .groupName("authApi")
                    .apiInfo(authApiInfo())
                    .select()
                    //指定Swagger管理规则，将所有请求路径前缀为 /api 的统统纳入管理
                    // .paths(Predicates.and(PathSelectors.regex("/api/*")))
                    .apis(RequestHandlerSelectors.basePackage("com.cskt.itripauth.controller"))
                    //排除请求路径前缀为 /error 的控制器，主要是 Spring Boot 自带的异常处理接口
                    .paths(Predicates.not(PathSelectors.regex("/error/*")))
                    .build();
        }
        private ApiInfo authApiInfo() {
            return new ApiInfoBuilder()
                    .title("爱旅行-用户认证模块API")
                    .description("提供用户认证相关接口")
                    .version("V1.0")
                    .build();
    }
}
