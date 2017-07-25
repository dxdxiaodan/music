package cn.music.mapper;

import cn.music.po.CatogeryS;

public interface CatogerySMapper {
    int deleteByPrimaryKey(Integer categoryid);

    int insert(CatogeryS record);

    int insertSelective(CatogeryS record);

    CatogeryS selectByPrimaryKey(Integer categoryid);

    int updateByPrimaryKeySelective(CatogeryS record);

    int updateByPrimaryKeyWithBLOBs(CatogeryS record);

    int updateByPrimaryKey(CatogeryS record);
}