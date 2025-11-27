package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // This activates the test profile
class StudentManagementApplicationTests {

    @Test
    void contextLoads() {
        // Test will use H2 database instead of MySQL
        // This verifies that the application context loads successfully
    }

    @Test
    void applicationStarts() {
        // Additional test to ensure the application starts properly
        StudentManagementApplication.main(new String[] {});
    }
}