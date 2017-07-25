package cn.music.mapper;

import cn.music.po.Amountstatus;

public interface AmountstatusMapper {
    int deleteByPrimaryKey(Integer amountstatusid);

    int insert(Amountstatus record);

    int insertSelective(Amountstatus record);

    Amountstatus selectByPrimaryKey(Integer amountstatusid);

    int updateByPrimaryKeySelective(Amountstatus record);

    int updateByPrimaryKey(Amountstatus record);
}