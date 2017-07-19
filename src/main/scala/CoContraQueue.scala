
class CoContraQueue[-S, +T] {

  def write(x: S): T = {
    x match {
      case res: T => res
    }
  }

}


object QueueCoContra extends App {

  val CatObj1 = new Cat(1)
  val CatObj2 = new Cat(2)
  val CatObj3 = new Cat(3)
  val CatObj4 = new Cat(4)
  val CatObj5 = new Cat(5)
  val DogObj = new Dog(1)
  val petAnimalObj = new PetAnimal(1)

  val nonVariantQueue = new CoContraQueue[Cat, Dog]
  println(nonVariantQueue)
  //val ah: Cat = new Dog(3)
  val coContraQueuee: CoContraQueue[SmallCat, Animal] = nonVariantQueue
  //val ak1: Cat = nonVariantQueue.write(CatObj2)
  //println(nonVariantQueue.write(petAnimalObj))

}
