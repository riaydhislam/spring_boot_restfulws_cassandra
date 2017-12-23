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
public class LovInfo {
	@PrimaryKey(value="loId")
	Long loId;
	String tableName;
	String columnName;
	String lovKey;
	String lovValue;
	String lovRemark;
	
	public Long getLoId() {
		return loId;
	}
	public void setLoId(Long loId) {
		this.loId = loId;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getLovKey() {
		return lovKey;
	}
	public void setLovKey(String lovKey) {
		this.lovKey = lovKey;
	}
	public String getLovValue() {
		return lovValue;
	}
	public void setLovValue(String lovValue) {
		this.lovValue = lovValue;
	}
	public String getLovRemark() {
		return lovRemark;
	}
	public void setLovRemark(String lovRemark) {
		this.lovRemark = lovRemark;
	}
	

}
