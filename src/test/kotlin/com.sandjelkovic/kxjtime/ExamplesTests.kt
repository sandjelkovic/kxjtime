package com.sandjelkovic.kxjtime

import org.junit.jupiter.api.Test
import java.time.ZonedDateTime

/**
 * @author sandjelkovic
 * @date 14.6.18.
 */
internal class ExamplesTests {

    @Test
    fun `Example with multiple Durations and ZonedDateTimes combined`() {
        val now = ZonedDateTime.now()!!

//        val createdAt = ZonedDateTime.now().minusDays(10).minusHours(1).minusMinutes(5)!!
        val createdAt = 10.days and 1.hours and 5.minutes before now

        // works with already overridden operators for Duration
        if (createdAt.isBefore(30.minutes + 10.seconds + 3.hours after now)) {
            // do something
        }

        // works with already overridden operators for ZonedDateTime and Duration as well
        val scheduledTime = now + 2.hours

        if ((5.minutes after scheduledTime).isBefore(now)) {
            // do something else
        }
        if (now.isAfter(12.hours after scheduledTime)) {
            // do something late
        }

    }
}
