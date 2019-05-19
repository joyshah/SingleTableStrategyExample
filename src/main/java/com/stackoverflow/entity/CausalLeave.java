package com.stackoverflow.entity;

import javax.persistence.Entity;

@Entity
@javax.persistence.DiscriminatorValue("Casual")
public class CausalLeave extends LeaveQuota {

	private String causalLeaveReason;

	public String getCausalLeaveReason() {
		return causalLeaveReason;
	}

	public void setCausalLeaveReason(String causalLeaveReason) {
		this.causalLeaveReason = causalLeaveReason;
	}

	@Override
	public String toString() {
		return "CausalLeave [causalLeaveReason=" + causalLeaveReason + "]";
	}

}
