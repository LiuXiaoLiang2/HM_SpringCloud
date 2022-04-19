package cn.ddcode.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("cn.ddcode.order.mapper")
@SpringBootApplication
//注册服务
@EnableDiscoveryClient
public class OrderServiceNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceNacosApplication.class, args);
    }

}