package org.jnosql.demo.se;


import jakarta.nosql.Column;
import net.datafaker.Faker;
import net.datafaker.providers.videogame.SuperMario;
import org.eclipse.jnosql.mapping.DiscriminatorValue;

import java.util.UUID;

@DiscriminatorValue("sonic")
public class Mario extends GameCharacter {

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

    public Mario of(Faker faker){
        SuperMario superMario = faker.superMario();
        var player = new Mario();
        player.id = UUID.randomUUID();
        player.character = superMario.characters();
        player.game = superMario.games();
        player.locations = superMario.locations();
        return player;
    }
}
