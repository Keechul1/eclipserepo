package com.example.service;

import java.util.List;

import com.example.dto.MemberVO;

import kr.pe.myblog.front.dto.FrontinfoVO;

public interface MemberService {
	
	// 회원목록 출력
	public List<MemberVO> selectMember() throws Exception;

	// 회원수 출력
	public int selectMemberCnt() throws Exception;
	
	// 회원명 출력
	public String selectMemberName() throws Exception;
	
	// 회원정보
	public MemberVO selectMemberInfo(String id) throws Exception;

	// 카드목록
	public List<FrontinfoVO> selectFrontinfo();
}
