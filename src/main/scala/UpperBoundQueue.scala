
class UpperBoundQueue[T](private val leading: List[T], private val trailing: List[T])  {

  def mirror =
    if(leading.isEmpty)
      new UpperBoundQueue[T](trailing.reverse, Nil)
    else
      this

  def enqueue[U <: T](x: T): UpperBoundQueue[T] = {
    new UpperBoundQueue[T](leading, x :: trailing)
  }

  def dequeue: UpperBoundQueue[T] = {
    val q = mirror
    new UpperBoundQueue[T](q.leading.tail, q.trailing)
  }

  override def toString = (leading ::: trailing.reverse).toString
}

object QueueAkshansh extends App {

  val CatObj1 = new Cat(1)
  val CatObj2 = new Cat(2)
  val CatObj3 = new Cat(3)
  val CatObj4 = new Cat(4)
  val CatObj5 = new Cat(5)
  val animalObj = new Animal(1)
  val smallCatObj = new SmallCat(3)

  val smallcatQueue: UpperBoundQueue[Cat] = new UpperBoundQueue[Cat](List(CatObj1,CatObj2,CatObj3,CatObj4), Nil)
  println(smallcatQueue.enqueue(smallCatObj))
  //println(smallcatQueue.enqueue(animalObj)) // Doesn't work

}