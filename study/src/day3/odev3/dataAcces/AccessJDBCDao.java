package day3.odev3.dataAcces;

import day3.odev3.entities.Courses;

public class AccessJDBCDao implements ICoursesDao{
    @Override
    public void save(Courses course) {
        System.out.println("kurs JDBC ile veritabanına kaydedildi" );
    }
}
