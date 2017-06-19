package info.chhaileng.app.service;

import java.util.List;

import info.chhaileng.app.model.User;

public interface UserService {
	List<User> getAllUsers();
	boolean add(User user);
}
