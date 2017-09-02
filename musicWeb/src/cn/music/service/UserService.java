package cn.music.service;

import cn.music.po.User;
import cn.music.po.UserWithBLOBs;

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

	/**
	 * 检验用户id 是否已被注册
	 * @return
	 */
	UserWithBLOBs findUserByid(String userid);
	
	
	
}
