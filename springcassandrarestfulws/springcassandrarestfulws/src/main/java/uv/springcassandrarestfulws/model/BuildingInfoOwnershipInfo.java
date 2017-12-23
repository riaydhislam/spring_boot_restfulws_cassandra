/**
 * 
 */
package uv.springcassandrarestfulws.model;

import java.util.Date;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;
import org.springframework.data.cassandra.mapping.UserDefinedType;

import com.datastax.driver.mapping.annotations.UDT;

/**
 * @author A.Riaydh
 *
 */
@UserDefinedType
@UDT(name="buildingInfoOwnershipInfoUDT",keyspace="springcassandrarestfulws")
@Table
public class BuildingInfoOwnershipInfo {
	@PrimaryKey(value="owId")
	Long owId;
	Long owAddressId;
	String owFullName;
	String owType;
	Date owAppliedDate;
	Date owLastModifiedDate;
	Date owApprovedDate;
	String owStatus;
	String owRemark;
	Long owBuId;
	
	
	
	public BuildingInfoOwnershipInfo() {
		super();
	}
	
	
	
	public Long getOwId() {
		return owId;
	}
	public void setOwId(Long owId) {
		this.owId = owId;
	}
	public Long getOwAddressId() {
		return owAddressId;
	}
	public void setOwAddressId(Long owAddressId) {
		this.owAddressId = owAddressId;
	}
	public String getOwFullName() {
		return owFullName;
	}
	public void setOwFullName(String owFullName) {
		this.owFullName = owFullName;
	}
	public String getOwType() {
		return owType;
	}
	public void setOwType(String owType) {
		this.owType = owType;
	}
	public Date getOwAppliedDate() {
		return owAppliedDate;
	}
	public void setOwAppliedDate(Date owAppliedDate) {
		this.owAppliedDate = owAppliedDate;
	}
	public Date getOwLastModifiedDate() {
		return owLastModifiedDate;
	}
	public void setOwLastModifiedDate(Date owLastModifiedDate) {
		this.owLastModifiedDate = owLastModifiedDate;
	}
	public Date getOwApprovedDate() {
		return owApprovedDate;
	}
	public void setOwApprovedDate(Date owApprovedDate) {
		this.owApprovedDate = owApprovedDate;
	}
	public String getOwStatus() {
		return owStatus;
	}
	public void setOwStatus(String owStatus) {
		this.owStatus = owStatus;
	}
	public String getOwRemark() {
		return owRemark;
	}
	public void setOwRemark(String owRemark) {
		this.owRemark = owRemark;
	}
	public Long getOwBuId() {
		return owBuId;
	}
	public void setOwBuId(Long owBuId) {
		this.owBuId = owBuId;
	}

}
