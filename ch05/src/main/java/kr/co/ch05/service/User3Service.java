package kr.co.ch05.service;

import kr.co.ch05.dto.User3DTO;
import kr.co.ch05.mapper.User3Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class User3Service {

    // 상단 @RequiredArgsConstructor 어노테이션으로 의존성 주입
    private final User3Mapper mapper;

    public List<User3DTO> findAll(){
        return mapper.selectAllUser3();
    }
    public User3DTO findById(String user_id){
        return mapper.selectUser3(user_id);
    }
    public void regist(User3DTO user3DTO){
        mapper.insertUser3(user3DTO);
    }
    public void modify(User3DTO user3DTO){
        mapper.updateUser3(user3DTO);
    }
    public void remove(String user_id){
        mapper.deleteUser3(user_id);
    }
}
