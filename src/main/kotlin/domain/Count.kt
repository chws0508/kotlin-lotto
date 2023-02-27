package domain

@JvmInline
value class Count(val value: Int) {
    init {
        require(value >= MINIMUM_NON_NEGATIVE_NUMBER) { COUNT_NEGATIVE_ERROR_MESSAGE }
    }

    operator fun plus(number: Int): Count {
        return Count(this.value + number)
    }

    companion object {
        private const val COUNT_NEGATIVE_ERROR_MESSAGE = "[ERROR] 갯수는 음수가 될 수 없습니다."
        private const val MINIMUM_NON_NEGATIVE_NUMBER = 0
    }
}
