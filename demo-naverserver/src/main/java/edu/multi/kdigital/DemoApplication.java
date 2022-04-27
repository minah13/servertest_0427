package edu.multi.kdigital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import product.ProductController;
import product.ProductDAO;
import spring.mybatis.MemberDAO;
import spring.mybatis.MemberMybatisController;
import upload.DownloadController;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackageClasses = DownloadController.class)    // downloadcontroller가 있는 패키지에 있는 어노테이션은 다 쓰겠다!
//@ComponentScan(basePackages = {"upload"})  // 위와 동일(패키지명을 알려주기)
@ComponentScan(basePackageClasses = MemberMybatisController.class)
@ComponentScan(basePackageClasses = ProductController.class)
@MapperScan(basePackageClasses = MemberDAO.class)    // Mapper어노테이션은 mapperscan으로 읽을 수 있음!(다른 어노테이션과 달리)
@MapperScan(basePackageClasses = ProductDAO.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
