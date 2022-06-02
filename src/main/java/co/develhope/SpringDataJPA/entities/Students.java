package co.develhope.SpringDataJPA.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Students")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column(unique = true)
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "students")
    private List<Enrollments> enrollments;


}
