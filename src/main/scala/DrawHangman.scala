object DrawHangman extends App {

  def drawHangman(figNr: Int): Unit = {
    val figIllustration: Map[String, Array[String]] = Map(
      "fig10" -> Array( "|---------|",
        "|         |",
        "|        (..)",
        "|        /|\\",
        "|       | | |",
        "|        / \\",
        "|        | |",
        "|",
        "--------------"),

      "fig9" -> Array( "|---------|",
        "|         |",
        "|        (..)",
        "|        /|\\",
        "|       | | |",
        "|        / \\",
        "|        |",
        "|",
        "--------------"),

      "fig8" -> Array( "|---------|",
        "|         |",
        "|        (..)",
        "|        /|\\",
        "|       | | |",
        "|        / \\",
        "|",
        "|",
        "--------------"),

      "fig7" -> Array( "|---------|",
        "|         |",
        "|        (..)",
        "|        /|\\",
        "|       | | |",
        "|        /",
        "|",
        "|",
        "--------------"),

      "fig6" -> Array( "|---------|",
        "|         |",
        "|        (..)",
        "|        /|\\",
        "|       | | |",
        "|",
        "|",
        "|",
        "--------------"),

      "fig5" -> Array( "|---------|",
        "|         |",
        "|        (..)",
        "|        /|\\",
        "|       | |",
        "|",
        "|",
        "|",
        "--------------"),

      "fig4" -> Array( "|---------|",
        "|         |",
        "|        (..)",
        "|        /|\\",
        "|         |",
        "|",
        "|",
        "|",
        "--------------"),

      "fig3" -> Array( "|---------|",
        "|         |",
        "|        (..)",
        "|        /|",
        "|         |",
        "|",
        "|",
        "|",
        "--------------"),

      "fig2" -> Array( "|---------|",
        "|         |",
        "|        (..)",
        "|         |",
        "|         |",
        "|",
        "|",
        "|",
        "--------------"),

      "fig1" -> Array( "|---------|",
        "|         |",
        "|        (..)",
        "|",
        "|",
        "|",
        "|",
        "|",
        "--------------"),

      "fig0" -> Array( "|---------|",
        "|         |",
        "|",
        "|",
        "|",
        "|",
        "|",
        "|",
        "--------------")
    )

    figIllustration("fig" + figNr).foreach(println)
  }
  //drawHangman(10)
}