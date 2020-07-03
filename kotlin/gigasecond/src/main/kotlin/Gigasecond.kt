import java.time.LocalDate
import java.time.LocalDateTime

object Gigasecond {

    operator fun invoke(date: LocalDate): LocalDateTime {
        return date.atStartOfDay().plusSeconds(1_000_000_000)
    }

    operator fun invoke(date: LocalDateTime): LocalDateTime {
        return date.plusSeconds(1_000_000_000)
    }
}
