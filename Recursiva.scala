
object Recursiva{
    def main(args: Array[String]): Unit = {
     var  num = 5
     saluda();
    println( factorial(4))
  }
  def factorial (a:  Int): Int = {
      if(a != 0){

         return factorial(a-1) * a;
      }
      return 1;
  }
  def saluda() = {
      println("salud");
  }
}