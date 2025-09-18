package kr.co.ch04.service;

import kr.co.ch04.dto.User1DTO;
import kr.co.ch04.mapper.User1Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class User1Service {

    private final User1Mapper mapper;

    public List<User1DTO> getUsers(){
        return mapper.selectAll();
    }
    public User1DTO getUser(String user_id){
        return mapper.select(user_id);
    }
    public void save(User1DTO user1DTO){
        mapper.insert(user1DTO);
    }
    public void update(User1DTO user1DTO){
        mapper.update(user1DTO);
    }
    public void delete(String user_id){
        mapper.delete(user_id);
    }
}
