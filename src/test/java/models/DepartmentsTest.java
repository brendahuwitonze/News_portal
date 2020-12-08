package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentsTest {
    @Test
    public void depart() throws Exception {
        Departments depart = setupDepart();
        assertEquals(true, depart instanceof Departments);
    }

    @Test
    public void name() throws Exception {
        Departments depart = setupDepart ();
        assertEquals("news", depart.getName ());
    }


    public Departments setupDepart(){
        return new Departments ("helo","news");
    }

}