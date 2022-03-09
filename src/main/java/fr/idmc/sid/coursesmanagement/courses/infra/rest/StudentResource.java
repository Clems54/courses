package fr.idmc.sid.coursesmanagement.courses.infra.rest;

import fr.idmc.sid.coursesmanagement.courses.domain.catalog.ClassroomCatalog;
import fr.idmc.sid.coursesmanagement.courses.domain.entity.Classroom;
import fr.idmc.sid.coursesmanagement.utils.infra.rest.DefaultResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("students")
@RequiredArgsConstructor
public class StudentResource extends DefaultResource {
    final ClassroomCatalog classroomCatalog;

    @GetMapping("weeks/{number}/courses")
    public List<Classroom> getCoursesByWeekNumber(@PathVariable("number") int number, Principal principal) {
        return classroomCatalog.findAllCoursesByStudentAndNumberOfWeek(principal.getName(), number);
    }
}
