package com.coolcuy.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.coolcuy.dao.RentDao;
import com.coolcuy.dao.RentDaoImpl;
import com.coolcuy.dto.CarDto;
import com.coolcuy.dto.RentDto;
import com.coolcuy.exception.NotSupportedException;
import com.coolcuy.jdbc.connection.ConnectionProvider;
import com.coolcuy.util.JdbcUtil;

public class RentServiceImpl implements RentService{
	private RentDao dao = new RentDaoImpl();
		
	@Override
	public int add(RentDto object) {
		Connection conn = null;
		int x = -1;
		
		try {
			conn = ConnectionProvider.getConnection();
			x = dao.add(object, conn);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			JdbcUtil.close(conn);
		}
		
		return x;
	}

	@Override
	public int delete(int element) {
		Connection conn = null;
		int x = -1;
		
		try {
			conn = ConnectionProvider.getConnection();
			x = dao.delete(element, conn);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			JdbcUtil.close(conn);
		}
		
		return x;
	}

	@Override
	public int deleteAll() {
		Connection conn = null;
		int x = -1;
		
		try {
			conn = ConnectionProvider.getConnection();
			x = dao.deleteAll(conn);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			JdbcUtil.close(conn);
		}
		
		return x;
	}

	@Override
	public RentDto get(int element) {
		Connection conn = null;
		RentDto getRent = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			getRent = dao.get(element, conn);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			JdbcUtil.close(conn);
		}
		
		return getRent;
	}

	@Override
	public List<RentDto> getAll() {
		Connection conn = null;
		List<RentDto> getRents = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			getRents = dao.getAll(conn);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			JdbcUtil.close(conn);
		}
		
		return getRents;
	}

	@Override
	public List<CarDto> getRentAbleCar(String spot, String type, String startDate, String endDate) {
		Connection conn = null;
		List<CarDto> getCars = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			getCars = dao.getRentAbleCar(spot, startDate, endDate, type, conn);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			JdbcUtil.close(conn);
		}
		
		return getCars;
	}
	
	@Override
	public RentDto update(RentDto object) {
		throw new NotSupportedException();
	}
}
