package package02

object test03 {

  def toUpper(text : String): String = text.toUpperCase()
  def toLower(text : String): String = text.toLowerCase()

  def formatNames(name : String)(index: Int*)(format_func : String => String) :String = {
    if(!(index.isEmpty)){
      var t_text ="";
      var x = 0;

      while(x<name.length()){
        if(index.contains(x)){
          t_text = t_text+ format_func(name.charAt(x).toString)
        }
        else{
          t_text = t_text+name.charAt(x).toString
        }
        x = x+1;
      }
      return t_text
    }
    else {
      return format_func(name)
    }
  }

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")()(toUpper))
    println(formatNames("Niroshan")(1)(toUpper))
    println(formatNames("Saman")(0)(toLower))
    println(formatNames("Kumara")(5)(toUpper))

  }
}
