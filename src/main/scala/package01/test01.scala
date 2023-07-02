package package01

import scala.io.StdIn.readDouble

object test01 {

  def interest(deposit_amount : Double):Double = deposit_amount match{
    case x if x <= 20000   => x*0.02
    case x if x <= 200000  => x*0.04
    case x if x <= 2000000 => x*0.35
    case  x => x*0.65
  }

  def main(args : Array[String]): Unit = {
    print("Enter deposit amount: Rs.");
    var x = readDouble();
    printf("Amount of interest that the deposit money earns in a year: Rs."+interest(x));
  }

}
