package day3.odev3;

import day3.odev3.business.CourseManager;
import day3.odev3.dataAcces.AccessHibernateDao;
import day3.odev3.entities.Courses;
import day3.odev3.entities.Educators;
import day3.odev3.logging.FileLogger;
import day3.odev3.logging.DatabaseLogger;
import day3.odev3.logging.ILogger;
import day3.odev3.logging.MailLogger;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {


        //List<ILogger> loggers = new ArrayList<>();
        Educators educator1 = new Educators(1, "Engin");
        Educators educator2 = new Educators(2, "Mehmet");

        Courses course1 = new Courses(1, "java eğitimi", 10);
        Courses course2 = new Courses(2,"jhas eğitimi", 20);


        CourseManager courseManager = new CourseManager(new AccessHibernateDao(), new DatabaseLogger());
        courseManager.save(course1);
        courseManager.save(course2);

        //ILogger logger = new DatabaseLogger();









    }
}
