package jdbc.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import carServices.Admin;
import jdbc.dao.ModelsDAO;
import jdbc.dto.ModelsDTO;

public class Prueba {
	private final static Logger LOGGER = LogManager.getLogger(Admin.class);


	public static void main (String []args) {
		ModelsDAO mdao = new ModelsDAO();
		
		ModelsDTO mdto = mdao.read("1");
		LOGGER.debug("logger");
		System.out.print("The model for that ID is: ");
		System.out.print(mdto.getDescription());
	}

}
