package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "human")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "virus_id")
    private Virus virus;
}
