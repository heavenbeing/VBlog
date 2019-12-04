package com.ms.dao;

import com.ms.entity.wx.BuzTypeEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IndexMapper {

    List<BuzTypeEntity> getBuzTypes();
}
