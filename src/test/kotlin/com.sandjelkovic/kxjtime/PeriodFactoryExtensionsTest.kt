package com.sandjelkovic.kxjtime

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.time.Period

/**
 * @author sandjelkovic
 * @date 2018-10-06
 */
internal class PeriodFactoryExtensionsTest {
    private val integerNumber: Int = 5

    @Test
    fun `Should create weeks Period from integer`() {
        val period = integerNumber.weeks

        assertTrue(period == Period.ofWeeks(integerNumber))
    }

    @Test
    fun `Should create months Period from integer`() {
        val period = integerNumber.months

        assertTrue(period == Period.ofMonths(integerNumber))
    }

    @Test
    fun `Should create years Period from integer`() {
        val period = integerNumber.years

        assertTrue(period == Period.ofYears(integerNumber))
    }

    @Test
    fun `Should create years Period from negative integer`() {
        val period = (-integerNumber).weeks

        assertTrue(period == Period.ofWeeks(-integerNumber))
    }

}
