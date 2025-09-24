package kr.co.ch08.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
public class User3DTO {

    @Id
    private String userid;
    private String name;
    private String role;

    @CreationTimestamp
    private LocalDateTime regDate;


}
