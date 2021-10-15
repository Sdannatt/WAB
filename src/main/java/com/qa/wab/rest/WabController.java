package com.qa.wab.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.wab.data.Wab;
import com.qa.wab.services.WabService;

@RestController
@RequestMapping("/wab")
public class WabController {

	private WabService service;

	public WabController(WabService service) {
		super();
		this.service = service;
	}

	@PostMapping("/create")
	public Wab create(@RequestBody Wab newWab) {
		return this.service.create(newWab);

	}

	@GetMapping("/get/{id}")
	public Wab getById(@PathVariable Integer id) {
		return this.service.getById(id);

	}

	@GetMapping("/")
	public List<Wab> getAll() {
		return this.service.getAll();
	}

	@GetMapping("/getByNameOrPointsValue/{name}/{pointsValue}")
	public List<Wab> getByNameOrPointsValue(@PathVariable String name, Integer pointsValue) {
		return this.service.getByNameOrPointsValue(name, pointsValue);
	}

	@GetMapping("/getByParameters")
	public List<Wab> getByParamaters(@PathParam("name") String name, @PathParam("pointsValue") Integer pointsValue) {
		return this.service.getByNameOrPointsValue(name, pointsValue);
	}

	@GetMapping("/getByName/{name}")
	public List<Wab> getByName(@PathVariable String name) {
		return this.service.getByName(name);

	}

	@PutMapping("/update/{id}")
	public Wab updateWab(@PathVariable Integer id, @RequestBody Wab newWab) {
		return this.service.updateWab(id, newWab);

	}

	@DeleteMapping("/remove/{id}")

	public boolean removeWab(Integer id) {
		return this.service.removeWab(id);
	}
}
