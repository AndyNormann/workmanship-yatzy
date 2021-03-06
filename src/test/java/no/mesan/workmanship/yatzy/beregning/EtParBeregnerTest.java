package no.mesan.workmanship.yatzy.beregning;

import no.mesan.workmanship.yatzy.beregning.enkeltberegner.EnereBeregner;
import no.mesan.workmanship.yatzy.beregning.parberegner.EtParBeregner;
import no.mesan.workmanship.yatzy.domene.Kast;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EtParBeregnerTest {
    @Test
    public void beregnPoengForKast_medIngenEnere_skalGiNullPoeng() {
        final EtParBeregner beregner = new EtParBeregner();
        final Kast kastUtenEnere = new Kast(2, 3, 5, 6, 4);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(0, poeng);
    }
}
