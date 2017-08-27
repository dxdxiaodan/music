package cn.music.mapper;


import org.apache.ibatis.annotations.Param;

import cn.music.po.User;
import cn.music.po.UserWithBLOBs;

public interface UserMapper {
	/*
	 * 登录
	 */
//    User findUserByUsernameAndPassword(String username,String password);
    User findUserByUsernameAndPassword(@Param("username") String username,@Param("password") String password);

	
    int deleteByPrimaryKey(String userid);

    int insert(UserWithBLOBs record);

    int insertSelective(UserWithBLOBs record);

    UserWithBLOBs selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(UserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    int updateByPrimaryKey(User record);
    User selectAll();
    int insert(User user);
}