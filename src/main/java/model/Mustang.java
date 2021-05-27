package model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
/*
For Single Table
@DiscriminatorValue("MG")
 */
public class Mustang extends Car {

    public Mustang() {
    }

    public Mustang(int id, String model, String mark) {
        super(id, model, mark);
    }

}
