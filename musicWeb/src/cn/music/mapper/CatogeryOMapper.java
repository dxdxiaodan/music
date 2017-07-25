package cn.music.mapper;

import cn.music.po.CatogeryO;

public interface CatogeryOMapper {
    int deleteByPrimaryKey(Integer categoryid);

    int insert(CatogeryO record);

    int insertSelective(CatogeryO record);

    CatogeryO selectByPrimaryKey(Integer categoryid);

    int updateByPrimaryKeySelective(CatogeryO record);

    int updateByPrimaryKeyWithBLOBs(CatogeryO record);

    int updateByPrimaryKey(CatogeryO record);
}