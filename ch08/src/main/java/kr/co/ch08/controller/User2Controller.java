package kr.co.ch08.controller;

import kr.co.ch08.dto.User2DTO;
import kr.co.ch08.repository.User2Repository;
import kr.co.ch08.service.User2Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class User2Controller {

    private final User2Service user2Service;

    @GetMapping("/user2")
    public ResponseEntity<List<User2DTO>> list(){
        List<User2DTO> dtoList = user2Service.getAllUser2();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dtoList);
    }

    @GetMapping("/user2/{userid}")
    public ResponseEntity<User2DTO> user2(@PathVariable("userid") String userid){
        User2DTO user2DTO = user2Service.getUser2(userid);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(user2DTO);
    }

    @PostMapping("/user2")
    public ResponseEntity<User2DTO> register(User2DTO user2DTO){
        User2DTO savedUser2 = user2Service.save(user2DTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedUser2);
    }

    @PutMapping("/user2")
    public ResponseEntity<User2DTO> modify(User2DTO user2DTO){
        User2DTO modifiedUser2 = user2Service.modify(user2DTO);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(modifiedUser2);
    }

    @DeleteMapping("/user2/{userid}")
    public ResponseEntity<Boolean> delete(@PathVariable("userid") String userid){
        boolean isSuccess = user2Service.remove(userid);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(isSuccess);
    }

}
