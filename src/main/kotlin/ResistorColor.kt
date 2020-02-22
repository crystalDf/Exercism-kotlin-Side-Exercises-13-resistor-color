object ResistorColor {

    fun colorCode(input: String): Int {

        return Color.valueOf(input.toUpperCase()).ordinal
    }

    fun colors(): List<String> {

        return Color.values().map { it.name.toLowerCase() }
    }

}

enum class Color {
    BLACK, BROWN, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET, GREY, WHITE
}

