package day3.odev3.business;

import day3.odev3.dataAcces.ICoursesDao;
import day3.odev3.entities.Courses;
import day3.odev3.logging.ILogger;

import java.util.List;


public class CourseManager extends Courses{
    private ICoursesDao coursesDao;
    private List<ILogger> loggers;

    public CourseManager(ICoursesDao coursesDao, List<ILogger> loggers) {
        super();
        this.coursesDao = coursesDao;
        this.loggers = loggers;
    }

    public void save(Courses course) throws Exception {


        /*if (course.getCourseName())  {
            throw new Exception("kurs isimleri farklı olmalıdır");
        }*/

        if (course.getCoursePrice() <= 0) {
            throw new Exception("ürün fiyatı sıfırdan büyük olmalıdır");
        }

        System.out.println(course.getCourseName());
        coursesDao.save(course);

        for (ILogger logger : loggers) {
            logger.logMessage(course.getCourseName());
            
        }

    }
}
