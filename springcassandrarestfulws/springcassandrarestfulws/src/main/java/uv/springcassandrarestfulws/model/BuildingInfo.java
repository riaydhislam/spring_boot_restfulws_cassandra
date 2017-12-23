/**
 * 
 */
package uv.springcassandrarestfulws.model;

import java.math.BigDecimal;
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
public class BuildingInfo {
	@PrimaryKey(value="buId") 
	Long buId;
	Long buAddressId;
	Long buPlId;
	String buCode;
	String buName;
	String buUseType;
	BigDecimal buNumberOfFloor;
	BigDecimal buTotalHeight;
	BigDecimal buNumberOfFloorUnit;
	BigDecimal buTotalGroundArea;
	BigDecimal buTotalFloorArea;
	BigDecimal buSetBackFront;
	BigDecimal buSetBackBack;
	BigDecimal buSetBackRight;
	BigDecimal buSetBackLeft;
	BigDecimal buCenterLongitude;
	BigDecimal buCenterLatitude;
	String buLayoutPicture;
	String buRemark;
	
	public Long getBuId() {
		return buId;
	}
	public void setBuId(Long buId) {
		this.buId = buId;
	}
	public Long getBuAddressId() {
		return buAddressId;
	}
	public void setBuAddressId(Long buAddressId) {
		this.buAddressId = buAddressId;
	}
	public Long getBuPlId() {
		return buPlId;
	}
	public void setBuPlId(Long buPlId) {
		this.buPlId = buPlId;
	}
	public String getBuCode() {
		return buCode;
	}
	public void setBuCode(String buCode) {
		this.buCode = buCode;
	}
	public String getBuName() {
		return buName;
	}
	public void setBuName(String buName) {
		this.buName = buName;
	}
	public String getBuUseType() {
		return buUseType;
	}
	public void setBuUseType(String buUseType) {
		this.buUseType = buUseType;
	}
	public BigDecimal getBuNumberOfFloor() {
		return buNumberOfFloor;
	}
	public void setBuNumberOfFloor(BigDecimal buNumberOfFloor) {
		this.buNumberOfFloor = buNumberOfFloor;
	}
	public BigDecimal getBuTotalHeight() {
		return buTotalHeight;
	}
	public void setBuTotalHeight(BigDecimal buTotalHeight) {
		this.buTotalHeight = buTotalHeight;
	}
	public BigDecimal getBuNumberOfFloorUnit() {
		return buNumberOfFloorUnit;
	}
	public void setBuNumberOfFloorUnit(BigDecimal buNumberOfFloorUnit) {
		this.buNumberOfFloorUnit = buNumberOfFloorUnit;
	}
	public BigDecimal getBuTotalGroundArea() {
		return buTotalGroundArea;
	}
	public void setBuTotalGroundArea(BigDecimal buTotalGroundArea) {
		this.buTotalGroundArea = buTotalGroundArea;
	}
	public BigDecimal getBuTotalFloorArea() {
		return buTotalFloorArea;
	}
	public void setBuTotalFloorArea(BigDecimal buTotalFloorArea) {
		this.buTotalFloorArea = buTotalFloorArea;
	}
	public BigDecimal getBuSetBackFront() {
		return buSetBackFront;
	}
	public void setBuSetBackFront(BigDecimal buSetBackFront) {
		this.buSetBackFront = buSetBackFront;
	}
	public BigDecimal getBuSetBackBack() {
		return buSetBackBack;
	}
	public void setBuSetBackBack(BigDecimal buSetBackBack) {
		this.buSetBackBack = buSetBackBack;
	}
	public BigDecimal getBuSetBackRight() {
		return buSetBackRight;
	}
	public void setBuSetBackRight(BigDecimal buSetBackRight) {
		this.buSetBackRight = buSetBackRight;
	}
	public BigDecimal getBuSetBackLeft() {
		return buSetBackLeft;
	}
	public void setBuSetBackLeft(BigDecimal buSetBackLeft) {
		this.buSetBackLeft = buSetBackLeft;
	}
	public BigDecimal getBuCenterLongitude() {
		return buCenterLongitude;
	}
	public void setBuCenterLongitude(BigDecimal buCenterLongitude) {
		this.buCenterLongitude = buCenterLongitude;
	}
	public BigDecimal getBuCenterLatitude() {
		return buCenterLatitude;
	}
	public void setBuCenterLatitude(BigDecimal buCenterLatitude) {
		this.buCenterLatitude = buCenterLatitude;
	}
	public String getBuLayoutPicture() {
		return buLayoutPicture;
	}
	public void setBuLayoutPicture(String buLayoutPicture) {
		this.buLayoutPicture = buLayoutPicture;
	}
	public String getBuRemark() {
		return buRemark;
	}
	public void setBuRemark(String buRemark) {
		this.buRemark = buRemark;
	}
	public List<BuildingInfoAuthorizationInfo> getBuildingInfoAuthorizationInfoUDTs() {
		return buildingInfoAuthorizationInfoUDTs;
	}
	public void setBuildingInfoAuthorizationInfoUDTs(
			List<BuildingInfoAuthorizationInfo> buildingInfoAuthorizationInfoUDTs) {
		this.buildingInfoAuthorizationInfoUDTs = buildingInfoAuthorizationInfoUDTs;
	}
	public List<BuildingInfoBillingInfo> getBuildingInfoBillingInfoUDTs() {
		return buildingInfoBillingInfoUDTs;
	}
	public void setBuildingInfoBillingInfoUDTs(
			List<BuildingInfoBillingInfo> buildingInfoBillingInfoUDTs) {
		this.buildingInfoBillingInfoUDTs = buildingInfoBillingInfoUDTs;
	}
	public List<BuildingInfoOwnershipInfo> getBuildingInfoOwnershipInfoUDTs() {
		return buildingInfoOwnershipInfoUDTs;
	}
	public void setBuildingInfoOwnershipInfoUDTs(
			List<BuildingInfoOwnershipInfo> buildingInfoOwnershipInfoUDTs) {
		this.buildingInfoOwnershipInfoUDTs = buildingInfoOwnershipInfoUDTs;
	}
	public List<BuildingInfoPaymentInfo> getBuildingInfoPaymentInfoUDTs() {
		return buildingInfoPaymentInfoUDTs;
	}
	public void setBuildingInfoPaymentInfoUDTs(
			List<BuildingInfoPaymentInfo> buildingInfoPaymentInfoUDTs) {
		this.buildingInfoPaymentInfoUDTs = buildingInfoPaymentInfoUDTs;
	}
	public List<BuildingInfoUtilityInfo> getBuildingInfoUtilityInfoUDTs() {
		return buildingInfoUtilityInfoUDTs;
	}
	public void setBuildingInfoUtilityInfoUDTs(
			List<BuildingInfoUtilityInfo> buildingInfoUtilityInfoUDTs) {
		this.buildingInfoUtilityInfoUDTs = buildingInfoUtilityInfoUDTs;
	}
	@Frozen
	List<BuildingInfoAuthorizationInfo> buildingInfoAuthorizationInfoUDTs= new ArrayList<BuildingInfoAuthorizationInfo>();
	@Frozen
	List<BuildingInfoBillingInfo> buildingInfoBillingInfoUDTs = new ArrayList<BuildingInfoBillingInfo>();
	@Frozen
	List<BuildingInfoOwnershipInfo> buildingInfoOwnershipInfoUDTs = new ArrayList<BuildingInfoOwnershipInfo>();
	@Frozen
	List<BuildingInfoPaymentInfo> buildingInfoPaymentInfoUDTs = new ArrayList<BuildingInfoPaymentInfo>();
	@Frozen
	List<BuildingInfoUtilityInfo> buildingInfoUtilityInfoUDTs = new ArrayList<BuildingInfoUtilityInfo>();
	
	
	
	
	
	
	
}
