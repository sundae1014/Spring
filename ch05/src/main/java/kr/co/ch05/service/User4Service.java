package kr.co.ch05.service;

import kr.co.ch05.dto.User4DTO;
import kr.co.ch05.mapper.User4Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class User4Service {

    // 상단 @RequiredArgsConstructor 어노테이션으로 의존성 주입
    private final User4Mapper mapper;

    public List<User4DTO> findAll(){
        return mapper.selectAllUser4();
    }
    public User4DTO findById(String user_id){
        return mapper.selectUser4(user_id);
    }
    public void regist(User4DTO user4DTO){
        mapper.insertUser4(user4DTO);
    }
    public void modify(User4DTO user4DTO){
        mapper.updateUser4(user4DTO);
    }
    public void remove(String user_id){
        mapper.deleteUser4(user_id);
    }
}
