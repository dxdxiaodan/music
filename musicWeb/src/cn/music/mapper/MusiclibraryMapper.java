package cn.music.mapper;

import cn.music.po.Musiclibrary;
import cn.music.po.MusiclibraryKey;

public interface MusiclibraryMapper {
    int deleteByPrimaryKey(MusiclibraryKey key);

    int insert(Musiclibrary record);

    int insertSelective(Musiclibrary record);

    Musiclibrary selectByPrimaryKey(MusiclibraryKey key);

    int updateByPrimaryKeySelective(Musiclibrary record);

    int updateByPrimaryKeyWithBLOBs(Musiclibrary record);

    int updateByPrimaryKey(Musiclibrary record);
}