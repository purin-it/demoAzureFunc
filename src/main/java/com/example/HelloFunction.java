package com.example;

import com.example.model.Greeting;
import com.example.model.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class HelloFunction {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloFunction.class, args);
	}

	/**
	 * Userオブジェクトを引数に、Greetingオブジェクトを返却する関数
	 * @return 生成した関数
	 */
	@Bean
	public Function<User, Greeting> hello() {
		return user -> new Greeting("Hello, " + user.getName());
	}
}
