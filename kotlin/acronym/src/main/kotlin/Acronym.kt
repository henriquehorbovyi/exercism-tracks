object Acronym {

    fun generate(phrase: String): String {
        return phrase
            .toUpperCase()
            .splitToSequence(" ", "_", "-")
            .filter { it.isNotBlank() }
            .map { it.first() }
            .joinToString("")
    }
}
