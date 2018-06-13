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
    fun getNanoseconds() {
        val duration = integerNumber.nanoseconds

        assertTrue(duration == Duration.ofNanos(integerNumber.toLong()))
    }

    @Test
    fun getMilliseconds() {
        val duration = integerNumber.milliseconds

        assertTrue(duration == Duration.ofMillis(integerNumber.toLong()))
    }

    @Test
    fun getSeconds() {
        val duration = integerNumber.seconds

        assertTrue(duration == Duration.ofSeconds(integerNumber.toLong()))
    }

    @Test
    fun getMinutes() {
        val duration = integerNumber.minutes

        assertTrue(duration == Duration.ofMinutes(integerNumber.toLong()))
    }

    @Test
    fun getHours() {
        val duration = integerNumber.hours

        assertTrue(duration == Duration.ofHours(integerNumber.toLong()))
    }

    @Test
    fun getDays() {
        val duration = integerNumber.days

        assertTrue(duration == Duration.ofDays(integerNumber.toLong()))
    }

    @Test
    fun get10YearsFromDays() {
        val duration = (365 * 10).days

        assertTrue(duration == Duration.ofDays((365 * 10)))
    }
}
