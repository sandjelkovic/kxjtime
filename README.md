[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.sandjelkovic.kxjtime/kxjtime/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.sandjelkovic.kxjtime/kxjtime/)
[![pipeline status](https://gitlab.com/sandjelkovic/kxjtime/badges/develop/pipeline.svg)](https://gitlab.com/sandjelkovic/kxjtime/commits/develop)
[![Build Status](https://travis-ci.com/sandjelkovic/kxjtime.svg?branch=master)](https://travis-ci.com/sandjelkovic/kxjtime)

# KxjTime
KxjTime is a micro library that provides a convenient way to create [java.time API](https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html) objects.

## Usage
Simplify creation of various objects from `java.time` API.
#### Extensions for Integers and Longs 
Create [Duration](https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html) from Integers
```kotlin
val thirtyMinutes = 30.minutes
val twoMilliseconds = 2.milliseconds
```
Which can be then combined by Kotlin overloaded operators or with infix `and`
```kotlin
val duration1 = 10.days + 1.hours + 5.minutes + 3.seconds
val duration2 = 10.days and 1.hours and 5.minutes and 3.seconds
```
#### Natural language 
Combine [Duration](https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html) with Time-based classes 
```kotlin
val createdAt = 10.days and 1.hours and 5.minutes before ZonedDateTime.now()
val willDoSomethingAt = 30.minutes + 10.seconds + 3.hours after Instant.now()
```
Readable and concise code
```kotlin
if (createdAt.isBefore(30.minutes + 10.seconds + 3.hours after now)) {
    // do something
}
if (now.isAfter(12.hours after scheduledTime)) {
    // do something later
}
```
