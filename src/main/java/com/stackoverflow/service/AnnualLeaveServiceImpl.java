package com.stackoverflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackoverflow.entity.AnnualLeave;
import com.stackoverflow.repository.AnnualLeaveDAO;

@Service
public class AnnualLeaveServiceImpl implements AnnualLeaveService {

	@Autowired
	AnnualLeaveDAO annualLeaveDAO;

	@Override
	public List<AnnualLeave> getLeaves() {
		return annualLeaveDAO.getLeaves();// or annualLeave.findAll();
	}

	@Override
	public void addLeave(AnnualLeave annualLeave) {
		annualLeaveDAO.save(annualLeave);
	}

	@Override
	public List<AnnualLeave> findByNoOfLeave(int noOfLeave) {
		// TODO Auto-generated method stub
		return annualLeaveDAO.findByNoOfLeave(noOfLeave);
	}

}
