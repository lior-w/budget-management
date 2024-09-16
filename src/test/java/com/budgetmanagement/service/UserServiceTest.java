//package com.budgetmanagement.service;
//
//import com.budgetmanagement.entity.User;
//import com.budgetmanagement.repository.UserRepository;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.any;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//public class UserServiceTest {
//
//    @MockBean
//    private UserRepository userRepository;
//
//    @Autowired
//    private UserService userService;
//
//    @Test
//    public void testCreateUser() {
//        // Arrange
//        User user = new User();
//        user.setUsername("john_doe");
//        user.setPassword("password");
//        user.setEmail("john.doe@example.com");
//        user.setRole("USER");
//
//        Mockito.when(userRepository.save(any(User.class))).thenReturn(user);
//
//        // Act
//        User createdUser = userService.createUser(user);
//
//        // Assert
//        assertNotNull(createdUser);
//        assertEquals("john_doe", createdUser.getUsername());
//        assertEquals("USER", createdUser.getRole());
//    }
//
//    @Test
//    public void testFindByEmail() {
//        // Arrange
//        User user = new User();
//        user.setUsername("john_doe");
//        user.setPassword("password");
//        user.setEmail("john.doe@example.com");
//        user.setRole("USER");
//
//        Mockito.when(userRepository.findByEmail("john.doe@example.com")).thenReturn(Optional.of(user));
//
//        // Act
//        Optional<User> foundUser = userService.findByEmail("john.doe@example.com");
//
//        // Assert
//        assertTrue(foundUser.isPresent());
//        assertEquals("john_doe", foundUser.get().getUsername());
//    }
//}
