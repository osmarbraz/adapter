
import com.adapter.RoundHole;
import com.adapter.RoundPeg;
import com.adapter.SquarePeg;
import com.adapter.SquarePegAdapter;

public class Principal {

    public static void main(String[] args) {
        // Round se encaixa, sem surpresa.
        RoundHole hole = new RoundHole(5.0d);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("O pino redondo r5 se encaixa no furo redondo r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Não compila.

        // Adapter resolve o problema.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("O pino quadrado w2 se encaixa no furo redondo r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("O pino quadrado w20 não cabe no furo redondo r5.");
        }
    }
}
