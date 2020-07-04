import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(localDateTime: LocalDateTime)  {

    var date: LocalDateTime = localDateTime.plusSeconds(1_000_000_000)

    constructor(dateTime: LocalDate) {
        date = dateTime.atStartOfDay().plusSeconds(1_000_000_000)
    }
}
