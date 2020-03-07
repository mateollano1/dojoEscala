object Condicional{
    def main(args: Array[String]): Unit = {
     val n = 5

    if (n == 5) {
      println("Sí, n vale 5")
    } else {
      println("Tiene otro valor")
    }

    val valor = 6
   println(valor match {
      case 1 => "Uno"
      case 2 => "Dos"
      case 3 => "Tres"
      case 4 => "Cuatro"
      case 5 => "Cinco"
      case 6 => "Seis"
      //El case _ funciona como un default
      case _ => "Ninguno"
   })

   val frutas = Array("Pera", "Manzana", "Naranja")
   println(frutas.length)   //Tamaño => 3
   println(frutas.apply(1)) //Posición => Manzana
   println(frutas(1))       // Otra forma de escribir la posición => Manzana
   println(frutas.isEmpty)  //Si esta vacio => false
   println(frutas.nonEmpty)  //Si no esta vacio => true
   
   println(frutas.indexOf("Pera"))  //Posición de un objeto => 0
  }
}