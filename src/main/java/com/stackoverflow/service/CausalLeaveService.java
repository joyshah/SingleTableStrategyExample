package com.stackoverflow.service;

import java.util.List;

import com.stackoverflow.entity.CausalLeave;

public interface CausalLeaveService {
	public List<CausalLeave> getLeaves();

	public void addLeave(CausalLeave causalLeave);

}
