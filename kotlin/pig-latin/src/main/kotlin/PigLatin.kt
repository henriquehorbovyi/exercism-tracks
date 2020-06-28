object PigLatin {

    fun translate(phrase: String): String {
        return phrase
            .split(" ")
            .joinToString(", ") { word ->
                if (word.startsWithVowel())
                    word.appendAy()
                else {
                    word.moveConsonantsToTheEnd().appendAy()
                }
            }
    }

    private fun String.appendAy(): String {
        return removeSuffix("a").plus("ay")
    }

    private fun String.startsWithVowel(): Boolean {
        val vowels = listOf("a", "e", "i", "o", "u", "yt", "xr")
        val firstLetter = first().toString()
        val firstSyllable = firstLetter + get(1)
        return (firstSyllable in vowels) || (firstLetter in vowels)
    }

    private fun String.moveConsonantsToTheEnd(): String {
        val vowels = listOf("a", "e", "i", "o", "u", "yt", "xr")

        val firstLetter = first().toString()
        return removePrefix(firstLetter).plus(firstLetter)
    }

}

fun main() {
    val translation = PigLatin.translate("rhythm")
    println(translation)
}