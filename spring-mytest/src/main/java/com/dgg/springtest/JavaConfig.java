package com.dgg.springtest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenxin
 * @date 2019/11/28 17:00
 */
@Configuration
@ComponentScan
public class JavaConfig {
	@Bean
	public User user(){
		return new User(101,"ggzhifu","dgg","1868279255","sichuan");
	}
}
