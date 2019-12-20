package com.example.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dto.MemberVO;
import com.example.service.MemberService;

import kr.pe.myblog.front.dto.FrontinfoVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	private MemberService service;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception{

		logger.info("/index.do");
		
		List<MemberVO> memberList = service.selectMember();
		int memberCnt = service.selectMemberCnt();
		
		model.addAttribute("memberList", memberList);
		model.addAttribute("memberCnt", memberCnt);
		
		model.addAttribute("username", service.selectMemberName() );
		model.addAttribute("userinfo", service.selectMemberInfo("arduino2") );

		return "member";
	}
	
}
