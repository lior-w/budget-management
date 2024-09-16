//package com.budgetmanagement.controller;
//
//import com.budgetmanagement.entity.User;
//import com.budgetmanagement.service.UserService;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//import static org.mockito.ArgumentMatchers.any;
//
//@WebMvcTest(UserController.class)
//public class UserControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private UserService userService;
//
//    @Test
//    public void testCreateUser() throws Exception {
//        // Arrange
//        User user = new User();
//        user.setUsername("john_doe");
//        user.setPassword("password");
//        user.setEmail("john.doe@example.com");
//        user.setRole("USER");
//
//        Mockito.when(userService.createUser(any(User.class))).thenReturn(user);
//
//        // Act & Assert
//        mockMvc.perform(post("/api/users")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\"username\":\"john_doe\",\"password\":\"password\",\"email\":\"john.doe@example.com\",\"role\":\"USER\"}"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.username").value("john_doe"))
//                .andExpect(jsonPath("$.email").value("john.doe@example.com"));
//    }
//
//    @Test
//    public void testGetUserByEmail() throws Exception {
//        // Arrange
//        User user = new User();
//        user.setUsername("john_doe");
//        user.setPassword("password");
//        user.setEmail("john.doe@example.com");
//        user.setRole("USER");
//
//        Mockito.when(userService.findByEmail("john.doe@example.com")).thenReturn(Optional.of(user));
//
//        // Act & Assert
//        mockMvc.perform(get("/api/users/email/john.doe@example.com"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.username").value("john_doe"))
//                .andExpect(jsonPath("$.email").value("john.doe@example.com"));
//    }
//}
