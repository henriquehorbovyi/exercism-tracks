import java.lang.IllegalArgumentException

object Hamming{
    fun compute(dna1: String, dna2: String): Int {
        return if(dna1.length == dna2.length){
            (dna1 zip dna2).count{ (first, second) -> first != second }
        }else{
            throw IllegalArgumentException("left and right strands must be of equal length.")
        }
    }
}