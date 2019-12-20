package kr.pe.myblog.front.dao;

import java.util.List;

import kr.pe.myblog.front.dto.FrontinfoVO;

//	DAO 추가 : DAO 인터페이스를 생성한 후 root-context.xml 의
//	<context:component-scan base-package="kr.pe.myblog.front.dao"></context:component-scan> 
//	추가 필요

public interface FrontinfoDAO {

	List<FrontinfoVO> selectFrontinfo() throws Exception;

}
