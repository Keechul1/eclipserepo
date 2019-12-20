package kr.pe.myblog.front.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dto.MemberVO;
import com.example.service.MemberService;

import kr.pe.myblog.front.dto.FrontinfoVO;
import kr.pe.myblog.front.service.FrontinfoService;
import kr.pe.myblog.team.dto.TeaminfoVO;
import kr.pe.myblog.team.service.TeaminfoService;

// Controller 추가 : Controller 클래스 생성 후 servlet-context.xml의
// <context:component-scan base-package="kr.pe.myblog.front.controller" /> 추가 필요
// @Controller 어노테이션 추가 필요

@Controller
public class FrontController {
	
	private static final Logger logger = LoggerFactory.getLogger(FrontController.class);
	
	// Service 추가
	@Inject
	private MemberService service;
	
	@Inject
	private FrontinfoService frontService;
	
	@Inject
	private TeaminfoService teamService;
	
	@Inject
	private ContectinfoService contectService;
	
	@RequestMapping(value = "/index2.do")
	public String front(Locale locale, Model model) throws Exception{

		logger.info("/index2.do");

		List<FrontinfoVO> frontList = frontService.selectFrontinfo();
		model.addAttribute("frontList", frontList);
		List<TeaminfoVO> teamList = teamService.selectTeaminfo();
		model.addAttribute("teamList", teamList);

		return "front";
	}
	
	@RequestMapping(value = "/home.do")
	public String home(
			Locale locale
			,@RequestParam(value="name",required=false) String name
			,@RequestParam Map<String, String> parameters
			, Model model
			) throws Exception{

		logger.info("/home.do"+"---"+name);
		if(name !=null) {
			logger.info("Insert 작업 필요"+parameters.get("subject"))
			//contextinfo 테이블을 처리할 service가 필요함
		}

		List<FrontinfoVO> frontList = frontService.selectFrontinfo();
		model.addAttribute("frontList", frontList);
		List<TeaminfoVO> teamList = teamService.selectTeaminfo();
		model.addAttribute("teamList", teamList);

		return "home";
	}
	
}
