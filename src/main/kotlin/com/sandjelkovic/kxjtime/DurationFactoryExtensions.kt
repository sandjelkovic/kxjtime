package com.sandjelkovic.kxjtime

import java.time.Duration

inline val Int.nanoseconds: Duration
    get() = Duration.ofNanos(toLong())

inline val Int.milliseconds: Duration
    get() = Duration.ofMillis(toLong())

inline val Int.seconds: Duration
    get() = Duration.ofSeconds(toLong())

inline val Int.minutes: Duration
    get() = Duration.ofMinutes(toLong())

inline val Int.hours: Duration
    get() = Duration.ofHours(toLong())

inline val Int.days: Duration
    get() = Duration.ofDays(toLong())

inline val Long.nanoseconds: Duration
    get() = Duration.ofNanos(this)

inline val Long.milliseconds: Duration
    get() = Duration.ofMillis(this)

inline val Long.seconds: Duration
    get() = Duration.ofSeconds(this)

inline val Long.minutes: Duration
    get() = Duration.ofMinutes(this)

inline val Long.hours: Duration
    get() = Duration.ofHours(this)

inline val Long.days: Duration
    get() = Duration.ofDays(this)
