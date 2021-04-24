package entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "medicine")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "virus_id")
    private Virus virus;

    @OneToMany
    @JoinColumn(name = "human_id")
    private List<Human> humans;
}
