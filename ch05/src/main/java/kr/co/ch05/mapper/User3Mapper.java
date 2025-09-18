package kr.co.ch05.mapper;

import kr.co.ch05.dto.User3DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// MyBatis Mapper 선언 -> 스캐닝
@Mapper
public interface User3Mapper {
    public void insertUser3(User3DTO user3DTO);
    public User3DTO selectUser3(String user_id);
    public List<User3DTO> selectAllUser3();
    public void updateUser3(User3DTO user3DTO);
    public void deleteUser3(String user_id);

}
