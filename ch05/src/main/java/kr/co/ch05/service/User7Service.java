package kr.co.ch05.service;

import kr.co.ch05.dto.User7DTO;
import kr.co.ch05.mapper.User7Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class User7Service {

    // 상단 @RequiredArgsConstructor 어노테이션으로 의존성 주입
    private final User7Mapper mapper;

    public List<User7DTO> findAll(){
        return mapper.selectAllUser7();
    }
    public User7DTO findById(String user_id){
        return mapper.selectUser7(user_id);
    }
    public void regist(User7DTO user7DTO){
        mapper.insertUser7(user7DTO);
    }
    public void modify(User7DTO user7DTO){
        mapper.updateUser7(user7DTO);
    }
    public void remove(String user_id){
        mapper.deleteUser7(user_id);
    }
}
