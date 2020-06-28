
class Pangram{
    companion object {
        fun isPangram(sentence: String): Boolean{
            val letters = "abcdefghijklmnopqrstuvwxyz"
            letters.forEach {
                if(!sentence.contains(it, true)){
                    return false
                }
            }
            return true
        }
    }
}