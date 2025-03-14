package dev.dev10x.cadastroDeNinjas.missions;

import dev.dev10x.cadastroDeNinjas.ninjas.NinjaEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_mission")
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

    public MissionEntity() {
    }

    public MissionEntity(Long id, String difficult, String name) {
        this.id = id;
        this.difficult = difficult;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDifficult() {
        return difficult;
    }

    public void setDifficult(String difficult) {
        this.difficult = difficult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
