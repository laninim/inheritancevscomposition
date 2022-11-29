//Write two different implementations of 1 parent and 2 children classes that override one method - one using inheritance and another using interfaces.

interface Parents{
    val name : String
    val surname : String
    val age : Int

    fun printIdentity(){
        print("Name: $name\nSurname:$surname\nAge: $age\n")
    }
}

open class Mother (override val name : String, override val surname : String, override val age : Int) : Parents{}

class Son1 (override val name: String, override val surname : String, override val age : Int) : Mother(name, surname, age){

    override fun printIdentity() {
        super.printIdentity()
    }
}

class Son2 (override val name: String, override val surname : String, override val age : Int) : Mother(name, surname, age){

    override fun printIdentity() {
        super.printIdentity()
    }
}



fun main(args: Array<String>) {
    var mamma = Mother("Simona","Tofani",53)
    mamma.printIdentity()
    var son1 = Son1("Mauro","Lanini",32)
    son1.printIdentity()
    var son2 = Son2("Gianluca","Lanini",32)
    son2.printIdentity()
}