package domain

class ShuffledNumbersGenerator : NumbersGenerator {
    override fun generate(): List<Int> {
        val possibleLottoNumbers = (MINIMUM_LOTTO_NUMBER..MAXIMUM_LOTTO_NUMBER).toList()
        return possibleLottoNumbers.shuffled().take(LOTTO_NUMBER_COUNT)
    }

    companion object {
        private const val MINIMUM_LOTTO_NUMBER = 1
        private const val MAXIMUM_LOTTO_NUMBER = 45
        private const val LOTTO_NUMBER_COUNT = 6
    }
}
