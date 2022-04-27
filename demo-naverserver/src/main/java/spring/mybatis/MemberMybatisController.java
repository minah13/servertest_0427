package spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberMybatisController {
	
	@Autowired
	@Qualifier("mybatisservice")
	MemberService service;
	
//service memberlist �޼ҵ� ��üȸ�� ��ȸ ��� ��, mybatis/memberlist.jsp ��
	
	@RequestMapping("/membermybatislist")
	public ModelAndView memberlist() {
		ModelAndView mv = new ModelAndView();
		List<MemberDTO> list = service.memberlist();
		mv.addObject("memberlist",list);
		mv.setViewName("mybatis/memberlist");
		
		return mv;
	}
	
	@RequestMapping("/membermybatispaginglist")
	public ModelAndView memberlist(int page) {
		ModelAndView mv = new ModelAndView();
		List<MemberDTO> list = service.memberlist(page);
		mv.addObject("memberlist",list);
		mv.addObject("name","����¡ó������Ʈ");
		mv.setViewName("mybatis/memberlist");
		
		return mv;
	}
	
	@RequestMapping("/membermybatissearchlist")
	public ModelAndView memberlist(String address[]) {
		ModelAndView mv = new ModelAndView();
		List<String> list = service.memberlist(address);
		//String[] l = list_id.toArray(new String[list_id.size()]);
		//List<MemberDTO> list = service.memberlist(l);
		mv.addObject("memberlist",list);
		mv.addObject("name","�ּҰ˻�����Ʈ");
		mv.setViewName("mybatis/memberlist");
		
		return mv;
	}
	
	@GetMapping("/membermybatisinsert")
	public String insertform() {
		return "mybatis/insertform";
	}
	
	@PostMapping("/membermybatisinsert")
	public ModelAndView insertresult(MemberDTO dto) {
		ModelAndView mv = new ModelAndView();
		int insertrow = service.insertmember(dto);
		mv.addObject("insertrow",insertrow);
		mv.setViewName("mybatis/insertresult");
		return mv;
	}
	
	@GetMapping("/membermybatisupdate")
	public String updateform(String id) {
		return "mybatis/updateform";
	}
	
	@PostMapping("/membermybatisupdate")
	public ModelAndView updateresult(MemberDTO dto) {
		ModelAndView mv = new ModelAndView();
		int updaterow = service.updatemember(dto);
		mv.addObject("updaterow",updaterow);
		mv.setViewName("mybatis/updateresult");
		return mv;
	}
	
	@RequestMapping("/membermybatisdelete")
	public ModelAndView deleteresult(String id) {
		int result = service.deletemember(id);
		List<MemberDTO> list = null;
		if(result == 1) {
			list = service.memberlist();
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("memberlist",list);
		mv.setViewName("mybatis/memberlist");
		
		return mv;
	}
}
