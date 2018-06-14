package com.sandjelkovic

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.time.Duration

/**
 * @author sandjelkovic
 * @date 14.6.18.
 */
internal class DurationExtensionsKtTest {

    @Test
    fun `Should negate positive duration via - operator`() {
        val tenMinutes = Duration.ofMinutes(10)

        val negatedDuration = -tenMinutes

        Assertions.assertTrue(negatedDuration == Duration.ofMinutes(-10))
    }

    @Test
    fun `Should negate negative duration via - operator`() {
        val minusTenMinutes = Duration.ofMinutes(-10)

        val negatedDuration = -minusTenMinutes

        Assertions.assertTrue(negatedDuration == Duration.ofMinutes(10))
    }
}
