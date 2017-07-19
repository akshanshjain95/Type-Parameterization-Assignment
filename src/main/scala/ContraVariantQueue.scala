/**
  * Created by knoldus on 18/7/17.
  */
class ContraVariantQueue[-T]{

  def write(x: T) = println(x)

}

object Queue2 extends App {

  val contravariantQueue = new ContraVariantQueue[Animal]
  val catQueue: ContraVariantQueue[Cat] = contravariantQueue
 // val animalQueue: ContraVariantQueue[Animal] = catQueue

  println(catQueue)

}
