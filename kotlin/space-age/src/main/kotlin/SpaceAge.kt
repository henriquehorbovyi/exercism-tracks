import kotlin.math.pow
import kotlin.math.roundToInt

class SpaceAge(private val years: Long) {

    private val secondsInAYearOnEarth = 31557600.0

    fun onEarth(): Double = (years / secondsInAYearOnEarth) roundTo 2
    fun onMercury(): Double = (years / (secondsInAYearOnEarth * 0.2408467)) roundTo 2
    fun onVenus(): Double = (years / (secondsInAYearOnEarth * 0.61519726)) roundTo 2
    fun onMars(): Double = (years / (secondsInAYearOnEarth * 1.8808158)) roundTo 2
    fun onJupiter(): Double = (years / (secondsInAYearOnEarth * 11.862615)) roundTo 2
    fun onSaturn(): Double = (years / (secondsInAYearOnEarth * 29.447498)) roundTo 2
    fun onUranus(): Double = (years / (secondsInAYearOnEarth * 84.016846)) roundTo 2
    fun onNeptune(): Double = (years / (secondsInAYearOnEarth * 164.79132)) roundTo 2

    private infix fun Double.roundTo(decimalPlace: Int): Double {
        val factor = 10.0.pow(decimalPlace.toDouble())
        return (this * factor).roundToInt() / factor
    }
}
