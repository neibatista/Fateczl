package br.sceweb.modelo;

import org.apache.log4j.Logger;

public class EmpresaDAO {
	Logger logger = Logger.getLogger(EmpresaDAO.class);
		public int adiciona(Empresa empresa){
			logger.info("chamou o m�todo adiciona");
			return 1;
	}
}