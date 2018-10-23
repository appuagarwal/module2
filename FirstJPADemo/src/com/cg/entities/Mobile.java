package com.cg.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="mobiles_31")
@NamedQueries(@NamedQuery(name="getMobiles",query="SELECT m FROM Mobile m WHERE m.quantity>:qty"))
public class Mobile 
{
	@Id
	@SequenceGenerator(name="myseq",sequenceName="seq_mobiles",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="myseq")
	@Column(name="mobileid")
	private int mobileID;
	@Column(name="name")
	private String mobileName;
	@Column(name="price")
	private int mobilePrice;
	@Column(name="quantity")
	private String mobileQuantity;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMobileID() {
		return mobileID;
	}
	public void setMobileID(int mobileID) {
		this.mobileID = mobileID;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public String getMobileQuantity() {
		return mobileQuantity;
	}
	public void setMobileQuantity(String mobileQuantity) {
		this.mobileQuantity = mobileQuantity;
	}
	@Override
	public String toString() {
		return "Mobile [mobileID=" + mobileID + ", mobileName=" + mobileName
				+ ", mobilePrice=" + mobilePrice + ", mobileQuantity="
				+ mobileQuantity + "]";
	}
	
}
