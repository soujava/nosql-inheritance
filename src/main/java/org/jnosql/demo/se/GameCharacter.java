package org.jnosql.demo.se;


import jakarta.nosql.Column;
import jakarta.nosql.Entity;
import jakarta.nosql.Id;
import org.eclipse.jnosql.mapping.DiscriminatorColumn;
import org.eclipse.jnosql.mapping.Inheritance;

import java.util.Objects;
import java.util.UUID;

@Entity
@DiscriminatorColumn("type")
@Inheritance
public abstract class GameCharacter {

    @Id
    protected UUID id;

    @Column
    protected String character;

    @Column
    protected String game;


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GameCharacter gameCharacter = (GameCharacter) o;
        return Objects.equals(id, gameCharacter.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
