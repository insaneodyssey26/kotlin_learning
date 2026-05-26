// Below is a Quiz class containing a companion object named StudentProgress.
// Why use a companion object?
// 1. To hold properties and methods that are common to all instances of the class
// 2. To provide a way to create factory methods
// 3. To group related functionality together
// This increases code organization and readability.


class Quiz {
    val question1 = Question<String>(
        "What is the capital of France?",
        "Paris",
        Difficulty.MEDIUM
    )
    val question2 = Question<Int>(
        "What is 2 + 2?",
        4,
        Difficulty.EASY 
    )
    val question3 = Question<Boolean>(
        "Is the sky blue?",
        true,
        Difficulty.EASY
    )
    companion object StudentProgress {
    var total: Int = 10
    var answered: Int = 4
}
}

class Question<T> (
    val questionText: String,
    val answer: T, 
    val diffculty: Difficulty
)

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}

fun main() {
    println("${Quiz.answered} out of ${Quiz.total} answered.")
}