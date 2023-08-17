package ninomal.comp.corse.resource.exception;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Instant timeInstate;
	private Integer status;
	private String error;
	private String  messanger;
	private String path;

	public StandardError() {
	}

	public StandardError(Instant timeInstate, Integer status, String error, String messanger, String path) {
		this.timeInstate = timeInstate;
		this.status = status;
		this.error = error;
		this.messanger = messanger;
		this.path = path;
	}

	public Instant getTimeInstate() {
		return timeInstate;
	}

	public void setTimeInstate(Instant timeInstate) {
		this.timeInstate = timeInstate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessanger() {
		return messanger;
	}

	public void setMessanger(String messanger) {
		this.messanger = messanger;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
