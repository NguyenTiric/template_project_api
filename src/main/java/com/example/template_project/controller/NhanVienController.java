package com.example.template_project.controller;

import com.example.template_project.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.template_project.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class NhanVienController {
    //demo
    @Autowired
    ChucVuService chucVuService;
    @Autowired
    NhanVienService nhanVienService;
}
