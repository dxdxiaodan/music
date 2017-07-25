package cn.music.mapper;

import cn.music.po.Admin;
import cn.music.po.AdminWithBLOBs;

public interface AdminMapper {
    int deleteByPrimaryKey(String staffid);

    int insert(AdminWithBLOBs record);

    int insertSelective(AdminWithBLOBs record);

    AdminWithBLOBs selectByPrimaryKey(String staffid);

    int updateByPrimaryKeySelective(AdminWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AdminWithBLOBs record);

    int updateByPrimaryKey(Admin record);
}