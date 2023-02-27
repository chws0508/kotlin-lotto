package domain

open class PaymentMoney(val value: Int) {

    init {
        require(value >= ONE_LOTTO_PRICE) { PAYMENT_MONEY_MINIMUM_ERROR_MESSAGE }
    }

    fun getTotalLottoCount(): Count {
        return Count(this.value / ONE_LOTTO_PRICE)
    }

    companion object {
        private const val PAYMENT_MONEY_MINIMUM_ERROR_MESSAGE = "[ERROR] 구입 금액이 1000을 넘지 않습니다."
        private const val ONE_LOTTO_PRICE = 1000
    }
}
