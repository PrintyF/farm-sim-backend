package com.example.simulation.model;

import java.util.List;

public class Population {
    private List<Unit> units;

    public Population() {
    }

    public void initPopulation(int populationSize) {
        for (int i = 0; i < populationSize; i++) {
            MovementManager movementManager = new MovementManager(0.0, 0.0, 0, 0);

            units.add(new Unit(movementManager));
        }
    }
}
