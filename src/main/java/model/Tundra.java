package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
/*
For Single Table
@DiscriminatorValue("TD")
 */
public class Tundra extends Car {

    public Tundra() {
    }

    public Tundra(int id, String model, String mark) {
        super(id, model, mark);
    }
}
