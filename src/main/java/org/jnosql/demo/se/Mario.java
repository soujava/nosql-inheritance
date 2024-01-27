package org.jnosql.demo.se;


import jakarta.nosql.Column;
import jakarta.nosql.Entity;
import net.datafaker.Faker;
import net.datafaker.providers.videogame.SuperMario;
import org.eclipse.jnosql.mapping.DiscriminatorValue;

import java.util.UUID;

@Entity
@DiscriminatorValue("MARIO")
public class Mario extends GameCharacter {

    @Column
    private String locations;



    public String getLocations() {
        return locations;
    }


    @Override
    public String toString() {
        return "Mario{" +
                "locations='" + locations + '\'' +
                ", id=" + id +
                ", type=" + type +
                ", character='" + character + '\'' +
                ", game='" + game + '\'' +
                '}';
    }

    public static Mario of(Faker faker){
        SuperMario superMario = faker.superMario();
        var player = new Mario();
        player.id = UUID.randomUUID();
        player.character = superMario.characters();
        player.game = superMario.games();
        player.locations = superMario.locations();
        return player;
    }
}
