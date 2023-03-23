/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
open class Engine(var engineType: String) {
    open fun start() {
        println("Starting engine...")
    }
    
    fun printEngineDetails(){
        println("Engine Type: $engineType")
    }
}

class DieselEngine(engineType: String): Engine(engineType) {
    override fun start() {
        println("Starting diesel engine...")
        // super.start()
    }
}

class PetrolEngine(engineType: String): Engine(engineType) {
    override fun start() {
        println("Starting petrol engine...")
    }
}

class ElectricEngine(engineType: String): Engine(engineType) {
    override fun start() {
        println("Starting electric engine...")
    }
}

class HybridEngine(engineType: String): Engine(engineType) {
    override fun start() {
        println("Starting hybrid engine...")
    }
}


data class Car(val brandName: String, val engine: Engine, val price: Double) {
    fun printCarDetails() {
        println("Car details")
        println("Brand Name: $brandName")
        engine.printEngineDetails()
        println("Price: $price")
    }
    
    // override fun equals(other: Any?): Boolean{
        // return other is Car && other.engine.engineType == this.engine.engineType
    // } 
    
    // override fun toString(): String{
        // return "Brand Name: $brandName, engine: ${this.engine.engineType}, price: $price"
    // }
}
 
fun main() {
 var mercedesEngine = DieselEngine("Diesel")
 val mercedes = Car("Mercedes", mercedesEngine, 2_000_000.00)
 mercedes.printCarDetails()
 mercedes.engine.start()
 
 val hondaEngine = HybridEngine("Hybrid")
 val redbull = Car("Redbull", hondaEngine, 2_500_000.00)
 
 println(redbull == mercedes)
   
 // println(mercedesEngine is Engine)  
 println(redbull.toString())
}
