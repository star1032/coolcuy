package com.coolcuy.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.coolcuy.dto.SpotDto;

public interface SpotDao extends GenericDao<SpotDto> {
	int getCount(Connection conn) throws SQLException;
}
