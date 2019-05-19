package com.stackoverflow.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Annual")
public class AnnualLeave extends LeaveQuota {

	private String annualLeaveReason;

	public String getAnnualLeave() {
		return annualLeaveReason;
	}

	public void setAnnualLeaveReason(String annualLeaveReason) {
		this.annualLeaveReason = annualLeaveReason;
	}

	@Override
	public String toString() {
		return "AnnualLeave [AnnualLeaveName=" + annualLeaveReason + "]";
	}

}
