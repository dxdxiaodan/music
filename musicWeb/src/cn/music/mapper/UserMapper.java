package cn.music.mapper;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import cn.music.po.User;
import cn.music.po.UserWithBLOBs;


public interface UserMapper {
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