package edu.multi.kdigital;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A {
	@RequestMapping("/a")
	public String sample() {
		return "sample";
	}
}
