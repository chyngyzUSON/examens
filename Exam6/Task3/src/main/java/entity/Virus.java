package entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "virus")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Virus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "medicine_id")
    private Medicine medicine;

    @OneToMany
    private List<Human> humans;

}
