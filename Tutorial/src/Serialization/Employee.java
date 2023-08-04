package Serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	String name;
	String addr;
	transient String jumin;
	String phone;
	
	public Employee(String name, String addr, String jumin, String phone) {
		this.name = name;
		this.addr = addr;
		this.jumin = jumin;
		this.phone = phone;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the addr
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * @param addr the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	/**
	 * @return the jumin
	 */
	public String getJumin() {
		return jumin;
	}

	/**
	 * @param jumin the jumin to set
	 */
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
