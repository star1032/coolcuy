package com.coolcuy.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface TransGenericDao<T>{
	public int add(T object, Connection conn) throws SQLException;
	public int delete(int element, Connection conn) throws SQLException;
	public int deleteAll(Connection conn) throws SQLException;
	public int update(T object, Connection conn) throws SQLException;
	public T get(int element, Connection conn) throws SQLException;
	public List<T> getAll(Connection conn) throws SQLException;
}
