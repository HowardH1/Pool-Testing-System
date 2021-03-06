package app.pool-testing-system.dto
/**
 * A Chemical
 *
 * @property name, the name of a chemical
 * @property okRange, an array of two floats with index 0 being the lowest acceptable value and index
 * 1 being the highest
 * @property hoursCantSwim, number of hours it is unsafe to swim per oz (could be other unit of measure)
 * of chemical added
 * @property ozPerGallon, ounces of chemical needed per gallon of pool water. Again, can adjust units
 * of measure
 * @constructor creates a chemical based on supplied properties
 */
class Chemical(val name: String, val okRange: Array<Float>, val hoursCantSwim: Float, val ozPerGallon: Float) {
    /**
     * @param currentAmount is the current level of a certain chemical
     * @return amount of chemical that needs to be added, or zero for none. a negative number could
     * potentially represent having too much of a chemical, and needing to avoid adding it
     */
    fun calculateAmountNeeded(currentAmount: Float): Float {
        //TODO
    }

    /**
     * @param ozChemicalAdded should be the value returned by calculateAmountNeeded, and the amount of a
     * certain chemical to be added
     * @return the number of hours in which a pool will be unsafe to swim
     */
    fun getHoursNoSwim(ozChemicalAdded: Float): Float {
        //TODO
    }

    /**
     * @override toString function
     * @return chemical name and a small summary about the chemical
     */
    @Override
    override fun toString(): String {
        //may need to be modified for units
        var safeToSwim = "safe"
        if (this.hoursCantSwim > 0 ) {
            safeToSwim = "unsafe"
        }
        return this.name + "is a chemical with an acceptable range of " + this.okRange[0] + " to " +
                this.okRange[1] + ", and is " + safeToSwim + " for pool goers after use."
    }


}