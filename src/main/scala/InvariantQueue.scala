/**
  * Created by knoldus on 18/7/17.
  */

class InvariantQueue[T](//Non variant , Invariant
                        private val leading: List[T],
                        private val trailing: List[T]
                       ) {

  def mirror =
    if(leading.isEmpty)
      new InvariantQueue[T](trailing.reverse, Nil)
  else
      this

  def enqueue(x: T): InvariantQueue[T] = {
    new InvariantQueue[T](leading, x :: trailing)
  }

  def dequeue: InvariantQueue[T] = {
    val q = mirror
    new InvariantQueue[T](q.leading.tail, q.trailing)
  }

  override def toString = (leading ::: trailing.reverse).toString
}


object Queue1 extends App {

  val CatObj1 = new Cat(1)
  val CatObj2 = new Cat(2)
  val CatObj3 = new Cat(3)
  val CatObj4 = new Cat(4)
  val CatObj5 = new Cat(5)

  val nonVariantQueue = new InvariantQueue[Cat](List(CatObj1,CatObj2,CatObj3,CatObj4), Nil)
  println(nonVariantQueue)
  println(nonVariantQueue.enqueue(CatObj5).dequeue)
  println(nonVariantQueue.dequeue)

}
