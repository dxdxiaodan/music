package cn.music.service;

import cn.music.po.User;

/**
 * @author lhj
 */
public interface UserService {
	/**
	 * 用户登录
	 */
    User login(String userid,String password);

    /**
     * 用户注册
     * @param userid
     * @param password
     * @return
     */
	Integer register(String userid, String password);
	
	
	
}
