import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond {

    var date: LocalDateTime

    constructor(date: LocalDate) {
        this.date = date.atStartOfDay().plusSeconds(1_000_000_000)
    }

    constructor(dateTime: LocalDateTime) {
        this.date = dateTime.plusSeconds(1_000_000_000)
    }
}
