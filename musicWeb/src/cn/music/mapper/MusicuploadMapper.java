package cn.music.mapper;

import cn.music.po.Musicupload;

public interface MusicuploadMapper {
    int deleteByPrimaryKey(Integer uploadid);

    int insert(Musicupload record);

    int insertSelective(Musicupload record);

    Musicupload selectByPrimaryKey(Integer uploadid);

    int updateByPrimaryKeySelective(Musicupload record);

    int updateByPrimaryKey(Musicupload record);
}