package com.hut.service.impl;

import com.hut.entity.Profession;
import com.hut.mapper.ProfessionMapper;
import com.hut.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionServiceImpl implements ProfessionService{

    @Autowired
    private ProfessionMapper professionMapper;

    @Override
    public List<Profession> queryProfessionAll() {
        return professionMapper.selectProfessionAll();
    }
}
