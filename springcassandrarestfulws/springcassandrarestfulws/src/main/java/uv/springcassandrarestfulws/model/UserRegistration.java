/**
 * 
 */
package uv.springcassandrarestfulws.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import com.datastax.driver.mapping.annotations.Frozen;



/**
 * @author A.Riaydh
 *
 */
@Table
public class UserRegistration {
	 @PrimaryKey(value="userRegistrationId") 
	 Long userRegistrationId;
	 Long userAddressId;
	 String userRegistrationFName;
	 String userRegistrationMName;
	 String userRegistrationLName;
	 String userRegistrationName;
	 String userRegistrationPassword;
	 String userRegistrationfullName;
	 Date   userRegistrationCrDate;
	 Date userRegistrationLDate;
	 
	 @Frozen
	 List<UserRole> userRoleUDTs=new ArrayList<UserRole>();
	

	public List<UserRole> getUserRoleUDTs() {
		return userRoleUDTs;
	}

	public void setUserRoleUDTs(List<UserRole> userRoleUDTs) {
		this.userRoleUDTs = userRoleUDTs;
	}

	public Long getUserRegistrationId() {
		return userRegistrationId;
	}

	public void setUserRegistrationId(Long userRegistrationId) {
		this.userRegistrationId = userRegistrationId;
	}

	public Long getUserAddressId() {
		return userAddressId;
	}

	public void setUserAddressId(Long userAddressId) {
		this.userAddressId = userAddressId;
	}

	public String getUserRegistrationFName() {
		return userRegistrationFName;
	}

	public void setUserRegistrationFName(String userRegistrationFName) {
		this.userRegistrationFName = userRegistrationFName;
	}

	public String getUserRegistrationMName() {
		return userRegistrationMName;
	}

	public void setUserRegistrationMName(String userRegistrationMName) {
		this.userRegistrationMName = userRegistrationMName;
	}

	public String getUserRegistrationLName() {
		return userRegistrationLName;
	}

	public void setUserRegistrationLName(String userRegistrationLName) {
		this.userRegistrationLName = userRegistrationLName;
	}

	public String getUserRegistrationName() {
		return userRegistrationName;
	}

	public void setUserRegistrationName(String userRegistrationName) {
		this.userRegistrationName = userRegistrationName;
	}

	public String getUserRegistrationPassword() {
		return userRegistrationPassword;
	}

	public void setUserRegistrationPassword(String userRegistrationPassword) {
		this.userRegistrationPassword = userRegistrationPassword;
	}

	public String getUserRegistrationfullName() {
		return userRegistrationfullName;
	}

	public void setUserRegistrationfullName(String userRegistrationfullName) {
		this.userRegistrationfullName = userRegistrationfullName;
	}

	public Date getUserRegistrationCrDate() {
		return userRegistrationCrDate;
	}

	public void setUserRegistrationCrDate(Date userRegistrationCrDate) {
		this.userRegistrationCrDate = userRegistrationCrDate;
	}

	public Date getUserRegistrationLDate() {
		return userRegistrationLDate;
	}

	public void setUserRegistrationLDate(Date userRegistrationLDate) {
		this.userRegistrationLDate = userRegistrationLDate;
	}

	
	 
}
