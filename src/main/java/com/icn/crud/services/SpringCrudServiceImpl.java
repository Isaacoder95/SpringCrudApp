package com.icn.crud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.icn.crud.model.User;
import com.icn.repositories.SpringCrudAppRepository;

@Service
public class SpringCrudServiceImpl  implements SpringCrudAppRepository{

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User save(User p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(User p) {
		// TODO Auto-generated method stub
		
	}
	
}
