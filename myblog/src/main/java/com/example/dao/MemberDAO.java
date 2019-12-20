package com.example.dao;

import java.util.List;

import com.example.dto.MemberVO;

import kr.pe.myblog.front.dto.FrontinfoVO;

public interface MemberDAO {
	
	public List<MemberVO> selectMember() throws Exception;

	public int selectMemberCnt() throws Exception;

	public String selectMemberName() throws Exception;

	public MemberVO selectMemberInfo(String id) throws Exception;

	public List<FrontinfoVO> selectFrontinfo();
}
