package info.chhaileng.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import info.chhaileng.app.model.User;

@Repository
public class UserRepoImp implements UserRepo {

	private List<User> users;

	public UserRepoImp(){
		users = new ArrayList<>();
		User u1 = new User();
		u1.setId(1); u1.setUsr("Chhaileng"); u1.setPwd("Admin@123");
		users.add(u1);
		User u2 = new User();
		u2.setId(2); u2.setUsr("Ratanak"); u2.setPwd("NakNak007");
		users.add(u2);
		User u3 = new User();
		u3.setId(3); u3.setUsr("LokBong"); u3.setPwd("ThnamKhmer168");
		users.add(u3);
	}

	@Override
	public List<User> getAllUsers() {
		return users;
	}

	@Override
	public boolean add(User user) {
		if (user!=null) {
			users.add(user);
			return true;
		}
		return false;
	}

}
