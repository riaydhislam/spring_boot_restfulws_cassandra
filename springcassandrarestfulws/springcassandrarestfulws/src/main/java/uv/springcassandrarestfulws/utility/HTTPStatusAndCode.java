/**
 * 
 */
package uv.springcassandrarestfulws.utility;

/**
 * @author A.Riaydh
 *
 */
public enum HTTPStatusAndCode {
	OK(200), 
	No_Content(204);
	
    private final int code;
    
    HTTPStatusAndCode(int code) { 
    	this.code = code; 
    	}
    public int getValue() { 
    	return code; 
    	
    }
}
