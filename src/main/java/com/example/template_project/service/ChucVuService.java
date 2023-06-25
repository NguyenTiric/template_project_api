package com.example.template_project.service;

import com.example.template_project.model.response.ChucVuResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChucVuService {
    List<ChucVuResponse> getAll();
}
