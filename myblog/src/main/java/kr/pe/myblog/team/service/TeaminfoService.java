package kr.pe.myblog.team.service;

import java.util.List;

import kr.pe.myblog.team.dto.TeaminfoVO;

//Service 추가 : Service 인터페이스를 생성한 후 root-context.xml 의
//<context:component-scan base-package="kr.pe.myblog.team.service"></context:component-scan> 
//추가 필요

public interface TeaminfoService {

	// 팀원목록
	public List<TeaminfoVO> selectTeaminfo() throws Exception;
}
