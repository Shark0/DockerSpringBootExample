package org.shark.example.service.user;

import lombok.RequiredArgsConstructor;
import org.shark.example.dao.repository.UserRepository;
import org.shark.example.dao.repository.pojo.UserDo;
import org.shark.example.service.base.pojo.ResponseDto;
import org.shark.example.service.user.pojo.UserDto;
import org.shark.example.service.user.pojo.UserRegisterDto;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RegisterService {

    private final UserRepository userRepository;

    public ResponseDto<UserDto> start(UserRegisterDto userRegisterDto) {
        UserDo userDo = new UserDo();
        userDo.setAccount(userRegisterDto.getAccount());
        userDo.setPassword(userRegisterDto.getPassword());
        userDo = userRepository.save(userDo);

        UserDto userDto = new UserDto();
        userDto.setId(userDo.getId());

        return ResponseDto.<UserDto>builder().data(userDto).status(1).build();
    }
}
