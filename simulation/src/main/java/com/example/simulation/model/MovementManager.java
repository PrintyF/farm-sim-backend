package com.example.simulation.model;

import java.util.ArrayList;

public class MovementManager {
    private Double x;
    private Double y;

    private int angle;
    private int speed;

    public static final int MAX_SPEED = 3;

    public MovementManager(Double x, Double y, int angle, int speed) {}

    public void move() {
        Double angleInRadians = angle * (Math.PI / 180);

        this.x = x + Math.cos(angleInRadians) * (this.speed / MAX_SPEED);
        this.y = y + Math.sin(angleInRadians) * (this.speed / MAX_SPEED);
    }

    public void processActions(ArrayList<Integer> actions) {
        if (actions.get(0).equals(1))
            this.turnLeft();
        if (actions.get(1).equals(1))
            this.turnRight();
        if (actions.get(2).equals(1))
            this.accelerate();
        if (actions.get(3).equals(1))
            this.decelerate();
    }

    private void decelerate() {
        if (this.speed >= 0) {
            this.speed--;
        }
    }

    private void accelerate() {
        if (this.speed <= MAX_SPEED) {
            this.speed++;
        }
    }

    private void turnRight() {
        this.angle -= 5;
    }

    private void turnLeft() {
        this.angle += 5;
    }
}
