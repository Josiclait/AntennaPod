package de.danoeh.antennapod.core.util;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.example.specialeffects.ParticleEffects;

public class SpecialEffectsTest {
    @Test
    public void particle_isCreated() {
        ParticleEffects particleHandler = new ParticleEffects();
        assertEquals("particle01", particleHandler.createParticle());
    }
}