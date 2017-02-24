package com.coolcuy.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.coolcuy.dao.MemberDao;
import com.coolcuy.dto.MemberDto;

public class testMemberDao implements MemberDao{

	@Override
	public int add(MemberDto object, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String element, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll(Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(MemberDto object, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberDto get(String element, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDto> getAll(Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkDuplicate(String email, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount(Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int checkPassword(String email, String password, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
