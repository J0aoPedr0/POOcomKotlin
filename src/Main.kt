interface Selvagem {
    fun atacar()
}
abstract class Mamifero(){
    fun acordar(){
        println("Acordei")
    }
    fun dormir(){
        println("Dormi")
    }
    abstract fun falar()
}
class cachorro():Mamifero(), Selvagem{
    override fun falar() {
        println("AU AU")
    }

    override fun atacar() {
        println("Morder a bunda")
    }
}
fun main(){
    val objeto = cachorro()
    objeto.acordar()
    var c1 = cachorro()
    c1.falar()
    c1.dormir()
}