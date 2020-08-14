package com.clc.bo;

import java.sql.SQLException;

import com.clc.model.FoodModel;

public interface FoodBusinessInterface {
	int save(FoodModel fd) throws SQLException;
	int update(FoodModel fd) throws SQLException;
}
