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

@EnableWebMvc
@Configuration
@ComponentScan("com.selenium")
public class AppConfig implements WebMvcConfigurer{
	
	@Bean
	InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	

	 
	 //load resource bundle (.properties file) due to spring mvc do NOT know it
	 @Bean
	 public ReloadableResourceBundleMessageSource messageSource() {
		 
		 ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		 messageSource.setBasename("classpath:messages");
		 
		 return messageSource;
	 }
	 @Bean
	 public LocalValidatorFactoryBean validator() {
		 
		 LocalValidatorFactoryBean factoryBean = new LocalValidatorFactoryBean();
		 factoryBean.setValidationMessageSource(messageSource());
		 
		 return factoryBean;
		 
	 }
	 
		 
     // Provide a custom Validator instead of the one created by default
     
	 @Override
	 public Validator getValidator() {
		
		return validator();
	 }
	 
	 
	 
}
