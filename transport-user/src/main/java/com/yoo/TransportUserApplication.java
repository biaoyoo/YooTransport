package com.yoo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.yoo.user.mapper")
public class TransportUserApplication {//extends SpringBootServletInitializer

	public static void main(String[] args) {
		SpringApplication.run(TransportUserApplication.class, args);
	}

	/*@Override 1.4.3 不支持这种tomcat启动
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(TransportUserApplication.class);
	}*/
}
