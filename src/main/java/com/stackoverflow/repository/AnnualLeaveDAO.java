package com.stackoverflow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stackoverflow.entity.AnnualLeave;

@Repository
public interface AnnualLeaveDAO extends JpaRepository<AnnualLeave, Integer> {

	@Query("from AnnualLeave")
	public List<AnnualLeave> getLeaves();

	public List<AnnualLeave> findByNoOfLeave(int noOfLeave);

}
