package com.sandjelkovic.kxjtime

import java.time.Period

/**
 * Create a Period from receiver value handled as weeks
 * @return Period
 */
inline val Int.weeks: Period
    get() = Period.ofWeeks(this)!!

/**
 * Create a Period from receiver value handled as months
 * @return Period
 */
inline val Int.months: Period
    get() = Period.ofMonths(this)!!

/**
 * Create a Period from receiver value handled as years
 * @return Period
 */
inline val Int.years: Period
    get() = Period.ofYears(this)!!
