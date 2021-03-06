package business

class ChooseAnswerOptionService(
        private val quizStorage: QuizStorage) {

    fun chooseAnswerOption(quizId: String, index: Int): Question {
        val quiz = quizStorage.loadOrFail(quizId)

        val currentQuestion = quiz.getCurrentQuestionOrFail()

        currentQuestion.chooseAnswerOption(index)

        return currentQuestion
    }

}