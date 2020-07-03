object Acronym {
    fun generate(phrase: String): String {
        var acronym = phrase[0].toString().toUpperCase()
        phrase
            .replace("- ", "")
            .replace("-", " ")
            .replace("_", "")
            .apply {
                forEachIndexed { index, c ->
                    if (c.isWhitespace())
                        acronym += this[index + 1].toUpperCase()
                }
            }

        return acronym
    }
}
