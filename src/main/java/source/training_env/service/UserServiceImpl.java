package source.training_env.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import source.training_env.DTO.UserMapper;
import source.training_env.DTO.UserRequestDTO;
import source.training_env.DTO.UserResponseDTO;
import source.training_env.entity.User;
import source.training_env.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponseDTO getById(Long id) {
        return userRepository.findById(id)
                .map(UserMapper::toResponseDTO)
                .orElse(null);
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(UserMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponseDTO createUser(UserRequestDTO dto) {
        User user = UserMapper.toEntity(dto);
        userRepository.save(user);
        return UserMapper.toResponseDTO(user);
    }

    @Override
    public UserResponseDTO updateUser(Long id, UserRequestDTO userDTO) {
        User user = userRepository.findById(id)
                .orElse(null);
        if(user == null) return null;

        user.setUsername(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());

        userRepository.save(user);

        return UserMapper.toResponseDTO(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
