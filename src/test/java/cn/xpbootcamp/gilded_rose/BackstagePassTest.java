package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class BackstagePassTest {

    @Test
    public void should_return_zero_when_sell_in_is_after_performance_day() {
        BackstagePass backstagePass = new BackstagePass(20,LocalDate.of(2020, 3, 24), LocalDate.of(2020, 3, 23));
        assertThat(backstagePass.getQuality()).isEqualTo(0);
    }

    @Test
    public void should_return_50_when_sell_in_is_equal_to_performance_day() {
        BackstagePass backstagePass = new BackstagePass(45,LocalDate.of(2020, 3, 23), LocalDate.of(2020, 3, 23));
        assertThat(backstagePass.getQuality()).isEqualTo(50);
    }

    @Test
    public void should_return_28_when_sell_in_until_performance_day_greater_5_and_less_than_10() {
        BackstagePass backstagePass = new BackstagePass(20,LocalDate.of(2020, 3, 17), LocalDate.of(2020, 3, 23));
        assertThat(backstagePass.getQuality()).isEqualTo(28);
    }

    @Test
    public void should_return_36_when_sell_in_until_performance_day_less_than_5() {
        BackstagePass backstagePass = new BackstagePass(20,LocalDate.of(2020, 3, 20), LocalDate.of(2020, 3, 23));
        assertThat(backstagePass.getQuality()).isEqualTo(36);
    }


}

