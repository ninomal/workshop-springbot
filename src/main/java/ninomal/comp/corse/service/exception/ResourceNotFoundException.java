package ninomal.comp.corse.service.exception;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("value not found = " + id);
	}
	

}
