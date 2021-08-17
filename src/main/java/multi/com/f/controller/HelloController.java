package multi.com.f.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import multi.com.f.dto.MemberDto;

@RestController
public class HelloController {

	@RequestMapping(value="/")
	public String hello() {
		System.out.println("HelloController hello()" + new Date());
		
		return "Hello";
	}
	
	@RequestMapping(value="/member")
	public MemberDto getMember() {
		System.out.println("MemberDto getMember()" + new Date());
		
		MemberDto dto = new MemberDto("aaa", "111", "AAA", "a@mail.com", 3);
		
		return dto;
	}
	
	@RequestMapping(value="/memberlist")
	public List<MemberDto> memberlist() {
		System.out.println("List<MemberDto> memberlist()" + new Date());
		
		List<MemberDto> list = new ArrayList<MemberDto>();
		list.add(new MemberDto("aaa", "111", "AAA", "a@mail.com", 3));
		list.add(new MemberDto("bbb", "222", "BBB", "b@mail.com", 3));
		list.add(new MemberDto("ccc", "333", "CCC", "c@mail.com", 3));
		
		return list;
	}
}
