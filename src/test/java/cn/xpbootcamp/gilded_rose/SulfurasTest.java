package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class SulfurasTest {

    @Test
    public void should_return_20_when_sell_in_is_2020_3_24() {
        Sulfuras sulfuras = new Sulfuras(20, LocalDate.of(2020, 3, 24));
        assertThat(sulfuras.getQuality() == 20).isEqualTo(true);
    }

    @Test
    public void should_return_20_when_sell_in_is_2019_3_24() {
        Sulfuras sulfuras = new Sulfuras(20, LocalDate.of(2019, 3, 24));
        assertThat(sulfuras.getQuality() == 20).isEqualTo(true);
    }
}
