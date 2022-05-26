package scanner

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    // To create a task, please supply the following details
    println("To create a task, please supply the following details")
    println("please enter task Id")
    val taskId = scanner.next()
    println(taskId)
}