import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    Admin admin1, admin2, admin3;
    Post post1, post2;

    @BeforeEach
    void setUp() {
        admin1 = new Admin("Corey Shanahan");
        admin2 = new Admin("Saoirse O'Donavan");
        admin3 = new Admin("Ian Barnes");
        post1 = new Post("20093473", "See you all at the ball");
    }

    @AfterEach
    void tearDown() {
        admin1 = null;
        admin2 = null;
        admin3 = null;
        post1 = null;
    }

    @Test
    void deletePost() {
        assertTrue(admin1.deletePost(post1));
        assertFalse(admin1.deletePost(post2));
    }


    @Test
    void setName() {
        assertEquals("Corey Shanahan", admin1.getName());
        admin1.setName("");
        assertEquals("Corey Shanahan", admin1.getName());
    }
}