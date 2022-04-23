package com.adapter;

import com.adapter.square.SquarePeg;
import com.adapter.round.RoundPeg;

/**
 * Adaptador permite encaixar pinos quadrados em furos redondos.
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calcule um raio de círculo mínimo, que pode caber neste pino.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
