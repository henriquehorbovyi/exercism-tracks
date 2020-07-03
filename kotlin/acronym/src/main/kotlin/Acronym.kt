object Acronym {

    fun generate(phrase: String): String {
        return phrase
            .splitToSequence(" ", "_", "-")
            .filter { it.isNotBlank() }
            .map { it.first().toUpperCase() }
            .joinToString("")
    }
}
