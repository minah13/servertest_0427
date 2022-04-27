package edu.multi.kdigital;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {
	//@ResponseBody
	@RequestMapping("/helloajax")
	public MemberDTO test() {
		MemberDTO dto = new MemberDTO("ID","PASSWORD");
		//spring boot는 json으로 자동변환되는 내장기능이 있다!
		return dto;
	}
}
