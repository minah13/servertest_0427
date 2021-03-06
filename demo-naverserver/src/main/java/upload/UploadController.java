package upload;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

// spring boot는 파일 업로드시 설정하는 부분을 적지만 1MB의 용량제한이 있다
// org.apache.tomcat.util.http.fileupload.impl.SizeLimitExceededException

@Controller
public class UploadController {
	@RequestMapping(value="/fileupload", method=RequestMethod.GET)
	public String uploadform() {
		return "upload/uploadform";
	}
	
	@RequestMapping(value="/fileupload", method=RequestMethod.POST)
	public String uploadresult(@ModelAttribute("dto") uploadDTO dto) throws Exception{
		
		MultipartFile mf1 = dto.getFile1();
		MultipartFile mf2 = dto.getFile2();
		
		System.out.println(dto.getName());
		System.out.println(dto.getDescription());
		
		System.out.println(mf1.getOriginalFilename());  // �̸�
		System.out.println(mf2.getOriginalFilename());  // �̸�
		System.out.println(mf1.getSize());  // ����
		System.out.println(mf2.getSize());  // ����
		System.out.println(mf1.isEmpty());  // ���ϼ��ÿ���
		System.out.println(mf2.isEmpty());  // ���ϼ��ÿ���
		
		String savePath = "c:/upload/";
		
		if(!mf1.isEmpty()) {
			// ���� ���ϸ�
			String originname1 = mf1.getOriginalFilename();
			// Ȯ���� �������ϸ�
			String beforeext1 = originname1.substring(0,originname1.indexOf("."));
			//Ȯ���� ����
			String ext1 = originname1.substring(originname1.indexOf("."));
			//���ϰ�ü ���� �� ����
			File serverfile1 = new File(savePath + beforeext1 + "("+UUID.randomUUID().toString() + ")" + ext1);
			mf1.transferTo(serverfile1);
			
		}
		if(!mf2.isEmpty()) {
			String originname2 = mf2.getOriginalFilename();
			String beforeext2 = originname2.substring(0,originname2.indexOf("."));
			String ext2 = originname2.substring(originname2.indexOf("."));
			
			File serverfile2 = new File(savePath + beforeext2 + "(" + UUID.randomUUID().toString() + ")" + ext2);
			mf2.transferTo(serverfile2);
		}
		
		return "upload/uploadresult";
	}
}
