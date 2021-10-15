package com.qa.wab.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.wab.data.Wab;
import com.qa.wab.repo.WabRepo;

@Service
public class WabService {

	private WabRepo repo;

	private WabService(WabRepo repo) {
		super();
		this.repo = repo;

	}

	public Wab create(Wab newWab) {
		return this.repo.save(newWab);
	}

	public Wab getById(Integer id) {
		return this.repo.findById(id);

	}

	public List<Wab> getAll() {
		return this.repo.findAll();
	}

	public Wab updateWab(Integer id, Wab newWab) {
		Wab oldWab = this.repo.findById(id);
		oldWab.setName(newWab.getName());
		oldWab.setPointsValue(newWab.getPointsValue());

	}

	public boolean removeWab(Integer id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}
}
