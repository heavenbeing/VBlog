package com.ms.dao;

import com.ms.entity.wx.BuzTypeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IndexMapper {

    List<BuzTypeEntity> getBuzTypes();
}
