package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

@Configuration
public class SwaggerConfig {

    // bean of Swagger Docket
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo()) // Set up the Swagger Info
                .enable(true)      // 設定是否啟動swagger,預設為true
                .select()
                /**
                 * apis():指定掃描的介面
                 *  RequestHandlerSelectors:設定要掃描介面的方式
                 *       basePackage:指定要掃描的包
                 *       any:掃面全部
                 *       none:不掃描
                 *       withClassAnnotation:掃描類上的註解(引數是類上註解的class物件)
                 *       withMethodAnnotation:掃描方法上的註解(引數是方法上的註解的class物件)
                 */
                .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
                /**
                 * paths():過濾路徑
                 *  PathSelectors:設定過濾的路徑
                 *      any:過濾全部路徑
                 *      none:不過濾路徑
                 *      ant:過濾指定路徑:按照按照Spring的AntPathMatcher提供的match方法進行匹配
                 *      regex:過濾指定路徑:按照String的matches方法進行匹配
                 */
                .paths(PathSelectors.any())
                .build();
    }

    // Set up the Swagger Info
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Student - Restful API Document",
                "Demo project for Spring boot & Swagger",
                "1.0",
                "https://petstore.swagger.io/",
                new Contact("Molly Huang", "https://netivism.com.tw/blog/436", "molly.h@deltaww.com"),
                null,
                null,
                new ArrayList<VendorExtension>());
    }

}
