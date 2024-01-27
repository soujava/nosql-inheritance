package org.jnosql.demo.se;

import jakarta.nosql.Column;
import org.eclipse.jnosql.mapping.DiscriminatorValue;

@DiscriminatorValue("sonic")
public class Sonic extends GameCharacter {

    @Column
    private String zone;


    @Override
    public String toString() {
        return "Sonic{" +
                "id=" + id +
                ", character='" + character + '\'' +
                ", game='" + game + '\'' +
                '}';
    }
}
