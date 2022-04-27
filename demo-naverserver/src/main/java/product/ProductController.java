package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	@Autowired
	@Qualifier("productservice")
	ProductService service = new ProductServiceImpl();
	
	@RequestMapping("/productlist")
	public ModelAndView showlist() {
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> list = service.productlist();
		mv.addObject("list", list);
		mv.setViewName("mybatis/productlist");
		return mv;
	}
	
	@RequestMapping("/product")
	public ModelAndView showdetail(int productcode) {
		ModelAndView mv = new ModelAndView();
		ProductDTO dto = service.detailproduct(productcode);
		mv.addObject("detail", dto);
		System.out.println(dto.balance);
		System.out.println(dto.company);
		System.out.println(dto.price);
		System.out.println(dto.productcode);
		System.out.println(dto.productname);
		System.out.println(dto.regdate);
		mv.setViewName("mybatis/detailproduct");
		return mv;
	}
}
