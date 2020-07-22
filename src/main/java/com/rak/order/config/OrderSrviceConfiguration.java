package com.rak.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import feign.Feign;

//@Configuration
public class OrderSrviceConfiguration {
//	  @Bean
//	    @Scope("prototype")
	    public Feign.Builder feignBuilder() {
	        return Feign.builder();
	    }
}
