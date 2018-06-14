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
