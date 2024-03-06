open class ComputerChild(processorName: String, processorFrequency: Int, ramSize: Int, val hddSize: Int) : ComputerBasic(processorName, processorFrequency, ramSize) {
    fun qualityP(): Float {
        return quality() + 0.5f * hddSize
    }
}
