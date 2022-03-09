package fr.idmc.sid.coursesmanagement.courses.infra.hibernate;

import fr.idmc.sid.coursesmanagement.courses.domain.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, String> {
}
