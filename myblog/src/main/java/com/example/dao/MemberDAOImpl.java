package com.example.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.dto.MemberVO;

import kr.pe.myblog.front.dto.FrontinfoVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.example.mapper.memberMapper";
	
	@Override
	public List<MemberVO> selectMember() throws Exception {

		return sqlSession.selectList(Namespace+".selectMember");
	}

	@Override
	public int selectMemberCnt() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(Namespace+".selectMemberCnt");
	}

	@Override
	public String selectMemberName() {
		// TODO Auto-generated method stub
		// Map 파라미터 쿼리로 넘기기
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("id", "arduino2");
		param.put("pw", "arduino2");
		
		return sqlSession.selectOne(Namespace+".selectMemberName", param);
	}

	@Override
	public MemberVO selectMemberInfo(String id) {
		// TODO Auto-generated method stub
		MemberVO member = new MemberVO();
		member.setId(id);

		return sqlSession.selectOne(Namespace+".selectMemberInfo", member);
	}

	@Override
	public List<FrontinfoVO> selectFrontinfo() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(Namespace+".selectFrontinfo");
	}

}
