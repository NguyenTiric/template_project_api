package com.example.template_project.service.impl;

import com.example.template_project.model.mapper.ChucVuMapper;
import com.example.template_project.model.response.ChucVuResponse;
import com.example.template_project.repository.ChucVuRepository;
import com.example.template_project.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ChucVuServiceImpl implements ChucVuService {
    @Autowired
    ChucVuMapper chucVuMapper;
    @Autowired
    ChucVuRepository chucVuRepository;

    @Override
    public List<ChucVuResponse> getAll() {
        return chucVuMapper.listChucVuEntityToChucVuRequest(chucVuRepository.findAll());
    }
}
