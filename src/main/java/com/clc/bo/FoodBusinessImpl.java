package com.clc.bo;

import java.sql.SQLException;

import com.clc.dao.FoodDaoImpl;
import com.clc.model.FoodModel;

public class FoodBusinessImpl implements FoodBusinessInterface {
	private FoodDaoImpl foodDao;
	
	public int save(FoodModel fd) throws SQLException {
		return foodDao.save(fd);
	}

	public int update(FoodModel fd) {
		// TODO Auto-generated method stub
		return 0;
	}

	public FoodDaoImpl getFoodDao() {
		return foodDao;
	}

	public void setFoodDao(FoodDaoImpl foodDao) {
		this.foodDao = foodDao;
	}

}
