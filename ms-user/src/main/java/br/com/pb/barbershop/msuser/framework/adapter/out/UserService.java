package br.com.pb.barbershop.msuser.framework.adapter.out;

import br.com.pb.barbershop.msuser.application.out.UserRepository;
import br.com.pb.barbershop.msuser.domain.dto.UserDto;
import br.com.pb.barbershop.msuser.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    public UserDto create(UserDto userDto){
        User user = modelMapper.map(userDto, User.class);
        userRepository.save(user);
        return modelMapper.map(user, UserDto.class);
    }
}
