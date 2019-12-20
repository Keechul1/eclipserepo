package kr.pe.myblog.team.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.pe.myblog.team.dto.TeaminfoVO;

//DAOImpl 추가 : DAO 인터페이스 구현 후
//@repository 어노테이션 필요
//mappers폴더 하부에 teaminfoMapper.xml 생성이 필요함!!!

@Repository
public class TeaminfoDAOImpl implements TeaminfoDAO {
	
	// SqlSession 추가 후 @Inject 어노테이션 추가 필요
	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace 
	= "kr.pe.myblog.mappers.team.teaminfoMapper";

	@Override
	public List<TeaminfoVO> selectTeaminfo() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(Namespace + ".selectTeaminfo");
	}

}
