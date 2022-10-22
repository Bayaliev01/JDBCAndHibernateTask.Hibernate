package peaksoft.model;

import lombok.*;


import javax.persistence.*;

@Entity
@Table(name = "person")
@Setter
@Getter
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column
    private String name;

    @Column(name = "lastname")
    private String lastName;

    @Column
    private Byte age;

    public User() {
    }

    public User(String name, String lastName, Byte age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

}