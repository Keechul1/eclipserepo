package kr.pe.myblog.team.dao;

import java.util.List;

import kr.pe.myblog.team.dto.TeaminfoVO;

//DAO 추가 : DAO 인터페이스를 생성한 후 root-context.xml 의
//<context:component-scan base-package="kr.pe.myblog.team.dao"></context:component-scan> 
//추가 필요

public interface TeaminfoDAO {

	public List<TeaminfoVO> selectTeaminfo() throws Exception;
}
