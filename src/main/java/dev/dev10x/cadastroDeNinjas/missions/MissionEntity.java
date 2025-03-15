package dev.dev10x.cadastroDeNinjas.missions;

import dev.dev10x.cadastroDeNinjas.ninjas.NinjaEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tb_mission")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String difficult;

    @OneToMany(mappedBy = "missions")
    private List<NinjaEntity> ninja;
}
