package com.icn.crud.model;

import java.io.Serializable;

/**
 * @author isaac
 *
 */
public class User implements Serializable {

	private String Name;
	private String secondName;
	private String secondLastName;
	private String emai;
	private String mobile;
	private String roll;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public String getEmai() {
		return emai;
	}

	public void setEmai(String emai) {
		this.emai = emai;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

}
