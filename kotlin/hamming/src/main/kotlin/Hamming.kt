import java.lang.IllegalArgumentException

object Hamming{
    fun compute(dna1: String, dna2: String): Int {
        if (dna1.length != dna2.length)
            throw IllegalArgumentException("left and right strands must be of equal length.")

        return (dna1 zip dna2).count{ (first, second) -> first != second }
    }
}