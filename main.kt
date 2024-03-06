fun main() {
    println("Процессор:")
    val processorName = readLine()!!
    println("Введите частоту (MHz):")
    val processorFrequency = readLine()!!.toInt()
    println("Введите RAM size (MB):")
    val ramSize = readLine()!!.toInt()
    println("Введите HDD size (MB):")
    val hddSize = readLine()!!.toInt()
    val computer = ComputerBasic(processorName, processorFrequency, ramSize)
    computer.displayInfo()
    println("Товар: ${computer.quality()}")
    val computerChild = ComputerChild(processorName, processorFrequency, ramSize, hddSize)
    computerChild.displayInfo()
    println("Товар: ${computerChild.qualityP()}")
}