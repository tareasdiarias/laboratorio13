package Producto_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "Producto_service.client")
@EnableDiscoveryClient
public class ProductoServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductoServiceApplication.class, args);
    }
}