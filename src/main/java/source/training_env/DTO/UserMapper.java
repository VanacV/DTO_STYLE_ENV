package source.training_env.DTO;

import source.training_env.entity.User;

public class UserMapper {

    public static User toEntity(UserRequestDTO userRequestDTO) {
        User user = new User();
        user.setUsername(userRequestDTO.getName());
        user.setPassword(userRequestDTO.getPassword());
        user.setEmail(userRequestDTO.getEmail());

        return user;
    }

    public static UserResponseDTO toResponseDTO(User user) {
        return new UserResponseDTO(
            user.getId(),
            user.getUsername(),
            user.getEmail()
        );
    }

}
