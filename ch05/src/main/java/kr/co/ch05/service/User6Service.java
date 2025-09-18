package kr.co.ch05.service;

import kr.co.ch05.dto.User6DTO;
import kr.co.ch05.mapper.User6Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class User6Service {

    // 상단 @RequiredArgsConstructor 어노테이션으로 의존성 주입
    private final User6Mapper mapper;

    public List<User6DTO> findAll(){
        return mapper.selectAllUser6();
    }
    public User6DTO findById(String user_id){
        return mapper.selectUser6(user_id);
    }
    public void regist(User6DTO user6DTO){
        mapper.insertUser6(user6DTO);
    }
    public void modify(User6DTO user6DTO){
        mapper.updateUser6(user6DTO);
    }
    public void remove(String user_id){
        mapper.deleteUser6(user_id);
    }
}
