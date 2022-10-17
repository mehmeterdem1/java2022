package day3.odev3.dataAcces;

import day3.odev3.entities.Courses;

public class AccessHibernateDao implements ICoursesDao{
    @Override
    public void save(Courses course) {
        System.out.println("kurs hibernate ile kaydedildi");
    }
}
