
object Ejercicio{
    def main(args: Array[String]): Unit = {
     val numeros = List(4, 8, 15, 16, 23, 42);
     var i = 0;
    //  while (i< numeros.length){
    //     numeros(i) = 4;
    //     i = i + 1;
    //  }
    val dobles = numeros.map{ x => 2*x}
     println(dobles);
  }
}