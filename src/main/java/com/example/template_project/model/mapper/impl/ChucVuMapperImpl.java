package com.example.template_project.model.mapper.impl;

import com.example.template_project.entity.ChucVu;
import com.example.template_project.model.mapper.ChucVuMapper;
import com.example.template_project.model.response.ChucVuResponse;
import jakarta.annotation.Generated;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Generated(value = "org.mapstruct.ap.MappingProcessor", date = "2023-03-29T01:09:18+0700", comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.6 (JetBrains s.r.o.)")
@Component
public class ChucVuMapperImpl implements ChucVuMapper {

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ChucVuResponse chucVuResponseToChucVuEntity(ChucVu ChucVu) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        ChucVuResponse ChucVuResponse = modelMapper.map(ChucVu, ChucVuResponse.class);
        return ChucVuResponse;
    }

    @Override
    public ChucVu chucVuEntityToChucVuResponse(ChucVuResponse ChucVuResponse) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        ChucVu ChucVu = modelMapper.map(ChucVuResponse, ChucVu.class);
        return ChucVu;
    }

    @Override
    public List<ChucVuResponse> listChucVuEntityToChucVuRequest(List<ChucVu> chucVuList) {
        List<ChucVuResponse> list = new ArrayList<>(chucVuList.size());
        for (ChucVu chucVu : chucVuList) {
            list.add(chucVuResponseToChucVuEntity(chucVu));
        }
        return list;
    }

}
