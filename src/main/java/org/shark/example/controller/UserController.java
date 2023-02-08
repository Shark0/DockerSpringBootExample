package org.shark.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.shark.example.service.base.pojo.ResponseDto;
import org.shark.example.service.user.RegisterService;
import org.shark.example.service.user.pojo.UserRegisterDto;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    private final RegisterService registerService;
    @PostMapping("/register")
    public ResponseDto register(@RequestBody UserRegisterDto userRegisterDto) {
        return registerService.start(userRegisterDto);
    }
}
