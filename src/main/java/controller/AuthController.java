package controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginForm loginForm) {
        // Implement your authentication logic here
        // Example: Check credentials, generate token, etc.
        // Return a token or authentication status
        return "Authentication successful";
    }

    @PostMapping("/logout")
    public String logout() {
        // Implement your logout logic here
        // Example: Invalidate the current token
        return "Logout successful";
    }

    // Define a simple LoginForm class for login request payload
    private static class LoginForm {
        private String username;
        private String password;

        // Add getters and setters
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
