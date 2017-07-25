package cn.music.mapper;

import cn.music.po.Style;

public interface StyleMapper {
    int deleteByPrimaryKey(Integer styleid);

    int insert(Style record);

    int insertSelective(Style record);

    Style selectByPrimaryKey(Integer styleid);

    int updateByPrimaryKeySelective(Style record);

    int updateByPrimaryKey(Style record);
}