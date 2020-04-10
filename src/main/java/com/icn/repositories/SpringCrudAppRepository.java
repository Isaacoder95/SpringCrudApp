package com.icn.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.icn.crud.model.User;

public interface SpringCrudAppRepository extends Repository<User,Integer>{
	List<User>findAll();
	User findById(int id);
	User save(User p);
	void delete(User p);
}
