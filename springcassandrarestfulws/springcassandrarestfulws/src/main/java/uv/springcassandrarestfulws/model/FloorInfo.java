/**
 * 
 */
package uv.springcassandrarestfulws.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import com.datastax.driver.mapping.annotations.Frozen;

/**
 * @author A.Riaydh
 *
 */
@Table
public class FloorInfo {
	@PrimaryKey(value="flId")
	Long flId;
	Long flBuId;
	Long flAddressId;
	String flCode;
	String flName;
	String flUseType;
	Double flNumberOfFloorUnit;
	Double flTotalFloorArea;
	Double flTotalFloorHeight;
	Double flCenterLongitude;
	Double flCenterLatitude;
	String flLayoutPicture;
	String flRemark;
	
	
	
	public Long getFlId() {
		return flId;
	}


	public void setFlId(Long flId) {
		this.flId = flId;
	}


	public Long getFlBuId() {
		return flBuId;
	}


	public void setFlBuId(Long flBuId) {
		this.flBuId = flBuId;
	}


	public Long getFlAddressId() {
		return flAddressId;
	}


	public void setFlAddressId(Long flAddressId) {
		this.flAddressId = flAddressId;
	}


	public String getFlCode() {
		return flCode;
	}


	public void setFlCode(String flCode) {
		this.flCode = flCode;
	}


	public String getFlName() {
		return flName;
	}


	public void setFlName(String flName) {
		this.flName = flName;
	}


	public String getFlUseType() {
		return flUseType;
	}


	public void setFlUseType(String flUseType) {
		this.flUseType = flUseType;
	}


	public Double getFlNumberOfFloorUnit() {
		return flNumberOfFloorUnit;
	}


	public void setFlNumberOfFloorUnit(Double flNumberOfFloorUnit) {
		this.flNumberOfFloorUnit = flNumberOfFloorUnit;
	}


	public Double getFlTotalFloorArea() {
		return flTotalFloorArea;
	}


	public void setFlTotalFloorArea(Double flTotalFloorArea) {
		this.flTotalFloorArea = flTotalFloorArea;
	}


	public Double getFlTotalFloorHeight() {
		return flTotalFloorHeight;
	}


	public void setFlTotalFloorHeight(Double flTotalFloorHeight) {
		this.flTotalFloorHeight = flTotalFloorHeight;
	}


	public Double getFlCenterLongitude() {
		return flCenterLongitude;
	}


	public void setFlCenterLongitude(Double flCenterLongitude) {
		this.flCenterLongitude = flCenterLongitude;
	}


	public Double getFlCenterLatitude() {
		return flCenterLatitude;
	}


	public void setFlCenterLatitude(Double flCenterLatitude) {
		this.flCenterLatitude = flCenterLatitude;
	}


	public String getFlLayoutPicture() {
		return flLayoutPicture;
	}


	public void setFlLayoutPicture(String flLayoutPicture) {
		this.flLayoutPicture = flLayoutPicture;
	}


	public String getFlRemark() {
		return flRemark;
	}


	public void setFlRemark(String flRemark) {
		this.flRemark = flRemark;
	}


	public List<FloorInfoAuthorizationInfo> getFloorInfoAuthorizationInfoUDTs() {
		return floorInfoAuthorizationInfoUDTs;
	}


	public void setFloorInfoAuthorizationInfoUDTs(
			List<FloorInfoAuthorizationInfo> floorInfoAuthorizationInfoUDTs) {
		this.floorInfoAuthorizationInfoUDTs = floorInfoAuthorizationInfoUDTs;
	}


	public List<FloorInfoBillingInfo> getFloorInfoBillingInfoUDTs() {
		return floorInfoBillingInfoUDTs;
	}


	public void setFloorInfoBillingInfoUDTs(
			List<FloorInfoBillingInfo> floorInfoBillingInfoUDTs) {
		this.floorInfoBillingInfoUDTs = floorInfoBillingInfoUDTs;
	}


	public List<FloorInfoOwnershipInfo> getFloorInfoOwnershipInfoUDTs() {
		return floorInfoOwnershipInfoUDTs;
	}


	public void setFloorInfoOwnershipInfoUDTs(
			List<FloorInfoOwnershipInfo> floorInfoOwnershipInfoUDTs) {
		this.floorInfoOwnershipInfoUDTs = floorInfoOwnershipInfoUDTs;
	}


	public List<FloorInfoPaymentInfo> getFloorInfoPaymentInfoUDTs() {
		return floorInfoPaymentInfoUDTs;
	}


	public void setFloorInfoPaymentInfoUDTs(
			List<FloorInfoPaymentInfo> floorInfoPaymentInfoUDTs) {
		this.floorInfoPaymentInfoUDTs = floorInfoPaymentInfoUDTs;
	}


	public List<FloorInfoUtilityInfo> getFloorInfoUtilityInfoUDTs() {
		return FloorInfoUtilityInfoUDTs;
	}


	public void setFloorInfoUtilityInfoUDTs(
			List<FloorInfoUtilityInfo> floorInfoUtilityInfoUDTs) {
		FloorInfoUtilityInfoUDTs = floorInfoUtilityInfoUDTs;
	}


	@Frozen
	List <FloorInfoAuthorizationInfo> floorInfoAuthorizationInfoUDTs = new ArrayList<FloorInfoAuthorizationInfo>();
	@Frozen
	List<FloorInfoBillingInfo> floorInfoBillingInfoUDTs = new ArrayList<FloorInfoBillingInfo>();
	@Frozen
	List <FloorInfoOwnershipInfo> floorInfoOwnershipInfoUDTs = new ArrayList<FloorInfoOwnershipInfo>();
	@Frozen
	List<FloorInfoPaymentInfo> floorInfoPaymentInfoUDTs = new ArrayList<FloorInfoPaymentInfo>();
	@Frozen
	List<FloorInfoUtilityInfo> FloorInfoUtilityInfoUDTs = new ArrayList<FloorInfoUtilityInfo>();
	

	public FloorInfo() {
		super();
		
		
	

}
}
