package model;

/**
 * BusinessStatistics entity. @author MyEclipse Persistence Tools
 */

public class BusinessStatistics implements java.io.Serializable {

	// Fields

	private String riceFlourName;
	private Integer soldNum;
	private Integer riceFlourPrice;
	private Integer total;

	// Constructors

	/** default constructor */
	public BusinessStatistics() {
	}

	/** minimal constructor */
	public BusinessStatistics(String riceFlourName, Integer riceFlourPrice) {
		this.riceFlourName = riceFlourName;
		this.riceFlourPrice = riceFlourPrice;
	}

	/** full constructor */
	public BusinessStatistics(String riceFlourName, Integer soldNum,
			Integer riceFlourPrice, Integer total) {
		this.riceFlourName = riceFlourName;
		this.soldNum = soldNum;
		this.riceFlourPrice = riceFlourPrice;
		this.total = total;
	}

	// Property accessors

	public String getRiceFlourName() {
		return this.riceFlourName;
	}

	public void setRiceFlourName(String riceFlourName) {
		this.riceFlourName = riceFlourName;
	}

	public Integer getSoldNum() {
		return this.soldNum;
	}

	public void setSoldNum(Integer soldNum) {
		this.soldNum = soldNum;
	}

	public Integer getRiceFlourPrice() {
		return this.riceFlourPrice;
	}

	public void setRiceFlourPrice(Integer riceFlourPrice) {
		this.riceFlourPrice = riceFlourPrice;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}