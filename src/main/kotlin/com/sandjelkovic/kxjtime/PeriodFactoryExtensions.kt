package com.sandjelkovic.kxjtime

import java.time.Period


inline val Int.weeks: Period
    get() = Period.ofWeeks(this)!!

inline val Int.months: Period
    get() = Period.ofMonths(this)!!

inline val Int.years: Period
    get() = Period.ofYears(this)!!
