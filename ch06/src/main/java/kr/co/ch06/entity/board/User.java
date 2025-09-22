package kr.co.ch06.entity.board;

import jakarta.persistence.*;

import lombok.*;


@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TBL_USER")
public class User {

    @Id
    private String userid;
    private String name;
    private int age;

}
