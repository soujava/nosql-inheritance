package org.jnosql.demo.se;

import jakarta.nosql.Column;
import jakarta.nosql.Entity;
import net.datafaker.Faker;
import net.datafaker.providers.videogame.SonicTheHedgehog;
import org.eclipse.jnosql.mapping.DiscriminatorValue;

import java.util.UUID;

@Entity
@DiscriminatorValue("SONIC")
public class Sonic extends GameCharacter {

    @Column
    private String zone;


    @Override
    public String toString() {
        return "Sonic{" +
                "zone='" + zone + '\'' +
                ", id=" + id +
                ", type=" + type +
                ", character='" + character + '\'' +
                ", game='" + game + '\'' +
                '}';
    }

    public static Sonic of(Faker faker){
        SonicTheHedgehog sonic = faker.sonicTheHedgehog();
        var player = new Sonic();
        player.id = UUID.randomUUID();
        player.character = sonic.character();
        player.game = sonic.game();
        player.zone = sonic.zone();
        return player;
    }
}
