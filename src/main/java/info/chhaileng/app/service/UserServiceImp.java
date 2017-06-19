package info.chhaileng.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.chhaileng.app.model.User;
import info.chhaileng.app.repository.UserRepo;

@Service
public class UserServiceImp implements UserService {

	private UserRepo userRepo;
	
	@Autowired
	public void setUserRepo(UserRepo userRepo){
		this.userRepo = userRepo;
	}
	
	@Override
	public List<User> getAllUsers() {
		return userRepo.getAllUsers();
	}

	@Override
	public boolean add(User user) {
		return userRepo.add(user);
	}

}
