package romantoint

fun main(){
    var givenString = "IV"
    var result = romanToInt(givenString)
    println(result)
}

fun romanToInt(s: String): Int {
    // create a map of the roman numeral
    var romanNumeralCollection = mutableMapOf<Char, Int>('I' to 1 , 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
    var sum = 0
    var subtract = 0
    // I will use its string
    // I need to loop
    for (i in 0 until s.length){
        // check the presiding character
        if ((i + 1) < s.length && romanNumeralCollection[s[i]]!! < romanNumeralCollection[s[i + 1]]!!){
            subtract -= romanNumeralCollection[s[i]]!!
        } else {
            sum += romanNumeralCollection[s[i]]!!
        }

    }
    return sum + subtract
}