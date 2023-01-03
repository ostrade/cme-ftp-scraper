package org.ostrade.cmeftp.settlement;

import org.junit.jupiter.api.Test;
import org.ostrade.cmeftp.CMEExchange;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CMESettlementDataServiceIT {

    @Test
    public void fetch() throws IOException {
        CMESettlementDataService CMESettlementDataService = new CMESettlementDataService();
        List<CMESettlementPrice> settlementPrices = CMESettlementDataService.fetch(CMEExchange.NYMEX, LocalDate.of(2022, 12, 30));
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
