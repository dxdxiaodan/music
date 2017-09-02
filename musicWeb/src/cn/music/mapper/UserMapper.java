package cn.music.mapper;


import org.apache.ibatis.annotations.Param;

import cn.music.po.User;
import cn.music.po.UserWithBLOBs;

public interface UserMapper {
	/**
	 * 登录
	 * @param userid
	 * @param password
	 * @return
	 */
    User findUserByUseridAndPassword(@Param("userid") String userid,@Param("password") String password);

    /**
     * 注册
     * @param userid
     * @param password
     * @return
     */
    Integer insertWithUseridandPassword(@Param("userid") String userid, @Param("password")String password);
  
    int deleteByPrimaryKey(String userid);

    int insert(UserWithBLOBs record);

    int insertSelective(UserWithBLOBs record);

    UserWithBLOBs selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(UserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    int updateByPrimaryKey(User record);

}