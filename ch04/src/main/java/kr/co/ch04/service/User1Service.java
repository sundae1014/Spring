package kr.co.ch04.service;

import kr.co.ch04.dao.User1DAO;
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
    private final User1DAO dao;

    public List<User1DTO> getUsers(){
        // return mapper.selectAll();
        return dao.selectAll();
    }
    public User1DTO getUser(String user_id){
        // return mapper.select(user_id);
        return dao.select(user_id);
    }
    public void save(User1DTO user1DTO){
        // MyBatis
        // mapper.insert(user1DTO);

        // Spring JDBC
        dao.insert(user1DTO);
    }
    public void update(User1DTO user1DTO){
        // mapper.update(user1DTO);
        dao.update(user1DTO);
    }
    public void delete(String user_id){
        // mapper.delete(user_id);
        dao.delete(user_id);
    }
}
