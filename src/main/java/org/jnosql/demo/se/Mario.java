package org.jnosql.demo.se;


import jakarta.nosql.Column;
import org.eclipse.jnosql.mapping.DiscriminatorValue;

@DiscriminatorValue("sonic")
public class Mario extends Player {

    @Column
    private String locations;



    public String getLocations() {
        return locations;
    }


    @Override
    public String toString() {
        return "Mario{" +
                "id=" + id +
                ", character='" + character + '\'' +
                ", game='" + game + '\'' +
                '}';
    }
}
