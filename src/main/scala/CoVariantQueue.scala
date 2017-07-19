/**
  * Created by knoldus on 18/7/17.
  */
class CoVariantQueue[+T](
                        private val leading: List[T],
                        private val trailing: List[T]
                       ) {

  override def toString = (leading ::: trailing.reverse).toString

}

object Queue extends App {

  val CatObj1 = new Cat(1)
  val CatObj2 = new Cat(2)
  val CatObj3 = new Cat(3)
  val CatObj4 = new Cat(4)
  val CatObj5 = new Cat(5)
  val AnimalObj = new Animal(6)
  val animalObj = new Animal(7)

  val covariantQueue = new CoVariantQueue[Cat](List(CatObj1,CatObj2,CatObj3,CatObj4), Nil)
  val animalQueue: CoVariantQueue[Animal] = covariantQueue
  println(animalQueue)

}