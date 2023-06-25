package com.example.template_project.model.mapper;

import com.example.template_project.entity.NhanVien;
import com.example.template_project.model.request.CreateNhanVienRequest;
import com.example.template_project.model.request.UpdateNhanVienRequest;
import com.example.template_project.model.response.NhanVienResponse;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface NhanVienMapper {
    NhanVienResponse nhanVienEntityToNhanVienResponse(NhanVien nhanVien);
    NhanVien nhanVienResponseToNhanVienEntity(NhanVienResponse nhanVienResponse);
    NhanVien createNhanVienRequestToNhanVienEntity(CreateNhanVienRequest createNhanVienRequest);
    NhanVien updateNhanVienRequestToNhanVienEntity(UpdateNhanVienRequest updateNhapVienRequest);
    List<NhanVienResponse> listNhanVienEntityToNhanVienRequest(List<NhanVien> nhanVienList);
}
