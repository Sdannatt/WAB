package com.qa.wab.services;

import org.springframework.stereotype.Service;

import com.qa.wab.repo.WabRepo;

@Service
public class WabService {

	private WabRepo repo;

	private WabService(WabRepo repo) {
		super();
		this.repo = repo;

	}

}
