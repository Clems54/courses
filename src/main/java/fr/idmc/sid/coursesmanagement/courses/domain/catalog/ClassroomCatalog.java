package fr.idmc.sid.coursesmanagement.courses.domain.catalog;

import fr.idmc.sid.coursesmanagement.courses.domain.entity.Classroom;

import java.util.List;

public interface ClassroomCatalog {
    List<Classroom> findAllCoursesByStudentAndNumberOfWeek(String name, int number);
}
