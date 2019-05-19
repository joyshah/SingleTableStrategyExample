package com.stackoverflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackoverflow.entity.CausalLeave;
import com.stackoverflow.repository.CausalLeaveDAO;

@Service
public class CausalLeaveServiceImpl implements CausalLeaveService {

	@Autowired
	CausalLeaveDAO causalLeaveDAO;

	@Override
	public List<CausalLeave> getLeaves() {
		return causalLeaveDAO.getLeaves();
		// or
		// return causalLeaveDAO.findAll();
	}

	@Override
	public void addLeave(CausalLeave causalLeave) {
		causalLeaveDAO.save(causalLeave);
	}

}
