package no.mesan.workmanship.yatzy.presentasjon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class YatzyPresentasjonsmodellImplTest {
    private YatzyPresentasjonsmodellImpl presMod;

    @Before
    public void settOpp() {
        this.presMod = new YatzyPresentasjonsmodellImpl((yatzykombinasjon, terninger) -> 0);
    }

    @Test
    public void vedStartSkalNyRundeVaereAv() {
        assertFalse(this.presMod.nyRundeAction().isEnabled());
    }

    @Test
    public void vedStartSkalKastVaerePaa() {
        assertTrue(this.presMod.kastAction().isEnabled());
    }

    @Test
    public void etterTreKastSkalKastVaereAvOgNyRundePaa() {
        this.presMod.kastAction().actionPerformed(null);
        this.presMod.kastAction().actionPerformed(null);
        this.presMod.kastAction().actionPerformed(null);
        assertFalse(this.presMod.kastAction().isEnabled());
        assertTrue(this.presMod.nyRundeAction().isEnabled());
    }

    @Test
    public void holdtTerningSkalLaasesVedKast() {
        this.presMod.kastAction().actionPerformed(null);
        this.presMod.holdTerningModeller()[0].setValue(true);
        this.presMod.kastAction().actionPerformed(null);
        assertFalse(this.presMod.holdTerningModeller()[0].isEnabled());
    }

    /** TODO **/
}
