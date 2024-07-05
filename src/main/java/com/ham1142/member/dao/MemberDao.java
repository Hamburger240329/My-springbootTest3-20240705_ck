package com.ham1142.member.dao;

import java.util.ArrayList;

import com.ham1142.member.dto.MemberDto;

public interface MemberDao {

	public void joinDao(String mid, String mpw, String mname, String memail); // 회원 가입
	
	public int checkIdDao(String mid); // 회원가입여부
	
	public ArrayList<MemberDto> memberListDao();//모든 회원 목록 출력
	
	public void deleteDao(String mid);//회원 삭제
	
	
}
