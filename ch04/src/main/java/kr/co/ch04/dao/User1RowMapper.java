package kr.co.ch04.dao;

import kr.co.ch04.dto.User1DTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User1RowMapper implements RowMapper<User1DTO> {


    @Override
    public User1DTO mapRow(ResultSet rs, int rowNum) throws SQLException {

        User1DTO user1DTO = new User1DTO();
        user1DTO.setUser_id(rs.getString("USER_ID"));
        user1DTO.setName(rs.getString("NAME"));
        user1DTO.setBirth(rs.getString("BIRTH"));
        user1DTO.setAge(rs.getInt("AGE"));
        return user1DTO;
    }
}
