package org.ostrade.cme;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SettlementDataServiceTest {

    @Test
    public void convert() throws IOException {
        InputStream inputStream = this.getClass().getResourceAsStream("/nymex.settle.s.csv");
        SettlementDataService settlementDataService = new SettlementDataService();
        List<CMESettlementPrice> settlementPrices = settlementDataService.convert(inputStream);
        assertThat(settlementPrices).hasSize(27257);
    }

}
