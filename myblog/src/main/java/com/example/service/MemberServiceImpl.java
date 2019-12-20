package com.example.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.dao.MemberDAO;
import com.example.dto.MemberVO;

import kr.pe.myblog.front.dto.FrontinfoVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO dao;
	
	@Override
	public List<MemberVO> selectMember() throws Exception {

		return dao.selectMember();
	}

	@Override
	public int selectMemberCnt() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectMemberCnt();
	}

	@Override
	public String selectMemberName() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectMemberName();
	}

	@Override
	public MemberVO selectMemberInfo(String id) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectMemberInfo(id);
	}

	@Override
	public List<FrontinfoVO> selectFrontinfo() {
		// TODO Auto-generated method stub
		return dao.selectFrontinfo();
	}

}
