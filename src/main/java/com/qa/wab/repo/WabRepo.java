package com.qa.wab.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.wab.data.Wab;

@Repository
public interface WabRepo extends JpaRepository<Wab, Integer> {

	public List<Wab> findByName(String name);

}
