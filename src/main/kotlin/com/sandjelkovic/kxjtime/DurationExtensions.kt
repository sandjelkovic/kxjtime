package com.sandjelkovic.kxjtime

import java.time.Duration
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZonedDateTime

/**
 * @author sandjelkovic
 * @date 14.6.18.
 */
operator fun Duration.unaryMinus(): Duration = this.negated()

infix fun Duration.before(time: ZonedDateTime): ZonedDateTime = time.minus(this)

infix fun Duration.after(time: ZonedDateTime): ZonedDateTime = time.plus(this)

infix fun Duration.before(instant: Instant): Instant = instant.minus(this)

infix fun Duration.after(instant: Instant): Instant = instant.plus(this)

infix fun Duration.before(time: LocalDateTime): LocalDateTime = time.minus(this)

infix fun Duration.after(time: LocalDateTime): LocalDateTime = time.plus(this)

infix fun Duration.and(other: Duration): Duration = this.plus(other)
