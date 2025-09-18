package kr.co.ch05.mapper;

import kr.co.ch05.dto.User6DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// MyBatis Mapper 선언 -> 스캐닝
@Mapper
public interface User6Mapper {
    public void insertUser6(User6DTO user6DTO);
    public User6DTO selectUser6(String user_id);
    public List<User6DTO> selectAllUser6();
    public void updateUser6(User6DTO user6DTO);
    public void deleteUser6(String user_id);

}
