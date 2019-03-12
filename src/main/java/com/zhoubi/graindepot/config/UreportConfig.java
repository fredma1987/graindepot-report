package com.zhoubi.graindepot.config;

import javax.servlet.Servlet;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.bstek.ureport.console.UReportServlet;

@ImportResource("classpath:ureport-console-context.xml")
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = "com.zhoubi.graindepot")
public class UreportConfig {
    @Bean
    public ServletRegistrationBean buildUreportServlet() {
        return new ServletRegistrationBean(new UReportServlet(), "/ureport/*");

    }
}
