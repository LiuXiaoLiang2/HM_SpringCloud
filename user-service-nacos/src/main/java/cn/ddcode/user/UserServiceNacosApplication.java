package cn.ddcode.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("cn.ddcode.user.mapper")
@SpringBootApplication
//注册服务
@EnableDiscoveryClient
public class UserServiceNacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceNacosApplication.class, args);
    }
}
