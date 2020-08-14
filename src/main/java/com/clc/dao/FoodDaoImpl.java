package com.clc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.clc.model.FoodModel;

public class FoodDaoImpl implements FoodDaoInterface {
	private DataSource ds;
	
	public int save(FoodModel fd) throws SQLException {
		Connection con = ds.getConnection();
		String sql = "INSERT INTO purchases(uservname, order_type, price) VALUES (?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, fd.getUservname());
		ps.setString(2, fd.getOrder_type());
		ps.setInt(3, fd.getPrice());
		
		int i = ps.executeUpdate();
		con.close();
		return i;
	}

	public int update(FoodModel fd) {
		// TODO Auto-generated method stub
		return 0;
	}

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}


}
