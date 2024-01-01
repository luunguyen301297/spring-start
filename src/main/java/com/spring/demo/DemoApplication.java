package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
    //khi lệnh run đc thực thi, Spring Boot sẽ tạo 1 container là ApplicationContext
    //container này quản lý 1 không gian lưu trữ gọi là Context
    //container này sẽ tìm kiếm toàn bộ các Bean trong project đưa vào Context lưu trữ
		SpringApplication.run(DemoApplication.class, args);

//    GirlFriend girlFriend = context.getBean(GirlFriend.class);
//
//    System.err.println("Instance : " + girlFriend);
//    System.err.println(girlFriend.getOutfit());
//    girlFriend.outfit.wear();
	}

}
