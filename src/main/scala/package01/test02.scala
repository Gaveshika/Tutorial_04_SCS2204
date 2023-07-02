package package01

import scala.io.StdIn.readInt
object test02 {
  def pattern_matching(num: Int) :Unit= num match{
    case a if a < 0 => println("Negative");
    case a if a ==0 => println("Zero");
    case a if a%2 == 0 => println("Even");
    case a if a%2 == 1 => println("Odd");
  }
5
  def main(args : Array[String]): Unit = {
    print("Enter an integer : ");
    var a = readInt();
    (pattern_matching(a));
  }
}
