package com.clc.dao;

import java.sql.SQLException;

import com.clc.model.FoodModel;

public interface FoodDaoInterface {
	int save(FoodModel fd) throws SQLException;
	int update(FoodModel fd) throws SQLException;
}
