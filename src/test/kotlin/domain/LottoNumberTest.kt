package domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class LottoNumberTest {
    @ParameterizedTest
    @CsvSource("46,0")
    fun `로또 번호가 1이상 45이하여야만 한다`(number: Int) {
        val exception = assertThrows<IllegalArgumentException> { LottoNumber(46) }
        assertEquals("[ERROR] 로또 번호는 1이상 45 이하여야 합니다.", exception.message)
    }
}
