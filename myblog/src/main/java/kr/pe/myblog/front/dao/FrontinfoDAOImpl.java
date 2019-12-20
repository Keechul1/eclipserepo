package kr.pe.myblog.front.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.pe.myblog.front.dto.FrontinfoVO;

// DAOImpl 추가 : DAO 인터페이스 구현 후
// @repository 어노테이션 필요
// mappers폴더 하부에 frontinfoMapper.xml 생성이 필요함!!!

@Repository
public class FrontinfoDAOImpl implements FrontinfoDAO {
	
	// SqlSession 추가 후 @Inject 어노테이션 추가 필요
	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "kr.pe.myblog.mappers.front.frontinfoMapper";

	@Override
	public List<FrontinfoVO> selectFrontinfo() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(Namespace + ".selectFrontinfo");
	}

}
