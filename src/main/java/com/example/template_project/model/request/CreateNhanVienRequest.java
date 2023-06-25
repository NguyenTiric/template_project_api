package com.example.template_project.model.request;

import com.example.template_project.entity.ChucVu;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
public class CreateNhanVienRequest {

    private Integer id;

    @NotBlank(message = "email không để trống")
    @Size(min = 1, max = 255, message = "email không vượt quá 255 ký tự")
    private String email;

    @NotBlank(message = "họ tên không để trống")
    @Size(min = 1, max = 255, message = "họ tên không vượt quá 255 ký tự")
    private String hoTen;

    @NotNull(message = "tuổi không để trống")
    @Min(value = 1, message = "tuổi là số nguyên dương")
    private Integer tuoi;

    @NotNull(message = "chức vụ không để trống")
    private ChucVu chucVu;
}
