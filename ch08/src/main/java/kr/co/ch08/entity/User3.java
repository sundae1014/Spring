package kr.co.ch08.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "T_USER3")
public class User3 {

    @Id
    private String userid;
    private String name;
    private String role;

    @CreationTimestamp
    private LocalDateTime regDate;


}