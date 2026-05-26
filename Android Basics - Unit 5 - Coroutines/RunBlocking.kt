import kotlinx.coroutines.* // Importing the kotlinx.coroutines library to use coroutines and related functions

fun main () { 
    runBlocking { // runBlocking blocks the main thread until the coroutine inside it completes
        println ("Hello ") // This will print immediately
        delay(1000) // This will suspend the coroutine for 1 second, but it won't block the main thread
        println ("World!") // This will print after the delay
    }
}