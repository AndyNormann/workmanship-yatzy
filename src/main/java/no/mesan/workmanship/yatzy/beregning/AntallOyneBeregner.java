package no.mesan.workmanship.yatzy.beregning;

import no.mesan.workmanship.yatzy.domene.Sum;
import no.mesan.workmanship.yatzy.domene.Yatzykombinasjon;

public class AntallOyneBeregner implements YatzyBeregner {
    @Override
    public Integer beregnPoengsum(Yatzykombinasjon yatzykombinasjon, Integer... terninger) {
        int antallOyne = 0;
        for (Integer terning : terninger) {
            antallOyne += terning;
        }
        return antallOyne;
    }
}
