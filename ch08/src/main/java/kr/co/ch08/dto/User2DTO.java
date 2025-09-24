package kr.co.ch08.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import kr.co.ch08.entity.User2;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "T_USER2")
public class User2DTO {

    @Id
    @NotBlank
    @Pattern(regexp = "^[a-z0-9]{4,10}$", message = "영어 소문자, 숫자 조합 최소 4~10자 입력")
    private String userid;

    @NotEmpty
    @Pattern(regexp = "^[가-힣]{2,10}$", message = "이름은 한글 2~10자 입력")
    private String name;

    @Min(1)
    @Max(100)
    private int age;

    private String address;

    public User2 toEntity() {
        return User2.builder()
                .userid(userid)
                .name(name)
                .age(age)
                .address(address)
                .build();
    }
}