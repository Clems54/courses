package fr.idmc.sid.coursesmanagement.courses.infra.hibernate;

import fr.idmc.sid.coursesmanagement.courses.domain.catalog.ClassroomCatalog;
import fr.idmc.sid.coursesmanagement.courses.domain.entity.Classroom;
import fr.idmc.sid.coursesmanagement.courses.domain.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ClassroomHibernateAdapter implements ClassroomCatalog {
    private final ClassroomRepository repository;

    @Override
    public List<Classroom> findAllCoursesByStudentAndNumberOfWeek(String name, int number) {
        final List<Classroom> classrooms = new ArrayList<>();
        repository.findAllByWeekNumber(number).forEach(classroom -> {
            if (classroom.getStudents().stream().map(Student::getMail).anyMatch(mail -> mail.equals(name))) {
                classrooms.add(classroom);
            }
        });

        return classrooms;
    }
}
