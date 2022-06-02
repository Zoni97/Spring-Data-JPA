package co.develhope.SpringDataJPA.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Classes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String decription;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "classes")
    private List<Enrollments> enrollments;

}
