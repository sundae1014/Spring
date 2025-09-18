package kr.co.ch05.mapper;

import kr.co.ch05.dto.User7DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// MyBatis Mapper 선언 -> 스캐닝
@Mapper
public interface User7Mapper {
    public void insertUser7(User7DTO user7DTO);
    public User7DTO selectUser7(String user_id);
    public List<User7DTO> selectAllUser7();
    public void updateUser7(User7DTO user7DTO);
    public void deleteUser7(String user_id);

}
