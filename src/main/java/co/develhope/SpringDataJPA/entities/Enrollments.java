package co.develhope.SpringDataJPA.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Enrollments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Students students;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Classes classes;
}
