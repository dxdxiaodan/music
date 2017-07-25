package cn.music.mapper;

import cn.music.po.Downloadpermissions;

public interface DownloadpermissionsMapper {
    int deleteByPrimaryKey(Integer downloadpermissionsid);

    int insert(Downloadpermissions record);

    int insertSelective(Downloadpermissions record);

    Downloadpermissions selectByPrimaryKey(Integer downloadpermissionsid);

    int updateByPrimaryKeySelective(Downloadpermissions record);

    int updateByPrimaryKey(Downloadpermissions record);
}