package cn.music.mapper;

import cn.music.po.Language;

public interface LanguageMapper {
    int deleteByPrimaryKey(Integer languageid);

    int insert(Language record);

    int insertSelective(Language record);

    Language selectByPrimaryKey(Integer languageid);

    int updateByPrimaryKeySelective(Language record);

    int updateByPrimaryKey(Language record);
}