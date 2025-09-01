package com.ra.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class UserRequestDto {
@NotBlank(message = "Họ tên không được để trống")
    private String username;
@NotNull(message = "ngay sinh khong ducowj de trong")
@DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
@NotBlank(message = "email khong duco de trong")
@Email(,message = "email khong hopw le")
private String email;


}
