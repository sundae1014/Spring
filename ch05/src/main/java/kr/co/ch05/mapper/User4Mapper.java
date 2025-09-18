package kr.co.ch05.mapper;

import kr.co.ch05.dto.User4DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// MyBatis Mapper 선언 -> 스캐닝
@Mapper
public interface User4Mapper {
    public void insertUser4(User4DTO user4DTO);
    public User4DTO selectUser4(String user_id);
    public List<User4DTO> selectAllUser4();
    public void updateUser4(User4DTO user4DTO);
    public void deleteUser4(String user_id);

}
