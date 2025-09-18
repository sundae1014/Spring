package kr.co.ch04.mapper;

import kr.co.ch04.dto.User1DTO;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class User1MapperTest {

    @Autowired
    private User1Mapper user1Mapper;

    String user_id = "abc1209";

    @Order(1)
    @DisplayName("등록 테스트")
    @Test
    void insert() {

        // Given - 테스트를 실행하기 위한 준비 단계
        User1DTO user1DTO = User1DTO.builder()
                                    .user_id(user_id)
                                    .name("김유신")
                                    .birth("1992-01-03")
                                    .age(21)
                                    .build();

        // When - 테스트 수행
        user1Mapper.insert(user1DTO);

        // Then - 테스트 검증
        User1DTO savedUser = user1Mapper.select(user1DTO.getUser_id());
        assertEquals(user1DTO.getUser_id(), savedUser.getUser_id());
    }

    @Order(2)
    @DisplayName("조회 테스트")
    @Test
    void select() {

        // Given


        // When
        User1DTO findUser = user1Mapper.select(user_id);

        // Then
        assertEquals(user_id, findUser.getUser_id());
    }

    @Order(5)
    @DisplayName("전체 조회 테스트")
    @Test
    void selectAll() {
        List<User1DTO> users = user1Mapper.selectAll();

        System.out.println(users);
        assertFalse(users.isEmpty());
    }

    @Order(3)
    @DisplayName("수정 테스트")
    @Test
    void update() {
        User1DTO user1DTO = User1DTO.builder()
                                    .user_id(user_id)
                                    .name("홍길동")
                                    .birth("1992-07-03")
                                    .age(34)
                                    .build();

        user1Mapper.update(user1DTO);

        User1DTO savedUser = user1Mapper.select(user1DTO.getUser_id());
        assertEquals(user1DTO, savedUser); // 객체 비교 DTO에 @DATA 어노테이션 선언
    }

    @Order(4)
    @DisplayName("삭제 테스트")
    @Test
    void delete() {

        user1Mapper.delete(user_id);

        assertNull(user1Mapper.select(user_id));
    }
}