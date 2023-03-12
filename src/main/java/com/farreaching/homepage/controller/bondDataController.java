package com.farreaching.homepage.controller;

import com.farreaching.homepage.entity.BondEntity;
import com.farreaching.homepage.service.BondService;
import jakarta.annotation.Resource;
import lombok.val;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class bondDataController {
    @Resource
    private BondService bondService;

    @GetMapping("/bond")
    public List<BondEntity> bond(int byMonth, int byDay){
        List<BondEntity> bondEntities = bondService.list(byMonth, byDay);
        return bondEntities;
    }
}
