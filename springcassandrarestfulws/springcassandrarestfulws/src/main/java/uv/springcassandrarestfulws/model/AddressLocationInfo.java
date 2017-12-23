/**
 * 
 */
package uv.springcassandrarestfulws.model;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * @author A.Riaydh
 *
 */
@Table
public class AddressLocationInfo {

	@PrimaryKey(value="alId") 
	 Long alId;
	 Long adId;
	 Long alReferenceId;
	 Long alThanaCode;
	 Long alDistictCode;
	 String alDivisionName;
	 String alDistictName;
	 String alUpzillaOrThanaName;
	 String alUnionName;
	 String alWardNumber;
	 String alBlockNumber;
	 String alSectionNumber;
	 String alRoadName;
	 String alRoadType;
	 String alRoadNumber;
	 String alBuildingNumber;
	 String alBuildingFloorNumber;
	 String alBuildingFloorUnitNumber;
	 String alType;
	 String alLocationPic;
	
	public Long getAlId() {
		return alId;
	}
	public void setAlId(Long alId) {
		this.alId = alId;
	}
	public Long getAdId() {
		return adId;
	}
	public void setAdId(Long adId) {
		this.adId = adId;
	}
	public Long getAlReferenceId() {
		return alReferenceId;
	}
	public void setAlReferenceId(Long alReferenceId) {
		this.alReferenceId = alReferenceId;
	}
	public Long getAlThanaCode() {
		return alThanaCode;
	}
	public void setAlThanaCode(Long alThanaCode) {
		this.alThanaCode = alThanaCode;
	}
	public Long getAlDistictCode() {
		return alDistictCode;
	}
	public void setAlDistictCode(Long alDistictCode) {
		this.alDistictCode = alDistictCode;
	}
	public String getAlDivisionName() {
		return alDivisionName;
	}
	public void setAlDivisionName(String alDivisionName) {
		this.alDivisionName = alDivisionName;
	}
	public String getAlDistictName() {
		return alDistictName;
	}
	public void setAlDistictName(String alDistictName) {
		this.alDistictName = alDistictName;
	}
	public String getAlUpzillaOrThanaName() {
		return alUpzillaOrThanaName;
	}
	public void setAlUpzillaOrThanaName(String alUpzillaOrThanaName) {
		this.alUpzillaOrThanaName = alUpzillaOrThanaName;
	}
	public String getAlUnionName() {
		return alUnionName;
	}
	public void setAlUnionName(String alUnionName) {
		this.alUnionName = alUnionName;
	}
	public String getAlWardNumber() {
		return alWardNumber;
	}
	public void setAlWardNumber(String alWardNumber) {
		this.alWardNumber = alWardNumber;
	}
	public String getAlBlockNumber() {
		return alBlockNumber;
	}
	public void setAlBlockNumber(String alBlockNumber) {
		this.alBlockNumber = alBlockNumber;
	}
	public String getAlSectionNumber() {
		return alSectionNumber;
	}
	public void setAlSectionNumber(String alSectionNumber) {
		this.alSectionNumber = alSectionNumber;
	}
	public String getAlRoadName() {
		return alRoadName;
	}
	public void setAlRoadName(String alRoadName) {
		this.alRoadName = alRoadName;
	}
	public String getAlRoadType() {
		return alRoadType;
	}
	public void setAlRoadType(String alRoadType) {
		this.alRoadType = alRoadType;
	}
	public String getAlRoadNumber() {
		return alRoadNumber;
	}
	public void setAlRoadNumber(String alRoadNumber) {
		this.alRoadNumber = alRoadNumber;
	}
	public String getAlBuildingNumber() {
		return alBuildingNumber;
	}
	public void setAlBuildingNumber(String alBuildingNumber) {
		this.alBuildingNumber = alBuildingNumber;
	}
	public String getAlBuildingFloorNumber() {
		return alBuildingFloorNumber;
	}
	public void setAlBuildingFloorNumber(String alBuildingFloorNumber) {
		this.alBuildingFloorNumber = alBuildingFloorNumber;
	}
	public String getAlBuildingFloorUnitNumber() {
		return alBuildingFloorUnitNumber;
	}
	public void setAlBuildingFloorUnitNumber(String alBuildingFloorUnitNumber) {
		this.alBuildingFloorUnitNumber = alBuildingFloorUnitNumber;
	}
	public String getAlType() {
		return alType;
	}
	public void setAlType(String alType) {
		this.alType = alType;
	}
	public String getAlLocationPic() {
		return alLocationPic;
	}
	public void setAlLocationPic(String alLocationPic) {
		this.alLocationPic = alLocationPic;
	}
	 
	 
	 
}
