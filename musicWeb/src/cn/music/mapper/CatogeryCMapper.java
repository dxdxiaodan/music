package cn.music.mapper;

import cn.music.po.CatogeryC;

public interface CatogeryCMapper {
    int deleteByPrimaryKey(Integer categoryid);

    int insert(CatogeryC record);

    int insertSelective(CatogeryC record);

    CatogeryC selectByPrimaryKey(Integer categoryid);

    int updateByPrimaryKeySelective(CatogeryC record);

    int updateByPrimaryKeyWithBLOBs(CatogeryC record);

    int updateByPrimaryKey(CatogeryC record);
}