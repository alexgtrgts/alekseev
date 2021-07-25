package com.spring.a20072021;

import lombok.*;

import javax.persistence.Entity;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Builder
public class Kurs {
    private String title;
    private List<Student> studentList;

    public List<Student> getAllStudents() {
        return studentList;
    }

}
