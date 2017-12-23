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
public class PlotInfo {
	@PrimaryKey(value="plId") 
	Long plId;
	Long plAddressId;
	String plCode;
	String plName;
	String plType;
	String plNumber;
	String plMonzaNumber;
	String plCSNumber;
	String plMSNumber;
	Double plTotalArea;
	Double plTotalBuildingCoverArea;
	Double plNumberOfBuilding;
	Double plHeightFromMSL;
	Double plCenterLongitude;
	Double plCenterLatitude;
	String plLayoutPicture;
	String utilityLocationMap;
	String plRemark;
	
	@Frozen
	List<PlotInfoAuthorizationInfo> plotInfoAuthrizationInfoUDTs=new ArrayList<PlotInfoAuthorizationInfo>();
	@Frozen
	List<PlotInfoOwnershipInfo> plotInfoOwnershipInfoUDTs=new ArrayList<PlotInfoOwnershipInfo>();
	@Frozen
	List<PlotInfoPaymentInfo> plotInfoPaymentInfoUDTs=new ArrayList<PlotInfoPaymentInfo>();
	@Frozen
	List<PlotInfoUtilityInfo> plotInfoUtilityInfoUDTs=new ArrayList<PlotInfoUtilityInfo>();
	@Frozen
	List<PlotInfoBillingInfo> plotInfoBillingInfoUDTs=new ArrayList<PlotInfoBillingInfo>();
	
	public Long getPlId() {
		return plId;
	}
	public void setPlId(Long plId) {
		this.plId = plId;
	}
	public Long getPlAddressId() {
		return plAddressId;
	}
	public void setPlAddressId(Long plAddressId) {
		this.plAddressId = plAddressId;
	}
	public String getPlCode() {
		return plCode;
	}
	public void setPlCode(String plCode) {
		this.plCode = plCode;
	}
	public String getPlName() {
		return plName;
	}
	public void setPlName(String plName) {
		this.plName = plName;
	}
	public String getPlType() {
		return plType;
	}
	public void setPlType(String plType) {
		this.plType = plType;
	}
	public String getPlNumber() {
		return plNumber;
	}
	public void setPlNumber(String plNumber) {
		this.plNumber = plNumber;
	}
	public String getPlMonzaNumber() {
		return plMonzaNumber;
	}
	public void setPlMonzaNumber(String plMonzaNumber) {
		this.plMonzaNumber = plMonzaNumber;
	}
	public String getPlCSNumber() {
		return plCSNumber;
	}
	public void setPlCSNumber(String plCSNumber) {
		this.plCSNumber = plCSNumber;
	}
	public String getPlMSNumber() {
		return plMSNumber;
	}
	public void setPlMSNumber(String plMSNumber) {
		this.plMSNumber = plMSNumber;
	}
	public Double getPlTotalArea() {
		return plTotalArea;
	}
	public void setPlTotalArea(Double plTotalArea) {
		this.plTotalArea = plTotalArea;
	}
	public Double getPlTotalBuildingCoverArea() {
		return plTotalBuildingCoverArea;
	}
	public void setPlTotalBuildingCoverArea(Double plTotalBuildingCoverArea) {
		this.plTotalBuildingCoverArea = plTotalBuildingCoverArea;
	}
	public Double getPlNumberOfBuilding() {
		return plNumberOfBuilding;
	}
	public void setPlNumberOfBuilding(Double plNumberOfBuilding) {
		this.plNumberOfBuilding = plNumberOfBuilding;
	}
	public Double getPlHeightFromMSL() {
		return plHeightFromMSL;
	}
	public void setPlHeightFromMSL(Double plHeightFromMSL) {
		this.plHeightFromMSL = plHeightFromMSL;
	}
	public Double getPlCenterLongitude() {
		return plCenterLongitude;
	}
	public void setPlCenterLongitude(Double plCenterLongitude) {
		this.plCenterLongitude = plCenterLongitude;
	}
	public Double getPlCenterLatitude() {
		return plCenterLatitude;
	}
	public void setPlCenterLatitude(Double plCenterLatitude) {
		this.plCenterLatitude = plCenterLatitude;
	}
	public String getPlLayoutPicture() {
		return plLayoutPicture;
	}
	public void setPlLayoutPicture(String plLayoutPicture) {
		this.plLayoutPicture = plLayoutPicture;
	}
	public String getUtilityLocationMap() {
		return utilityLocationMap;
	}
	public void setUtilityLocationMap(String utilityLocationMap) {
		this.utilityLocationMap = utilityLocationMap;
	}
	public String getPlRemark() {
		return plRemark;
	}
	public void setPlRemark(String plRemark) {
		this.plRemark = plRemark;
	}
	public List<PlotInfoAuthorizationInfo> getPlotInfoAuthrizationInfoUDTs() {
		return plotInfoAuthrizationInfoUDTs;
	}
	public void setPlotInfoAuthrizationInfoUDTs(
			List<PlotInfoAuthorizationInfo> plotInfoAuthrizationInfoUDTs) {
		this.plotInfoAuthrizationInfoUDTs = plotInfoAuthrizationInfoUDTs;
	}
	public List<PlotInfoOwnershipInfo> getPlotInfoOwnershipInfoUDTs() {
		return plotInfoOwnershipInfoUDTs;
	}
	public void setPlotInfoOwnershipInfoUDTs(
			List<PlotInfoOwnershipInfo> plotInfoOwnershipInfoUDTs) {
		this.plotInfoOwnershipInfoUDTs = plotInfoOwnershipInfoUDTs;
	}
	public List<PlotInfoPaymentInfo> getPlotInfoPaymentInfoUDTs() {
		return plotInfoPaymentInfoUDTs;
	}
	public void setPlotInfoPaymentInfoUDTs(
			List<PlotInfoPaymentInfo> plotInfoPaymentInfoUDTs) {
		this.plotInfoPaymentInfoUDTs = plotInfoPaymentInfoUDTs;
	}
	public List<PlotInfoUtilityInfo> getPlotInfoUtilityInfoUDTs() {
		return plotInfoUtilityInfoUDTs;
	}
	public void setPlotInfoUtilityInfoUDTs(
			List<PlotInfoUtilityInfo> plotInfoUtilityInfoUDTs) {
		this.plotInfoUtilityInfoUDTs = plotInfoUtilityInfoUDTs;
	}
	public List<PlotInfoBillingInfo> getPlotInfoBillingInfoUDTs() {
		return plotInfoBillingInfoUDTs;
	}
	public void setPlotInfoBillingInfoUDTs(
			List<PlotInfoBillingInfo> plotInfoBillingInfoUDTs) {
		this.plotInfoBillingInfoUDTs = plotInfoBillingInfoUDTs;
	}
	
	
	
	
	
	
}
