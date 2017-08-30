package cn.music.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.music.mapper.UserMapper;
import cn.music.po.User;
import cn.music.po.UserWithBLOBs;
import cn.music.service.UserService;

/**
 * @author lhj
 */

@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private UserMapper userMapper;
	
	@Override
	/**
	 * 用户登录
	 */
	public User login(String userid, String password) {
		return userMapper.findUserByUseridAndPassword(userid, password);
	}

	/**
	 * 用户注册
	 */
	@Override
	public Integer register(String userid, String password) {
		/*//判断用户userid 是否注册过
		UserWithBLOBs user = userMapper.selectByPrimaryKey(userid);*/
		
//		if(null == user){
			//该userid 未被注册过
			Integer id = userMapper.insertWithUseridandPassword(userid,password);
			return id;
//		}
		
		//该userid 已被注册过
//		return null;
	}

}
