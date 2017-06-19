package info.chhaileng.app.repository;

import java.util.List;

import info.chhaileng.app.model.User;

public interface UserRepo {
	List<User> getAllUsers();
	boolean add(User user);
}
