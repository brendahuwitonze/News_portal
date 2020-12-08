package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {
    @Test
    public void user() throws Exception {
        Users users = setupUsers();
        assertEquals(true, users instanceof Users);
    }

    @Test
    public void position() throws Exception {
        Users users = setupUsers ();
        assertEquals("manager", users.getPosition ());
    }

    @Test
    public void user_role() throws Exception {
        Users users = setupUsers ();
        assertEquals("controls", users.getUser_role());
    }


    public Users setupUsers(){
        return new Users("brendah","manager","controls");
    }


}