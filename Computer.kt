abstract class Computer(val processorName: String, val processorFrequency: Int, val ramSize: Int) {
    abstract fun quality(): Float

    fun displayInfo() {
        println("Processor: $processorName")
        println("Processor frequency: $processorFrequency MHz")
        println("RAM size: $ramSize MB")
    }
}