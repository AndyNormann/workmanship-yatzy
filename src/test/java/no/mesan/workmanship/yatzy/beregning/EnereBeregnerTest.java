package no.mesan.workmanship.yatzy.beregning;

import no.mesan.workmanship.yatzy.domene.Kast;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnereBeregnerTest {
    @Test
    public void beregnPoengForKast_medIngenEnere_skalGiNullPoeng() {
        final EnereBeregner beregner = new EnereBeregner();
        final Kast kastUtenEnere = new Kast(2, 3, 5, 6, 4);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(0, poeng);
    }
    @Test
    public void beregnPoengForKast_medEnEner_skalGiEtPoeng() {
        final EnereBeregner beregner = new EnereBeregner();
        final Kast kastMedEnEner = new Kast(1, 3, 2, 6, 5);

        final int poeng = beregner.beregnPoengForKast(kastMedEnEner);

        assertEquals(1, poeng);
    }
    @Test
    public void beregnPoengForKast_medFemEnere_skalGiEtPoeng() {
        final EnereBeregner beregner = new EnereBeregner();
        final Kast kastMedFemEner = new Kast(1, 1, 1, 1, 1);

        final int poeng = beregner.beregnPoengForKast(kastMedFemEner);

        assertEquals(5, poeng);
    }
}
