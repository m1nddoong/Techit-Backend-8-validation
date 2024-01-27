package com.example.validation.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import javax.print.attribute.standard.PrinterURI;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    // 사용자가 입력하는 데이터 중 검증하고 싶은 데이터
    @NotNull
    @Size(min = 8, message = "8자는 넣어주세요")
    private String username;
    // message 를 기록하면 예외에 기록되는 문구를 바꿀 수 있다.
    @Email(message = "Email을 넣어주세요")
    private String email;
    // 14세 이상만 받아준다.
    @Min(value = 14, message = "만 14세 이하는 부모님 동의가 필요합니다.")
    private Integer age;

    // 날짜를 나타내는 Java 클래스 ('YYYY-MM-DD')
    @Future
    private LocalDate validUntil;

    @NotNull
    private String notNullString;
    @NotEmpty
    private String notEmptyString;
    @NotBlank
    private String notBlankString;
}
