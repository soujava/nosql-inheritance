/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *  The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *  and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 * You may elect to redistribute this code under either of these licenses.
 */

package org.jnosql.demo.se;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.nosql.document.DocumentTemplate;
import net.datafaker.Faker;

import java.util.List;


public class App {


    public static void main(String[] args) {
        Faker faker = new Faker();
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            DocumentTemplate template = container.select(DocumentTemplate.class).get();
            Mario mario = Mario.of(faker);
            Sonic sonic = Sonic.of(faker);
            template.insert(List.of(mario, sonic));

            long count = template.count(GameCharacter.class);
            System.out.println("Total of GameCharacter: " + count);

            System.out.println("Find all by Mario: " + template.select(Mario.class).stream().toList());
            System.out.println("Find all by Mario: " + template.select(Sonic.class).stream().toList());
        }
        System.exit(0);
    }

    private App() {
    }
}
