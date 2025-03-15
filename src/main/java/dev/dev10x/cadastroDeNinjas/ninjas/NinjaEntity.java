package dev.dev10x.cadastroDeNinjas.ninjas;

import dev.dev10x.cadastroDeNinjas.missions.MissionEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_ninja")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NinjaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private int age;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private MissionEntity missions;


}
