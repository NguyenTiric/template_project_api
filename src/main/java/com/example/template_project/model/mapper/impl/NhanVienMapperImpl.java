package com.example.template_project.model.mapper.impl;

import com.example.template_project.entity.NhanVien;
import com.example.template_project.model.mapper.NhanVienMapper;
import com.example.template_project.model.request.CreateNhanVienRequest;
import com.example.template_project.model.request.UpdateNhanVienRequest;
import com.example.template_project.model.response.NhanVienResponse;
import jakarta.annotation.Generated;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Generated(value = "org.mapstruct.ap.MappingProcessor", date = "2023-03-29T01:09:18+0700", comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.6 (JetBrains s.r.o.)")
@Component
public class NhanVienMapperImpl implements NhanVienMapper {

    @Autowired
    ModelMapper modelMapper;

    @Override
    public NhanVienResponse nhanVienEntityToNhanVienResponse(NhanVien nhanVien) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        NhanVienResponse nhanVienResponse = modelMapper.map(nhanVien, NhanVienResponse.class);
        return nhanVienResponse;
    }

    @Override
    public NhanVien nhanVienResponseToNhanVienEntity(NhanVienResponse nhanVienResponse) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        NhanVien nhanVien = modelMapper.map(nhanVienResponse, NhanVien.class);
        return nhanVien;
    }

    @Override
    public NhanVien createNhanVienRequestToNhanVienEntity(CreateNhanVienRequest createNhanVienRequest) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        NhanVien nhanVien = modelMapper.map(createNhanVienRequest, NhanVien.class);
        return nhanVien;
    }

    @Override
    public NhanVien updateNhanVienRequestToNhanVienEntity(UpdateNhanVienRequest updateNhanVienRequest) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        NhanVien nhanVien = modelMapper.map(updateNhanVienRequest, NhanVien.class);
        return nhanVien;
    }

    @Override
    public List<NhanVienResponse> listNhanVienEntityToNhanVienRequest(List<NhanVien> nhanVienList) {
        List<NhanVienResponse> list = new ArrayList<>(nhanVienList.size());
        for (NhanVien nhanVien : nhanVienList) {
            list.add(nhanVienEntityToNhanVienResponse(nhanVien));
        }
        return list;
    }
}
