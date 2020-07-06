import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(localDateTime: LocalDateTime)  {

    constructor(dateTime: LocalDate): this(dateTime.atStartOfDay())

    val date: LocalDateTime = localDateTime.plusSeconds(1_000_000_000)
}
