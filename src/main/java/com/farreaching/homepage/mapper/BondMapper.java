package com.farreaching.homepage.mapper;

import com.farreaching.homepage.entity.BondEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BondMapper {

    public List<BondEntity> list(@Param("byMonth") int byMonth, @Param("byDay") int byDay);
}
