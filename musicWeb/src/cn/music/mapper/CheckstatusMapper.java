package cn.music.mapper;

import cn.music.po.Checkstatus;

public interface CheckstatusMapper {
    int deleteByPrimaryKey(Integer checkstatusid);

    int insert(Checkstatus record);

    int insertSelective(Checkstatus record);

    Checkstatus selectByPrimaryKey(Integer checkstatusid);

    int updateByPrimaryKeySelective(Checkstatus record);

    int updateByPrimaryKey(Checkstatus record);
}