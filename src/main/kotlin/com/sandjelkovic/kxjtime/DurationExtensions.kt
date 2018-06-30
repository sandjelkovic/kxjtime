package com.sandjelkovic.kxjtime

import java.time.Duration
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZonedDateTime

/**
 * @author sandjelkovic
 * @date 14.6.18.
 */

/**
 *  Returns a copy of this duration with the length negated.
 *  @return a {@code Duration} based on this duration
 *
 */
operator fun Duration.unaryMinus(): Duration = this.negated()

/**
 * Subtract the Duration from ZonedDateTime
 * @return ZonedDateTime minus the Duration
 */
infix fun Duration.before(zonedDateTime: ZonedDateTime): ZonedDateTime = zonedDateTime.minus(this)

/**
 * Add the Duration to ZonedDateTime
 * @return ZonedDateTime plus the Duration
 */
infix fun Duration.after(zonedDateTime: ZonedDateTime): ZonedDateTime = zonedDateTime.plus(this)

/**
 * Add the Duration to Instant
 * @return Instant minus the Duration
 */
infix fun Duration.before(instant: Instant): Instant = instant.minus(this)

/**
 * Add the Duration to Instant
 * @return Instant plus the Duration
 */
infix fun Duration.after(instant: Instant): Instant = instant.plus(this)

/**
 * Subtract the Duration from LocalDateTime
 * @return LocalDateTime minus the Duration
 */
infix fun Duration.before(time: LocalDateTime): LocalDateTime = time.minus(this)

/**
 * Add the Duration to LocalDateTime
 * @return LocalDateTime plus the Duration
 */
infix fun Duration.after(time: LocalDateTime): LocalDateTime = time.plus(this)

/**
 * Add two durations
 * @return Duration added to other Duration
 */
infix fun Duration.and(other: Duration): Duration = this.plus(other)
