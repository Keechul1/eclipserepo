package kr.pe.myblog.front.service;

import java.util.List;

import kr.pe.myblog.front.dto.FrontinfoVO;

// Service 추가 : Service 인터페이스를 생성한 후 root-context.xml 의
// <context:component-scan base-package="kr.pe.myblog.front.service"></context:component-scan> 
// 추가 필요

public interface FrontinfoService {
	
	// 카드목록
	public List<FrontinfoVO> selectFrontinfo() throws Exception;

}
