package com.solvd.mavenUberCarService.jdbc.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.mavenUberCarService.carServices.Admin;
import com.solvd.mavenUberCarService.jdbc.dao.ModelsDAO;
import com.solvd.mavenUberCarService.jdbc.dto.ModelsDTO;

public class Test {
	private final static Logger LOGGER = LogManager.getLogger(Admin.class);


	public static void main (String []args) {
		ModelsDAO mdao = new ModelsDAO();
		
		ModelsDTO mdto = mdao.read("1");
		LOGGER.debug("logger");
		System.out.print("The model for that ID is: ");
		System.out.print(mdto.getDescription());
	}

}
