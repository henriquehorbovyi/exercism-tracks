object Raindrops {

    fun convert(n: Int): String {
        var drops = ""
        if (n % 3 == 0) drops += "Pling"
        if (n % 5 == 0) drops += "Plang"
        if (n % 7 == 0) drops += "Plong"

        if (drops.isBlank()) drops = n.toString()

        return drops
    }
}
