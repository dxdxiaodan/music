package cn.music.mapper;

import cn.music.po.Musiccollection;
import cn.music.po.MusiccollectionKey;

public interface MusiccollectionMapper {
    int deleteByPrimaryKey(MusiccollectionKey key);

    int insert(Musiccollection record);

    int insertSelective(Musiccollection record);

    Musiccollection selectByPrimaryKey(MusiccollectionKey key);

    int updateByPrimaryKeySelective(Musiccollection record);

    int updateByPrimaryKey(Musiccollection record);
}