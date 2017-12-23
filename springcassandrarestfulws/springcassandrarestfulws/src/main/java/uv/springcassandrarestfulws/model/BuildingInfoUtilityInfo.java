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
@UDT(name="buildingInfoUtilityInfoUDT",keyspace="springcassandrarestfulws")
@Table
public class BuildingInfoUtilityInfo {
	@PrimaryKey(value="utId")
	Long utId;
	Long utCreaterAddressId;
	String utType;
	String utCreaterName;
	String utCreaterAuthority;
	Date utCreateDate;
	Date utLastModifiedDate;
	Date utSubmissionDate;
	Date utApprovalDate;
	Date utServiceDate;
	Date utDisServiceDate;
	String utTypePic;
	String utRemark;
	Long utBuId;
	
	
	public BuildingInfoUtilityInfo() {
		super();
	}
	
	
	public Long getUtId() {
		return utId;
	}
	public void setUtId(Long utId) {
		this.utId = utId;
	}
	public Long getUtCreaterAddressId() {
		return utCreaterAddressId;
	}
	public void setUtCreaterAddressId(Long utCreaterAddressId) {
		this.utCreaterAddressId = utCreaterAddressId;
	}
	public String getUtType() {
		return utType;
	}
	public void setUtType(String utType) {
		this.utType = utType;
	}
	public String getUtCreaterName() {
		return utCreaterName;
	}
	public void setUtCreaterName(String utCreaterName) {
		this.utCreaterName = utCreaterName;
	}
	public String getUtCreaterAuthority() {
		return utCreaterAuthority;
	}
	public void setUtCreaterAuthority(String utCreaterAuthority) {
		this.utCreaterAuthority = utCreaterAuthority;
	}
	public Date getUtCreateDate() {
		return utCreateDate;
	}
	public void setUtCreateDate(Date utCreateDate) {
		this.utCreateDate = utCreateDate;
	}
	public Date getUtLastModifiedDate() {
		return utLastModifiedDate;
	}
	public void setUtLastModifiedDate(Date utLastModifiedDate) {
		this.utLastModifiedDate = utLastModifiedDate;
	}
	public Date getUtSubmissionDate() {
		return utSubmissionDate;
	}
	public void setUtSubmissionDate(Date utSubmissionDate) {
		this.utSubmissionDate = utSubmissionDate;
	}
	public Date getUtApprovalDate() {
		return utApprovalDate;
	}
	public void setUtApprovalDate(Date utApprovalDate) {
		this.utApprovalDate = utApprovalDate;
	}
	public Date getUtServiceDate() {
		return utServiceDate;
	}
	public void setUtServiceDate(Date utServiceDate) {
		this.utServiceDate = utServiceDate;
	}
	public Date getUtDisServiceDate() {
		return utDisServiceDate;
	}
	public void setUtDisServiceDate(Date utDisServiceDate) {
		this.utDisServiceDate = utDisServiceDate;
	}
	public String getUtTypePic() {
		return utTypePic;
	}
	public void setUtTypePic(String utTypePic) {
		this.utTypePic = utTypePic;
	}
	public String getUtRemark() {
		return utRemark;
	}
	public void setUtRemark(String utRemark) {
		this.utRemark = utRemark;
	}
	public Long getUtBuId() {
		return utBuId;
	}
	public void setUtBuId(Long utBuId) {
		this.utBuId = utBuId;
	}

}
