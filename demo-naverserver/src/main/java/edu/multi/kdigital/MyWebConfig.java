package edu.multi.kdigital;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//현재 파일도 웹설정파일로 포함시켜라! <resources 태그처럼 설정하는 것>
@Configuration
public class MyWebConfig implements WebMvcConfigurer {

	// 컴퓨터 내에 파일도 url로 접근할 수 있도록!
	/*<resources mapping="/resources/**" location="/resources/" />*/
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
		.addResourceHandler("/upload/**")
		.addResourceLocations("file:///c:/upload/");
	}
	
}
