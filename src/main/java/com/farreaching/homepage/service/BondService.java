package com.farreaching.homepage.service;

import com.farreaching.homepage.entity.BondEntity;
import com.farreaching.homepage.mapper.BondMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BondService {
    @Resource
    private BondMapper bondMapper;

    public List<BondEntity> list(int byMonth, int byDay) {
        return bondMapper.list(byMonth, byDay);
    }
}
