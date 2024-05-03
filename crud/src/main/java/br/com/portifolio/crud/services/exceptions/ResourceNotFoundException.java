package br.com.portifolio.crud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Não localizamos um usuario com id " + id);

	}
}
