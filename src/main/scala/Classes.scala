class Animal(id: Int)

class PetAnimal(id:Int) extends Animal(id:Int)

class WildAnimal(id: Int) extends Animal(id: Int)

class Dog(id: Int) extends PetAnimal(id: Int)

class Cat(id: Int) extends PetAnimal(id: Int)

class WildDog(id: Int) extends WildAnimal(id: Int)

class WildCat(id: Int) extends WildAnimal(id: Int)

class SmallCat(id: Int) extends Cat(id: Int)

