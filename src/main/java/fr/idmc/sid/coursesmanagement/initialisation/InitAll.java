package fr.idmc.sid.coursesmanagement.initialisation;

import fr.idmc.sid.coursesmanagement.courses.domain.entity.Classroom;
import fr.idmc.sid.coursesmanagement.courses.domain.entity.Professor;
import fr.idmc.sid.coursesmanagement.courses.domain.entity.Student;
import fr.idmc.sid.coursesmanagement.courses.infra.hibernate.ClassroomRepository;
import fr.idmc.sid.coursesmanagement.courses.infra.hibernate.ProfessorRepository;
import fr.idmc.sid.coursesmanagement.courses.infra.hibernate.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@RequiredArgsConstructor
@Component
public class InitAll {
    Logger logger = LoggerFactory.getLogger(InitAll.class);
    final ClassroomRepository classroomRepository;
    final StudentRepository studentRepository;
    final ProfessorRepository professorRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void initialisation() {
        final Student student1 = new Student().setMail("user@univ.fr").setFirstName("Lassini").setFirstName("Asma").setPassword("password");
        final Professor professor1 = new Professor().setMail("op@univ.fr").setLastName("Perrin").setFirstName("Olivier").setPassword("password");
        final Classroom class1 = new Classroom().setRoom(227).setWeekNumber(12).setName("UML").setProfessor(professor1).setStudents(new ArrayList<>() {{
            add(student1);
        }});
        final Classroom class2 = new Classroom().setRoom(227).setWeekNumber(13).setName("UML").setProfessor(professor1).setStudents(new ArrayList<>() {{
            add(student1);
        }});
        final Classroom class3 = new Classroom().setRoom(227).setWeekNumber(14).setName("UML").setProfessor(professor1).setStudents(new ArrayList<>() {{
            add(student1);
        }});

        studentRepository.save(student1);
        professorRepository.save(professor1);
        classroomRepository.save(class1);
        classroomRepository.save(class2);
        classroomRepository.save(class3);

        logger.info("Initialisation des données terminée");
    }
}
