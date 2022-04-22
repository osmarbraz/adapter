package com.adapter;

/**
 * Os Pinos Quadrados não são compatíveis com Furos Redondos (eles foram
 * implementados por equipe de desenvolvimento anterior). Mas temos que
 * integrá-los ao nosso programa.
 */
public class SquarePeg {

    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
