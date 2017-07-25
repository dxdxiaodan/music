package cn.music.mapper;

import cn.music.po.Categorydetail;

public interface CategorydetailMapper {
    int deleteByPrimaryKey(Integer categorydetailId);

    int insert(Categorydetail record);

    int insertSelective(Categorydetail record);

    Categorydetail selectByPrimaryKey(Integer categorydetailId);

    int updateByPrimaryKeySelective(Categorydetail record);

    int updateByPrimaryKey(Categorydetail record);
}