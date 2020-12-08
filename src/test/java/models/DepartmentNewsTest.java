package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentNewsTest {

    @Test
    public void NewNewsObjectGetsCorrectlyCreated_true() throws Exception {
        DepartmentNews departmentNews = setupDepartmentNews();
        assertEquals(true,  departmentNews instanceof   DepartmentNews);
    }

    @Test
    public void getDescription() throws Exception {
        DepartmentNews   departmentNews =  setupDepartmentNews();
        assertEquals("Entertainment", departmentNews.getDescription ());
    }

    @Test
    public void getDepartmentId() throws Exception {
        DepartmentNews news = setupDepartmentNews ();
        assertEquals(1, news.getDepartment_id());
    }


    public DepartmentNews setupDepartmentNews(){
        return new DepartmentNews("Entertainment","The news about entertainment",1,2);
    }

}