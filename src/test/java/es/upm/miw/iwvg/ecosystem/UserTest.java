package es.upm.miw.iwvg.ecosystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(2, "Laura", "Canelada");
    }

    @Test
    void testUserInStringString() {
        assertEquals(2, user.getNumber());
        assertEquals("Laura", user.getName());
        assertEquals("Canelada", user.getFamilyName());
    }

    @Test
    void testUserFullName(){
        assertEquals("Laura Canelada", user.fullName());
    }

    @Test
    void testInitials(){
        assertEquals("L.", user.initials());
    }

    @Test
    void testGetNumber(){
        assertEquals(2, user.getNumber());
    }

    @Test
    void testGetName(){
        assertEquals("Laura", user.getName());
    }

    @Test
    void testGetFullName(){
        assertEquals("Canelada", user.getFamilyName());
    }

    @Test
    void testReverseName() {assertEquals("Canelada, Laura", user.reverseName());}
}