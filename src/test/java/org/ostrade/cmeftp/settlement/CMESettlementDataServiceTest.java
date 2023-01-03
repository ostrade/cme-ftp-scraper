package org.ostrade.cmeftp.settlement;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CMESettlementDataServiceTest {

    @Test
    public void convert() {
        InputStream inputStream = this.getClass().getResourceAsStream("/nymex.settle.s.csv");
        CMESettlementDataService CMESettlementDataService = new CMESettlementDataService();
        List<CMESettlementPrice> settlementPrices = CMESettlementDataService.convert(inputStream);
        assertThat(settlementPrices).hasSize(27257);
        assertThat(settlementPrices.get(0).getBizDt()).isEqualTo(LocalDate.of(2022, 12, 28));
    }



}
