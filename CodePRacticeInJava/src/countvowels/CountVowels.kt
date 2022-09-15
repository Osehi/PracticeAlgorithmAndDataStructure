package countvowels

fun main(){
    val wordOne = "Elephant"
    val wordTwo = "car"
    val wordThree = "computer"
    val result = countVowels(wordThree)
    println(result)
     val PASSWORD_PATTERN = Regex(".{8,}")
    val input = "osehias1"
    val resultOne = input.matches(PASSWORD_PATTERN)
    println(resultOne)

}
/**
 * count_vowels("Elephant")-> 3
count_vowels("car")->1
count_vowels("computer")->3
 */

fun countVowels(word: String): Int {
    // convert the given word to lowercase
    val wordInLowercase = word.lowercase()
    // the number of vowels
    var numberOfVowels = 0
    // an array of all available vowels
    val vowels = arrayOf<Char>('a', 'e', 'i', 'o', 'u')
    // loop through to count the vowels
    for (elem in wordInLowercase){
        if (vowels.contains(elem)){
            numberOfVowels++
        }
    }
    return numberOfVowels
}

fun countVowelsOne(word: String): Int {
    // convert the given word to lowercase
    val inLowerCase = word.lowercase()
  // all available vowels
    val vowels = arrayOf<Char>('a', 'e', 'i', 'o', 'u')
    // create a map of the given word
    val mapGivenWord = mutableMapOf<Char, Int>()
    // to record count
    var numberOfVowels = 0
    for (elem in inLowerCase){
        if (!mapGivenWord.contains(elem)){
            mapGivenWord[elem] = 1
        } else {
            mapGivenWord[elem] = mapGivenWord.getValue(elem).plus(1)
        }
    }
    // loop through the map
    for ((key, value ) in mapGivenWord){
        if (vowels.contains(key)){
            numberOfVowels += value
        }
    }
    return numberOfVowels
}