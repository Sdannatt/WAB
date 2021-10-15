package com.qa.wab.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.wab.data.Wab;
import com.qa.wab.exceptions.WabNotFoundException;
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
		return this.repo.findById(id).orElseThrow(WabNotFoundException::new);

	}

	public List<Wab> getAll() {
		return this.repo.findAll();
	}

	public List<Wab> getByName(String name) {
		return this.repo.findByName(name);
	}

	public List<Wab> getByNameOrPointsValue(String name, Integer pointsValue) {
		return this.repo.findByNameOrPointsValue(name, pointsValue);
	}

	public Wab updateWab(Integer id, Wab newWab) {
		Wab oldWab = this.repo.findById(id).orElseThrow(WabNotFoundException::new);
		oldWab.setName(newWab.getName());
		oldWab.setPointsValue(newWab.getPointsValue());

		return this.repo.save(oldWab);

	}

	public boolean removeWab(Integer id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}
}
