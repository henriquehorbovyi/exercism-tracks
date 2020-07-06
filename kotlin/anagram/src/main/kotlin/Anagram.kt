
// TODO: STILL INCOMPLETE
class Anagram(private val source: String) {

    private val isSourceAnagram: (String) -> Boolean = { word ->
        source.count() == word.count() &&
            !source.equals(word, ignoreCase = true) &&
            word.matches("([$source])\\w+".toRegex(RegexOption.IGNORE_CASE))
    }

    fun match(anagrams: Collection<String>): Set<String> {
        return anagrams
            .filter { word -> isSourceAnagram(word) }
            .toSet()
    }
}
