package com.sandjelkovic

import days
import hours
import milliseconds
import minutes
import nanoseconds
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import seconds
import java.time.Duration

/**
 * @author sandjelkovic
 * @date 13.6.18.
 */
internal class TimeExtensionsTest {
    private val integerNumber: Int = 5

    @Test
    fun `Should create nanoseconds Duration from integer`() {
        val duration = integerNumber.nanoseconds

        assertTrue(duration == Duration.ofNanos(integerNumber.toLong()))
    }

    @Test
    fun `Should create miliseconds Duration from integer`() {
        val duration = integerNumber.milliseconds

        assertTrue(duration == Duration.ofMillis(integerNumber.toLong()))
    }

    @Test
    fun `Should create seconds Duration from integer`() {
        val duration = integerNumber.seconds

        assertTrue(duration == Duration.ofSeconds(integerNumber.toLong()))
    }

    @Test
    fun `Should create nanoseconds duration from integer`() {
        val duration = integerNumber.minutes

        assertTrue(duration == Duration.ofMinutes(integerNumber.toLong()))
    }

    @Test
    fun `Should create hours Duration from integer`() {
        val duration = integerNumber.hours

        assertTrue(duration == Duration.ofHours(integerNumber.toLong()))
    }

    @Test
    fun `Should create days Duration from integer`() {
        val duration = integerNumber.days

        assertTrue(duration == Duration.ofDays(integerNumber.toLong()))
    }

    @Test
    fun `Should create 10 years of Duration via days from integer`() {
        val duration = (365 * 10).days

        assertTrue(duration == Duration.ofDays((365 * 10)))
    }
}
