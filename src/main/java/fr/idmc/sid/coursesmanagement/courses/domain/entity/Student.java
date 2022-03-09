package fr.idmc.sid.coursesmanagement.courses.domain.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
@EqualsAndHashCode
@Accessors(chain = true)
public class Student implements User {
    @Id
    private String mail;

    private String firstName;

    private String lastName;

    private String password;
}
