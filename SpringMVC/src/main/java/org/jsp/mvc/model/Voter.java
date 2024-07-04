package org.jsp.mvc.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the voters database table.
 * 
 */
@Entity
@Table(name="voters")
@NamedQuery(name="Voter.findAll", query="SELECT v FROM Voter v")
public class Voter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int voter_Id;

	private String voter_Address;

	private int voter_Age;

	private String voter_Gender;

	private String voter_Mobile;

	private String voter_Name;

	public Voter() {
	}

	public int getVoter_Id() {
		return this.voter_Id;
	}

	public void setVoter_Id(int voter_Id) {
		this.voter_Id = voter_Id;
	}

	public String getVoter_Address() {
		return this.voter_Address;
	}

	public void setVoter_Address(String voter_Address) {
		this.voter_Address = voter_Address;
	}

	public int getVoter_Age() {
		return this.voter_Age;
	}

	public void setVoter_Age(int voter_Age) {
		this.voter_Age = voter_Age;
	}

	public String getVoter_Gender() {
		return this.voter_Gender;
	}

	public void setVoter_Gender(String voter_Gender) {
		this.voter_Gender = voter_Gender;
	}

	public String getVoter_Mobile() {
		return this.voter_Mobile;
	}

	public void setVoter_Mobile(String voter_Mobile) {
		this.voter_Mobile = voter_Mobile;
	}

	public String getVoter_Name() {
		return this.voter_Name;
	}

	public void setVoter_Name(String voter_Name) {
		this.voter_Name = voter_Name;
	}

	@Override
	public String toString() {
		return "Voter [voter_Id=" + voter_Id + ", voter_Address=" + voter_Address + ", voter_Age=" + voter_Age
				+ ", voter_Gender=" + voter_Gender + ", voter_Mobile=" + voter_Mobile + ", voter_Name=" + voter_Name
				+ "]";
	}
	

}