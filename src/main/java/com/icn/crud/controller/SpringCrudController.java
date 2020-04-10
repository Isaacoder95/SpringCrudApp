package com.icn.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icn.crud.model.User;
import com.icn.repositories.UsersService;

@RestController
public class SpringCrudController {
	//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
	@RestController
	@RequestMapping({"/personas"})

	public class Controlador {
		
		@Autowired
		UsersService service;
		
		@GetMapping
		public List<User>Listar(){
			return service.Listar();
		}
		
		@PostMapping
		public User agregar(@RequestBody User p) {
			return service.add(p);
		}
		
		@GetMapping(path= {"/{id}"})
		public User listarId(@PathVariable("id") int id) {
			return service.listarId(id);
		}
		@PutMapping(path= {"/{id}"})
		public User editar(@RequestBody User p, @PathVariable("id") int id) {
			p.setId(id);
			return service.edit(p);
		}
		
		@DeleteMapping(path = {"/{id}"})
		public User delete(@PathVariable("id") int id) {
			return service.delete(id);
		}
	}
	
}
