package arrays

import java.text.NumberFormat
import java.util.*

fun main() {
    val value = "1000"
    val result = currencyFormatter(value)
    println(result)
}

fun currencyFormatter(number: String){
    val countryCode = "NG"
    val language = "en"
    val locale = Locale(language, countryCode)
    val currency = Currency.getInstance(locale)
    val formStringAmount = number.replace("[${currency.symbol},.]".toRegex(), "")
    println("inside formStringAmount: ${formStringAmount}")
    val parsed = formStringAmount.toDouble()
    val formatted = NumberFormat.getCurrencyInstance(locale).format(parsed/100)
//    return formatted
}