package dev.dev10x.cadastroDeNinjas.ninjas;

import dev.dev10x.cadastroDeNinjas.missions.MissionEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_ninja")
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

    public NinjaEntity() {
    }

    public NinjaEntity(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
