import javax.inject.Inject

class Car @Inject constructor(var engine: Engine, var wheels: Wheels) {

    fun drive() {
        println("Driving...")
    }
}