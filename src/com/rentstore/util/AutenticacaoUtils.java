package com.rentstore.util;

import com.rentstore.model.Funcionario;

public class AutenticacaoUtils {
		
	/**
	 * Método de autenticação do usuário
	 * @param {@link Funcionario} func 
	 * @param String senha
	 * @return boolean
	 * @author Jean
	 */
	public static boolean autenticarLogin(Funcionario func, String senha){
		return func.getSenha().equals(senha);				
	}

}
