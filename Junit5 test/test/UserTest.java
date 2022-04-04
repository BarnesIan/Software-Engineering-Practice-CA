import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user1, user2, user3;

    @BeforeEach
    void setUp() {
        user1 = new User("20093473", "Corey Shanahan");
        user2 = new User("20093474", "Saoirse O'Donavan");
        user3 = new User("20093475", "Ian Barnes");
    }

    @AfterEach
    void tearDown() {
        user1 = null;
        user2 = null;
        user3 = null;
    }

    @Test
    void createPost() {
        assertTrue(user1.createPost("Society Meeting at 8pm"));
        assertFalse(user2.createPost(""));
        assertTrue(user3.createPost("Can't wait to see ye all at the ball"));
    }


    @Test
    void setStudentID() {
        assertEquals("20093473", user1.getStudentID());
        user1.setStudentID("200q3473");
        assertEquals("20093473", user1.getStudentID());
        user1.setStudentID("20093472");
        assertEquals("20093472", user1.getStudentID());
    }

    @Test
    void setName() {
        assertEquals("Ian Barnes", user3.getName());
        user3.setName("");
        assertEquals("Ian Barnes", user3.getName());
        user3.setName("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        assertEquals("Ian Barnes", user3.getName());
    }
}