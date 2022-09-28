package funwithanagrams

fun main() {
    val candidate = "osehi"
    val character = candidate.split("").sorted().joinToString("")

    println(character)
    // [code, doce, ecod, framer, frame]
    // use a nested loop
}

fun funWithAnagrams(text: Array<String>): Array<String> {
    // Write your code here
    // use a nested loop
    for (word in text) {

        for (sampleWord in text) {
            if (textSorter(word) == textSorter(sampleWord)) {
                // add word to a new array

            }
        }
    }
    return arrayOf("hello")
}

fun textSorter(txt:String): String {
    val result = txt.split("").sorted().joinToString("")
    return result
}