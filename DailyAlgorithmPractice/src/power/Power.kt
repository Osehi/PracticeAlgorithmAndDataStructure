package power

import kotlin.math.exp

fun power(base: Int, exponent: Int): Int {
    // the base be multiplied in the number of times of the exponent
    var evalute = 1
    if (exponent == 1) {
        return base
    }
    for(i in 1..exponent) {
        evalute *= base
    }
    return evalute
}