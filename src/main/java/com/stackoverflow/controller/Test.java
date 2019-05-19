package com.stackoverflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.stackoverflow.entity.AnnualLeave;
import com.stackoverflow.entity.CausalLeave;
import com.stackoverflow.service.AnnualLeaveService;
import com.stackoverflow.service.CausalLeaveService;

@RestController
@CrossOrigin
public class Test {

	@Autowired
	AnnualLeaveService annualLeaveService;
	@Autowired
	CausalLeaveService causalLeaveService;

	@GetMapping("/annualLeave")
	public List<AnnualLeave> getannualLeave() {

		return annualLeaveService.getLeaves();
		/*
		 * System.out.println(annualLeaveRepo.leave_type());
		 * System.out.println(causalLeaveRepo.leave_type());
		 * System.out.println(annualLeaveRepo.findByNoOfLeave(20));
		 * System.out.println(annualLeaveRepo.findByAnnualLeave("JoyShahannual11"));
		 * System.out.println(annualLeaveRepo.findAll());
		 */
	}

	@GetMapping("/causalLeave")
	public List<CausalLeave> getCausalLeave() {
		return causalLeaveService.getLeaves();
	}

	@GetMapping("/annualLeave/{leaveNo}")
	public List<AnnualLeave> getCausalLeaveByLeave(@PathVariable("leaveNo") String leaveNo) {
		return annualLeaveService.findByNoOfLeave(Integer.parseInt(leaveNo));
	}

	@GetMapping("/addData")
	public void addData() {
		AnnualLeave annualLeave = new AnnualLeave();
		annualLeave.setAnnualLeaveReason("Personal Reason 1");
		annualLeave.setNoOfLeave(2);
		annualLeaveService.addLeave(annualLeave);

		AnnualLeave annualLeave1 = new AnnualLeave();
		annualLeave1.setAnnualLeaveReason("Personal Reason 2");
		annualLeave1.setNoOfLeave(3);
		annualLeaveService.addLeave(annualLeave1);

		CausalLeave causalLeave = new CausalLeave();
		causalLeave.setCausalLeaveReason("Personal Reason 3");
		causalLeave.setNoOfLeave(2);
		causalLeaveService.addLeave(causalLeave);

		CausalLeave causalLeave1 = new CausalLeave();
		causalLeave1.setCausalLeaveReason("Personal Reason 4");
		causalLeave1.setNoOfLeave(3);
		causalLeaveService.addLeave(causalLeave1);
	}
}
