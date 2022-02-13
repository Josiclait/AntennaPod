package com.example.specialeffects;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void particle_isCreated() {
        ParticleEffects particleHandler = new ParticleEffects();
        assertEquals("particle01", particleHandler.createParticle());
    }
}