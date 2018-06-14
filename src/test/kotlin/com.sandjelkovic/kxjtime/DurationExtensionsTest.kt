package com.sandjelkovic.kxjtime

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.time.Duration
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZonedDateTime

/**
 * @author sandjelkovic
 * @date 14.6.18.
 */
internal class DurationExtensionsTest {
    val fiveMinutes = Duration.ofMinutes(5)!!
    val fiveHours = Duration.ofHours(5)!!

    @Test
    fun `Should negate positive duration via - operator`() {
        val tenMinutes = Duration.ofMinutes(10)

        val negatedDuration = -tenMinutes

        assertTrue(negatedDuration == Duration.ofMinutes(-10))
    }

    @Test
    fun `Should negate negative duration via - operator`() {
        val minusTenMinutes = Duration.ofMinutes(-10)

        val negatedDuration = -minusTenMinutes

        assertTrue(negatedDuration == Duration.ofMinutes(10))
    }

    @Test
    fun `Should combine durations with an infix function`() {
        val twoHours: Duration = Duration.ofHours(2)
        val thirtyMinutes: Duration = Duration.ofMinutes(30)

        val combinedDuration = twoHours and thirtyMinutes

        assertTrue(combinedDuration == Duration.ofHours(2).plus(Duration.ofMinutes(30)))
    }

    @Test
    fun `Should combine more than two durations via infix function chaining`() {
        val twoHours: Duration = Duration.ofHours(2)
        val thirtyMinutes: Duration = Duration.ofMinutes(30)
        val tenMinutes: Duration = Duration.ofMinutes(10)
        val fiveSeconds: Duration = Duration.ofSeconds(5)

        val combinedDuration = twoHours and thirtyMinutes and fiveSeconds and tenMinutes and twoHours

        val desiredDuration = Duration.ofHours(4).plusMinutes(40).plusSeconds(5)
        assertTrue(combinedDuration == desiredDuration)
    }

    @Test
    fun `Should use infix before by subtracting Duration from ZonedDateTime`() {
        val zonedDateTime = ZonedDateTime.now()!!

        val calculatedTime = fiveMinutes before zonedDateTime

        assertTrue(calculatedTime == zonedDateTime.minusMinutes(5))
    }

    @Test
    fun `Should use infix after by adding Duration to ZonedDateTime`() {
        val zonedDateTime = ZonedDateTime.now()!!

        val calculatedTime = fiveHours after zonedDateTime

        assertTrue(calculatedTime == zonedDateTime.plusHours(5))
    }

    @Test
    fun `Should use infix before by subtracting Duration from LocalDateTime`() {
        val localDateTime = LocalDateTime.now()!!

        val calculatedTime = fiveMinutes before localDateTime

        assertTrue(calculatedTime == localDateTime.minusMinutes(5))
    }

    @Test
    fun `Should use infix after by adding Duration to LocalDateTime`() {
        val localDateTime = LocalDateTime.now()!!

        val calculatedTime = fiveHours after localDateTime

        assertTrue(calculatedTime == localDateTime.plusHours(5))
    }

    @Test
    fun `Should use infix before by subtracting Duration from an Instant`() {
        val instant = Instant.now()!!

        val calculatedTime = fiveMinutes before instant

        assertTrue(calculatedTime == instant.minusSeconds(5 * 60))
    }

    @Test
    fun `Should use infix after by adding Duration to an Instant`() {
        val instant = Instant.now()!!

        val calculatedTime = fiveHours after instant

        assertTrue(calculatedTime == instant.plusSeconds(5 * 60 * 60))
    }

}
