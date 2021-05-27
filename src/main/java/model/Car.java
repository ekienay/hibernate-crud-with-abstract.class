package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

/*
---Single Table TYPE---
@Table(name = "CARS")
//@DiscriminatorColumn(name = "CAR_TYPE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
*/

public abstract class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String model;

    @Column
    private String mark;

    public Car() {
    }

    public Car(long id, String model, String mark) {
        this.id = id;
        this.model = model;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
