package com.stackoverflow.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Leave_Type", discriminatorType = DiscriminatorType.STRING)
public class LeaveQuota {

	@Id
	@GeneratedValue
	private int id;
	
	private int noOfLeave;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfLeave() {
		return noOfLeave;
	}

	public void setNoOfLeave(int noOfLeave) {
		this.noOfLeave = noOfLeave;
	}

	@Override
	public String toString() {
		return "LeaveQuota [id=" + id + ", NoOfLeave=" + noOfLeave + "]";
	}

}
