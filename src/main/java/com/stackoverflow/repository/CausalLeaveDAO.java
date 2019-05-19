package com.stackoverflow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stackoverflow.entity.CausalLeave;

@Repository
public interface CausalLeaveDAO extends JpaRepository<CausalLeave,Integer>   {
	
	@Query("from CausalLeave")
	public List<CausalLeave> getLeaves();

}
