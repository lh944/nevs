package com.xm.nevs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xm.nevs.mapper")
public class NevsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NevsApplication.class, args);
	}

}
