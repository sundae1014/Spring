package kr.co.ch05.service;

import kr.co.ch05.dto.User5DTO;
import kr.co.ch05.mapper.User5Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class User5Service {

    // 상단 @RequiredArgsConstructor 어노테이션으로 의존성 주입
    private final User5Mapper mapper;

    public List<User5DTO> findAll(){
        return mapper.selectAllUser5();
    }
    public User5DTO findById(String user_id){
        return mapper.selectUser5(user_id);
    }
    public void regist(User5DTO user5DTO){
        mapper.insertUser5(user5DTO);
    }
    public void modify(User5DTO user5DTO){
        mapper.updateUser5(user5DTO);
    }
    public void remove(String user_id){
        mapper.deleteUser5(user_id);
    }
}
