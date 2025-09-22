package kr.co.ch04.dao;

import kr.co.ch04.dto.User1DTO;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;


@RequiredArgsConstructor
@Component
public class User1DAO {

    private final JdbcTemplate jdbcTemplate;

    public void insert(User1DTO user1DTO) {

        String sql = "INSERT INTO USER1 VALUES (?,?,?,?)";

        Object[] params = {
                user1DTO.getUser_id(),
                user1DTO.getName(),
                user1DTO.getBirth(),
                user1DTO.getAge()
        };

        jdbcTemplate.update(sql, params);

    }

    public User1DTO select(String user_id){
        String sql = "SELECT * FROM USER1 WHERE USER_ID = ?";
        return jdbcTemplate.queryForObject(sql, new User1RowMapper(), user_id);
    }

    public List<User1DTO> selectAll(){
        String sql = "SELECT * FROM USER1";
        return jdbcTemplate.query(sql, new User1RowMapper());
    }

    public void update(User1DTO user1DTO){
        String sql = "UPDATE USER1 SET NAME = ?, BIRTH = ?,  AGE = ? WHERE USER_ID = ?";
        Object[] params = {
                user1DTO.getName(),
                user1DTO.getBirth(),
                user1DTO.getAge(),
                user1DTO.getUser_id()
        };
        jdbcTemplate.update(sql, params);
    }

    public void delete(String user_id){
        String sql = "DELETE FROM USER1 WHERE USER_ID = ?";
        jdbcTemplate.update(sql, user_id);
    }

}
