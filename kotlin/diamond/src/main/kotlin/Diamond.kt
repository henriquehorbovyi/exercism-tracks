class DiamondPrinter {
    private val alphabet: String = "abcdefghijklmnopqrstuvwxyz"

    fun printToList(char: Char): List<String> {
        val diamond = mutableListOf<String>()
        var piece = ""

        val sequence = alphabet.filter { it <= char.toLowerCase() }.toUpperCase()
        val size = sequence.length


        for (i in 0 until size) {
            for (j in 0 until size * 2 - 1) {
                piece += if (i + j == size - 1 || j - i == size - 1)
                    sequence[i]
                else
                    " "
            }
            diamond.add(piece)
            piece = ""
        }

        for (i in size - 2 downTo 0) {
            for (j in (size * 2) - 2 downTo 0) {
                piece += if (i + j == size - 1 || j - i == size - 1)
                    sequence[i]
                else
                    " "
            }
            diamond.add(piece)
            piece = ""
        }
        return diamond
    }
}
