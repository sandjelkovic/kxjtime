package com.sandjelkovic.kxjtime

import java.time.Duration

/**
 * Create Duration from receiver value handled as nanoseconds
 * @return Duration
 */
inline val Int.nanoseconds: Duration
    get() = Duration.ofNanos(toLong())

/**
 * Create Duration from receiver value handled as milliseconds
 * @return Duration
 */
inline val Int.milliseconds: Duration
    get() = Duration.ofMillis(toLong())

/**
 * Create Duration from receiver value handled as seconds
 * @return Duration
 */
inline val Int.seconds: Duration
    get() = Duration.ofSeconds(toLong())

/**
 * Create Duration from receiver value handled as minutes
 * @return Duration
 */
inline val Int.minutes: Duration
    get() = Duration.ofMinutes(toLong())

/**
 * Create Duration from receiver value handled as hours
 * @return Duration
 */
inline val Int.hours: Duration
    get() = Duration.ofHours(toLong())

/**
 * Create Duration from receiver value handled as days
 * @return Duration
 */
inline val Int.days: Duration
    get() = Duration.ofDays(toLong())

/**
 * Create Duration from receiver value handled as nanoseconds
 * @return Duration
 */
inline val Long.nanoseconds: Duration
    get() = Duration.ofNanos(this)

/**
 * Create Duration from receiver value handled as milliseconds
 * @return Duration
 */
inline val Long.milliseconds: Duration
    get() = Duration.ofMillis(this)

/**
 * Create Duration from receiver value handled as seconds
 * @return Duration
 */
inline val Long.seconds: Duration
    get() = Duration.ofSeconds(this)

/**
 * Create Duration from receiver value handled as minutes
 * @return Duration
 */
inline val Long.minutes: Duration
    get() = Duration.ofMinutes(this)

/**
 * Create Duration from receiver value handled as hours
 * @return Duration
 */
inline val Long.hours: Duration
    get() = Duration.ofHours(this)

/**
 * Create Duration from receiver value handled as days
 * @return Duration
 */
inline val Long.days: Duration
    get() = Duration.ofDays(this)

