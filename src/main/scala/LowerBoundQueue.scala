
/**
  * Created by knoldus on 18/7/17.
  */
class LowerBoundQueue[T]( val leading: List[T],  val trailing: List[T]) {

  def mirror =
    if(leading.isEmpty)
      new LowerBoundQueue[T](trailing.reverse, Nil)
    else
      this

  def enqueue[U >: T](x: U) = {
    new LowerBoundQueue(leading, x :: trailing)
  }

  def dequeue: LowerBoundQueue[T] = {
    val q = mirror
    new LowerBoundQueue[T](q.leading.tail, q.trailing)
  }

  override def toString: String = (leading ::: trailing.reverse).toString

}

object Queue3 extends App {

  val CatObj1 = new Cat(1)
  val CatObj2 = new Cat(2)
  val CatObj3 = new Cat(3)
  val CatObj4 = new Cat(4)
  val CatObj5 = new Cat(5)
  val animalObj = new Animal(1)
  val smallCatObj = new SmallCat(3)

  val catQueue: LowerBoundQueue[Cat] = new LowerBoundQueue[Cat](List(CatObj1,CatObj2,CatObj3,CatObj4), Nil)
  val g = catQueue.enqueue(animalObj)
  println(catQueue.enqueue(animalObj))
  println(catQueue.enqueue(smallCatObj))

}