object WordCount {

  def main(args: Array[String]): Unit = {

    val map = ReadFile.readFile()
    ReadFile.printContent(map)

  }

}


