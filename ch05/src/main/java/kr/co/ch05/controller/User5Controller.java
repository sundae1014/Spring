package kr.co.ch05.controller;

import kr.co.ch05.dto.User5DTO;
import kr.co.ch05.service.User5Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class User5Controller {

    private final User5Service service;

    @GetMapping("/user5/register")
    public String register(){
        return "/user5/register";
    }

    @PostMapping("/user5/register")
    public String register(User5DTO user5DTO){
        service.regist(user5DTO);

        return "redirect:/user5/list";
    }

    @GetMapping("/user5/modify")
    public String modify(@RequestParam("user_id") String user_id, Model model){

        User5DTO user5DTO = service.findById(user_id);

        model.addAttribute(user5DTO);

        return "/user5/modify";
    }

    @PostMapping("/user5/modify")
    public String modify(User5DTO user5DTO){
        service.modify(user5DTO);
        return "redirect:/user5/list";
    }

    @GetMapping("/user5/list")
    public String list(Model model){
        List<User5DTO> dtoList = service.findAll();
        model.addAttribute("dtoList", dtoList);
        return "/user5/list";
    }

    @GetMapping("/user5/delete")
    public String delete(String user_id){
        service.remove(user_id);
        return "redirect:/user5/list";
    }
}
