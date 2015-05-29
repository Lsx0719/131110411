package model;

/**
 * AbstractRiceFlourInfo entity provides the base persistence definition of the
 * RiceFlourInfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRiceFlourInfo implements java.io.Serializable {

	// Fields

	private String riceFlourName;
	private Integer riceFlourPrice;
	private Integer riceFlourNum;

	// Constructors

	/** default constructor */
	public AbstractRiceFlourInfo() {
	}

	/** minimal constructor */
	public AbstractRiceFlourInfo(String riceFlourName, Integer riceFlourPrice) {
		this.riceFlourName = riceFlourName;
		this.riceFlourPrice = riceFlourPrice;
	}

	/** full constructor */
	public AbstractRiceFlourInfo(String riceFlourName, Integer riceFlourPrice,
			Integer riceFlourNum) {
		this.riceFlourName = riceFlourName;
		this.riceFlourPrice = riceFlourPrice;
		this.riceFlourNum = riceFlourNum;
	}

	// Property accessors

	public String getRiceFlourName() {
		return this.riceFlourName;
	}

	public void setRiceFlourName(String riceFlourName) {
		this.riceFlourName = riceFlourName;
	}

	public Integer getRiceFlourPrice() {
		return this.riceFlourPrice;
	}

	public void setRiceFlourPrice(Integer riceFlourPrice) {
		this.riceFlourPrice = riceFlourPrice;
	}

	public Integer getRiceFlourNum() {
		return this.riceFlourNum;
	}

	public void setRiceFlourNum(Integer riceFlourNum) {
		this.riceFlourNum = riceFlourNum;
	}

}