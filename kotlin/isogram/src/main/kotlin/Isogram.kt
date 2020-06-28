object Isogram {

    fun isIsogram(input: String): Boolean {
        return input
            .replace("[- ]".toRegex(), "")
            .toLowerCase()
            .run { toSet().count() == count() }
    }
}
