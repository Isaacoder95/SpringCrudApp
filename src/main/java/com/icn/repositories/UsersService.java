package com.icn.repositories;

import java.util.List;

import com.icn.crud.model.User;

public interface UsersService {
	List<User>Listar();
	User listarId(int id);
	User add(User p);
	User delete(int id);
	User edit(User p);
}
