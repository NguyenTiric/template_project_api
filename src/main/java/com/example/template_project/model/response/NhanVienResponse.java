package com.example.template_project.model.response;

import com.example.template_project.entity.ChucVu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class NhanVienResponse {

    private Integer id;

    private String email;

    private String hoTen;

    private Integer tuoi;

    private ChucVu chucVu;
}
