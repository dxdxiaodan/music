package cn.music.po;

import java.util.List;

public class UserVo {
	
	private User user;
	
	List<User> userList;

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
}
