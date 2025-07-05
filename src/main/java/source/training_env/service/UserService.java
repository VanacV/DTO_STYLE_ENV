package source.training_env.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import source.training_env.DTO.UserRequestDTO;
import source.training_env.DTO.UserResponseDTO;
import source.training_env.repository.UserRepository;

import java.util.List;


public interface UserService {

    UserResponseDTO getById(Long id);
    List<UserResponseDTO> getAllUsers();
    UserResponseDTO createUser(UserRequestDTO user);
    UserResponseDTO updateUser(Long id, UserRequestDTO userDTO);
    void deleteUser(Long id);

}
