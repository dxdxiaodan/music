package cn.music.mapper;

import cn.music.po.CatogeryA;

public interface CatogeryAMapper {
    int deleteByPrimaryKey(Integer categoryid);

    int insert(CatogeryA record);

    int insertSelective(CatogeryA record);

    CatogeryA selectByPrimaryKey(Integer categoryid);

    int updateByPrimaryKeySelective(CatogeryA record);

    int updateByPrimaryKey(CatogeryA record);
}