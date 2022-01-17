package com.stuckyi;

import javax.activation.DataSource;
import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
public class StuckyiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StuckyiApplication.class, args);
	}

}
