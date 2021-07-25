package com.spring.a20072021;

import lombok.*;

import javax.persistence.Entity;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Builder

public class Student {
    private String name;
    private String secondName;
    private Integer kurs;
    private Double AvMark;
    private String science;
}
