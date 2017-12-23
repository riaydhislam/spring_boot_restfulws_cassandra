/**
 * 
 */
package uv.springcassandrarestfulws.utility;


/**
 * @author A.Riaydh
 *
 */
public class LoggerUtility {

	
public String numberOfRecordFound(int size){
	return String.format("Number of record found with above search criteria(s):%S",size);
}
public String existId(boolean check){
	return String.format("Primary key or id existance check in database:%S",check);
}

public String existId(){
	return String.format("Primary key or id is already exist in database!");
}

public String isNotExistId(){
	return String.format("Primary key or id is not exist in database!");
}

public String primaryKeyId(long id){
	return String.format("Input search primary key:%S",id);
}

public String noOfRecordFound(){
	return String.format("No of record found with above search criteria(s)!");
}

}
