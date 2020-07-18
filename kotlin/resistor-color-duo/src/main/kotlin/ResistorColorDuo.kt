object ResistorColorDuo {

    fun value(vararg colors: Color): Int {
        return (colors[0].ordinal.toString() + colors[1].ordinal.toString()).toInt()
    }
}