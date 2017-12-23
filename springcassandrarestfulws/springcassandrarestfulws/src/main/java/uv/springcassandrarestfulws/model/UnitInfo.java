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
public class UnitInfo {
	@PrimaryKey(value="unId")
	Long unId;
	Long unflId;
	Long unAddressId;
	String unCode;
	String unName;
	String unUseType;
	Double unNumberOfFloorUnit;
	Double unTotalUnitArea;
	Double unTotalHeight;
	Double unCenterLongitude;
	Double unCenterLatitude;
	String unLayoutPicture;
	String unRemark;
	
	public Long getUnId() {
		return unId;
	}
	public void setUnId(Long unId) {
		this.unId = unId;
	}
	public Long getUnflId() {
		return unflId;
	}
	public void setUnflId(Long unflId) {
		this.unflId = unflId;
	}
	public Long getUnAddressId() {
		return unAddressId;
	}
	public void setUnAddressId(Long unAddressId) {
		this.unAddressId = unAddressId;
	}
	public String getUnCode() {
		return unCode;
	}
	public void setUnCode(String unCode) {
		this.unCode = unCode;
	}
	public String getUnName() {
		return unName;
	}
	public void setUnName(String unName) {
		this.unName = unName;
	}
	public String getUnUseType() {
		return unUseType;
	}
	public void setUnUseType(String unUseType) {
		this.unUseType = unUseType;
	}
	public Double getUnNumberOfFloorUnit() {
		return unNumberOfFloorUnit;
	}
	public void setUnNumberOfFloorUnit(Double unNumberOfFloorUnit) {
		this.unNumberOfFloorUnit = unNumberOfFloorUnit;
	}
	public Double getUnTotalUnitArea() {
		return unTotalUnitArea;
	}
	public void setUnTotalUnitArea(Double unTotalUnitArea) {
		this.unTotalUnitArea = unTotalUnitArea;
	}
	public Double getUnTotalHeight() {
		return unTotalHeight;
	}
	public void setUnTotalHeight(Double unTotalHeight) {
		this.unTotalHeight = unTotalHeight;
	}
	public Double getUnCenterLongitude() {
		return unCenterLongitude;
	}
	public void setUnCenterLongitude(Double unCenterLongitude) {
		this.unCenterLongitude = unCenterLongitude;
	}
	public Double getUnCenterLatitude() {
		return unCenterLatitude;
	}
	public void setUnCenterLatitude(Double unCenterLatitude) {
		this.unCenterLatitude = unCenterLatitude;
	}
	public String getUnLayoutPicture() {
		return unLayoutPicture;
	}
	public void setUnLayoutPicture(String unLayoutPicture) {
		this.unLayoutPicture = unLayoutPicture;
	}
	public String getUnRemark() {
		return unRemark;
	}
	public void setUnRemark(String unRemark) {
		this.unRemark = unRemark;
	}
	public List<UnitInfoAuthorizationInfo> getUnitInfoAuthorizationInfoUDTs() {
		return unitInfoAuthorizationInfoUDTs;
	}
	public void setUnitInfoAuthorizationInfoUDTs(
			List<UnitInfoAuthorizationInfo> unitInfoAuthorizationInfoUDTs) {
		this.unitInfoAuthorizationInfoUDTs = unitInfoAuthorizationInfoUDTs;
	}
	public List<UnitInfoBillingInfo> getUnitInfoBillingInfoUDTs() {
		return unitInfoBillingInfoUDTs;
	}
	public void setUnitInfoBillingInfoUDTs(
			List<UnitInfoBillingInfo> unitInfoBillingInfoUDTs) {
		this.unitInfoBillingInfoUDTs = unitInfoBillingInfoUDTs;
	}
	public List<UnitInfoOwnershipInfo> getUnitInfoOwnershipInfoUDTs() {
		return unitInfoOwnershipInfoUDTs;
	}
	public void setUnitInfoOwnershipInfoUDTs(
			List<UnitInfoOwnershipInfo> unitInfoOwnershipInfoUDTs) {
		this.unitInfoOwnershipInfoUDTs = unitInfoOwnershipInfoUDTs;
	}
	public List<UnitInfoPaymentInfo> getUnitInfoPaymentInfoUDTs() {
		return unitInfoPaymentInfoUDTs;
	}
	public void setUnitInfoPaymentInfoUDTs(
			List<UnitInfoPaymentInfo> unitInfoPaymentInfoUDTs) {
		this.unitInfoPaymentInfoUDTs = unitInfoPaymentInfoUDTs;
	}
	public List<UnitInfoUtilityInfo> getUnitInfoUtilityInfoUDTs() {
		return unitInfoUtilityInfoUDTs;
	}
	public void setUnitInfoUtilityInfoUDTs(
			List<UnitInfoUtilityInfo> unitInfoUtilityInfoUDTs) {
		this.unitInfoUtilityInfoUDTs = unitInfoUtilityInfoUDTs;
	}
	@Frozen
	List<UnitInfoAuthorizationInfo> unitInfoAuthorizationInfoUDTs = new ArrayList<UnitInfoAuthorizationInfo>();
	@Frozen
	List<UnitInfoBillingInfo > unitInfoBillingInfoUDTs = new ArrayList<UnitInfoBillingInfo>();
	@Frozen
	List<UnitInfoOwnershipInfo> unitInfoOwnershipInfoUDTs = new ArrayList<UnitInfoOwnershipInfo>();
	@Frozen
	List<UnitInfoPaymentInfo> unitInfoPaymentInfoUDTs = new ArrayList<UnitInfoPaymentInfo>();
	@Frozen
	List<UnitInfoUtilityInfo> unitInfoUtilityInfoUDTs = new ArrayList<UnitInfoUtilityInfo>();
	
	
	
	
	

}
