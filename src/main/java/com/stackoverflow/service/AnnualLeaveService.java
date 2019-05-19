package com.stackoverflow.service;

import java.util.List;

import com.stackoverflow.entity.AnnualLeave;

public interface AnnualLeaveService {

	public List<AnnualLeave> getLeaves();

	public void addLeave(AnnualLeave annualLeave);

	public List<AnnualLeave> findByNoOfLeave(int noOfLeave);
}
