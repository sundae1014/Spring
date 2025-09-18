package kr.co.ch05.controller;

import kr.co.ch05.dto.User6DTO;
import kr.co.ch05.service.User6Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class User6Controller {

    private final User6Service service;

    @GetMapping("/user6/register")
    public String register(){
        return "/user6/register";
    }

    @PostMapping("/user6/register")
    public String register(User6DTO user6DTO){
        service.regist(user6DTO);

        return "redirect:/user6/list";
    }

    @GetMapping("/user6/modify")
    public String modify(@RequestParam("user_id") String user_id, Model model){

        User6DTO user6DTO = service.findById(user_id);

        model.addAttribute(user6DTO);

        return "/user6/modify";
    }

    @PostMapping("/user6/modify")
    public String modify(User6DTO user6DTO){
        service.modify(user6DTO);
        return "redirect:/user6/list";
    }

    @GetMapping("/user6/list")
    public String list(Model model){
        List<User6DTO> dtoList = service.findAll();
        model.addAttribute("dtoList", dtoList);
        return "/user6/list";
    }

    @GetMapping("/user6/delete")
    public String delete(String user_id){
        service.remove(user_id);
        return "redirect:/user6/list";
    }
}
