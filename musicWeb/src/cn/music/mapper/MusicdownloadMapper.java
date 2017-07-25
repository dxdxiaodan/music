package cn.music.mapper;

import cn.music.po.Musicdownload;

public interface MusicdownloadMapper {
    int deleteByPrimaryKey(Integer downloadid);

    int insert(Musicdownload record);

    int insertSelective(Musicdownload record);

    Musicdownload selectByPrimaryKey(Integer downloadid);

    int updateByPrimaryKeySelective(Musicdownload record);

    int updateByPrimaryKey(Musicdownload record);
}