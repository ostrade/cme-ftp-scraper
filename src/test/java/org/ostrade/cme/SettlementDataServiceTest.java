package org.ostrade.cme;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SettlementDataServiceTest {

    @Test
    public void convert() throws IOException {
        InputStream inputStream = this.getClass().getResourceAsStream("/nymex.settle.s.csv");
        SettlementDataService settlementDataService = new SettlementDataService();
        List<CMESettlementPrice> settlementPrices = settlementDataService.convert(inputStream);
        assertThat(settlementPrices).hasSize(27257);
        assertThat(settlementPrices.get(0).getBizDt()).isEqualTo(LocalDate.of(2022, 12, 28));
    }

    @Test
    public void fetch() throws IOException {
        SettlementDataService settlementDataService = new SettlementDataService();
        List<CMESettlementPrice> settlementPrices = settlementDataService.fetch(SettlementDataService.Market.NYMEX, LocalDate.of(2022, 12, 30));
        assertThat(settlementPrices).isNotEmpty();
    }

    private LocalDate getLastTradingDay() {
        LocalDate temp = LocalDate.now().minusDays(1);
        if (temp.getDayOfWeek().ordinal() >= 6) {
            return temp.minusDays(3);
        }
        return temp;
    }

}
