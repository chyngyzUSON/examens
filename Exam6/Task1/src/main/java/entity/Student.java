package entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class Student {
    @Id
    @Column
    private Integer id;

    @Column
    private String name;

    @Column(name = "average_rating")
    private Integer averageRating;

    @Column
    private Integer age;

    @Column
    private String gender;
}
