/**
 * 
 */
package uv.springcassandrarestfulws.utility;

import java.io.Serializable;

/**
 * @author A.Riaydh
 *
 */
public class ResultTO implements Serializable {
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
String status;
boolean message;
Long code;
Long id;


public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public boolean getMessage() {
	return message;
}
public void setMessage(boolean message) {
	this.message = message;
}
public Long getCode() {
	return code;
}
public void setCode(Long code) {
	this.code = code;
}


}
