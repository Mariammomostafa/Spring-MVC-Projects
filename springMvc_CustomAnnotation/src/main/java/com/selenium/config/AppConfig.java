package com.selenium.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



@Configuration
@ComponentScan("com.selenium")
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer{
	
	
	@Bean
	InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	@Bean
	ReloadableResourceBundleMessageSource messageSource() {
		
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages");
		
		return messageSource;
	}
	
	@Bean
	LocalValidatorFactoryBean factoryBean() {
		
		LocalValidatorFactoryBean factoryBean = new  LocalValidatorFactoryBean();
		factoryBean.setValidationMessageSource(messageSource());
		
		return factoryBean;
	}

	@Override
	public Validator getValidator() {
		
		return factoryBean();
	}

	
	
}
