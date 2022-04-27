package spring.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


// sql-mapping.xml 속 매핑 id와 같아야 함!
@Mapper
@Repository("mybatisdao")
public interface MemberDAO {
	public int insertmember(MemberDTO dto);
	public int updatemember(MemberDTO dto);
	public int deletemember(String id);
	public List<MemberDTO> memberlist();
	public List<MemberDTO> paginglist(int[] page);
	public List<String> addresssearch(String[] address);
	public MemberDTO member(String id);
}

