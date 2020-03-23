package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.*;


public class AgedBrieTest {

    @Test
    public void should_return_22_when_sell_in_is_after_sell_in_init() {
        AgedBrie agedBrie = new AgedBrie(20, LocalDate.of(2020, 3, 23),1);
        assertThat(agedBrie.getQuality(LocalDate.of(2020, 3, 25)) > 20).isEqualTo(true);
        assertThat(agedBrie.getQuality(LocalDate.of(2020, 3, 25))).isEqualTo(22);
    }


}
