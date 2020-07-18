object ResistorColorDuo {

    fun value(vararg colors: Color): Int {
        var value = ""
        repeat(2) { value += colors[it].ordinal }
        return value.toInt()
    }
}