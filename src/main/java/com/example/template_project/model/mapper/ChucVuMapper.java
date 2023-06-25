package com.example.template_project.model.mapper;

import com.example.template_project.entity.ChucVu;
import com.example.template_project.model.response.ChucVuResponse;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface ChucVuMapper {
    ChucVuResponse chucVuResponseToChucVuEntity(ChucVu chucVu);
    ChucVu chucVuEntityToChucVuResponse(ChucVuResponse chucVuResponse);
    List<ChucVuResponse> listChucVuEntityToChucVuRequest(List<ChucVu> chucVuList);
}
