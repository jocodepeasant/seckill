package com.sm.seckill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author fzb
 * @date 2020/12/16 22:42
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SeckillSingleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillSingleApplication.class, args);
    }
}
