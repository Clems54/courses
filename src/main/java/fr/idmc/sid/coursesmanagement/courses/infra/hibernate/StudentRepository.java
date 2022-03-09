package fr.idmc.sid.coursesmanagement.courses.infra.hibernate;

import fr.idmc.sid.coursesmanagement.courses.domain.entity.Classroom;
import fr.idmc.sid.coursesmanagement.courses.domain.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, String> {
}
