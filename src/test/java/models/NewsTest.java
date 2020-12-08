package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewsTest {

    @Test
    public void NewNewsObjectGetsCorrectlyCreated_true() throws Exception {
        News news = setupNews();
        assertEquals(true, news instanceof News);
    }

    @Test
    public void NewsDescription() throws Exception {
        News news = setupNews ();
        assertEquals("Entertainment", news.getTitle ());
    }

    @Test
    public void getDepartmentId() throws Exception {
        News news = setupNews ();
        assertEquals(2, news.getDepartment_id());
    }


    public News setupNews(){
        return new News("department","Entertainment",1,2);
    }
}


