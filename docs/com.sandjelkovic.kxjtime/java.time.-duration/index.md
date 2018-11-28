[com.sandjelkovic.kxjtime](../index.md) / [java.time.Duration](./index.md)

### Extensions for java.time.Duration

| Name | Summary |
|---|---|
| [after](after.md) | `infix fun Duration.after(zonedDateTime: ZonedDateTime): ZonedDateTime`<br>Add the Duration to ZonedDateTime`infix fun Duration.after(instant: Instant): Instant`<br>Add the Duration to Instant`infix fun Duration.after(time: LocalDateTime): LocalDateTime`<br>Add the Duration to LocalDateTime |
| [and](and.md) | `infix fun Duration.and(other: Duration): Duration`<br>Add two durations |
| [before](before.md) | `infix fun Duration.before(zonedDateTime: ZonedDateTime): ZonedDateTime`<br>Subtract the Duration from ZonedDateTime`infix fun Duration.before(instant: Instant): Instant`<br>Subtract the Duration from Instant`infix fun Duration.before(time: LocalDateTime): LocalDateTime`<br>Subtract the Duration from LocalDateTime |
| [unaryMinus](unary-minus.md) | `operator fun Duration.unaryMinus(): Duration`<br>Returns a copy of this duration with the length negated. |
