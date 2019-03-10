package xin.nimil.mybatisplustest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("xin.nimil.mybatisplustest.mapper")
public class MybatisplustestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisplustestApplication.class, args);
    }

}
