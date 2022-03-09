package fr.idmc.sid.coursesmanagement.courses.domain.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@EqualsAndHashCode
@Accessors(chain = true)
public class Classroom {
    @Id
    private String name;

    private int room;

    private int weekNumber;

    @OneToMany
    private List<Student> students;

    @OneToOne
    private Professor professor;
}
