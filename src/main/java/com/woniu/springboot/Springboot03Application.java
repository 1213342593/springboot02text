package com.woniu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//自动生成所有的dao接口实现类
//@MapperScan("com.woniu.springboot.mapper")
//启动事务管理器
//不知道这个@EnableTransactionManagement注解的作用是啥子
//没有有均有效
@EnableTransactionManagement
@SpringBootApplication
public class Springboot03Application {

	public static void main(String[] args) {
		System.out.println("李四-------222222222222");
		SpringApplication.run(Springboot03Application.class, args);
	
	}
}
