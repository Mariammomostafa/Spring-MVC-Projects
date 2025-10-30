package com.selenium.config;

import java.util.Properties;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.selenium.config.dto.FeedBackDto;

@EnableWebMvc
@Configuration
@ComponentScan("com.selenium")
@PropertySource("classpath:mail.properties")
public class AppConfig implements WebMvcConfigurer{
	
	
	Logger logger = Logger.getLogger(AppConfig.class.getName());
	
	@Autowired
	private Environment environment;
	
	@Bean
	InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	

	 @Override
	 public void addFormatters(FormatterRegistry registry) {
		
		 registry.addFormatter(new PhoneFormatter());
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
	
	 
	 @Bean
	 JavaMailSender javaMAilSender() {
		 
		 JavaMailSenderImpl  mailSenderImpl = new JavaMailSenderImpl();
		 
		 logger.info("fetching the host value from properties file : " + environment.getProperty("mail.host"));
		 
		 mailSenderImpl.setHost(environment.getProperty("mail.host"));
		 mailSenderImpl.setUsername(environment.getProperty("mail.username"));
		 mailSenderImpl.setPassword(environment.getProperty("mail.password"));
		 mailSenderImpl.setPort(getIntProperty("mail.port"));
		 	 
		 mailSenderImpl.setJavaMailProperties(mailProperties());

		 return mailSenderImpl;
	 }

	 private Properties mailProperties() {
		Properties  mailProperties = new Properties();
		 
		 mailProperties.put("mail.smtp.starttls.enable", true);
		 mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		 
		return mailProperties;
	 }
	 
	 //helper method to convert any String property to Integer
	 
	 int getIntProperty(String key) {
		 
		 String value = environment.getProperty(key);
		 
		 return Integer.parseInt(value);
	 }
	 
     // Provide a custom Validator instead of the one created by default
     
	 @Override
	 public Validator getValidator() {
		
		return validator();
	 }
	 
	 
	 
}
