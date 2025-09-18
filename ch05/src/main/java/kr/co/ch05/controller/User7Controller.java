package kr.co.ch05.controller;

import kr.co.ch05.dto.User7DTO;
import kr.co.ch05.service.User7Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class User7Controller {

    private final User7Service service;

    @GetMapping("/user7/register")
    public String register(){
        return "/user7/register";
    }

    @PostMapping("/user7/register")
    public String register(User7DTO user7DTO){
        service.regist(user7DTO);

        return "redirect:/user7/list";
    }

    @GetMapping("/user7/modify")
    public String modify(@RequestParam("user_id") String user_id, Model model){

        User7DTO user7DTO = service.findById(user_id);

        model.addAttribute(user7DTO);

        return "/user7/modify";
    }

    @PostMapping("/user7/modify")
    public String modify(User7DTO user7DTO){
        service.modify(user7DTO);
        return "redirect:/user7/list";
    }

    @GetMapping("/user7/list")
    public String list(Model model){
        List<User7DTO> dtoList = service.findAll();
        model.addAttribute("dtoList", dtoList);
        return "/user7/list";
    }

    @GetMapping("/user7/delete")
    public String delete(String user_id){
        service.remove(user_id);
        return "redirect:/user7/list";
    }
}
