package fr.idmc.sid.coursesmanagement.courses.infra.hibernate;

import fr.idmc.sid.coursesmanagement.courses.domain.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClassroomRepository extends JpaRepository<Classroom, String> {
    List<Classroom> findAllByWeekNumber(@Param("number") int number);
}
