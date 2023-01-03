package org.ostrade.cmeftp.settlement;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

public class CMESettlementPrice {

    @JsonProperty("BizDt")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate bizDt;
    @JsonProperty("Sym")
    private String sym;
    @JsonProperty("ID")
    private String id;
    @JsonProperty("StrkPx")
    private String strkPx;
    @JsonProperty("SecTyp")
    private String secTyp;
    @JsonProperty("MMY")
    private String mmy;
    @JsonProperty("MatDt")
    private String matDt;
    @JsonProperty("PutCall")
    private String putCall;
    @JsonProperty("Exch")
    private String exch;
    @JsonProperty("Desc")
    private String desc;
    @JsonProperty("LastTrdDt")
    private String lastTrdDt;
    @JsonProperty("BidPrice")
    private String bidPrice;
    @JsonProperty("OpeningPrice")
    private String openingPrice;
    @JsonProperty("SettlePrice")
    private String settlePrice;
    @JsonProperty("SettleDelta")
    private String settleDelta;
    @JsonProperty("HighLimit")
    private String highLimit;
    @JsonProperty("LowLimit")
    private String lowLimit;
    @JsonProperty("DHighPrice")
    private String dHighPrice;
    @JsonProperty("DLowPrice")
    private String dLowPrice;
    @JsonProperty("HighBid")
    private String highBid;
    @JsonProperty("LowBid")
    private String lowBid;
    @JsonProperty("PrevDayVol")
    private String prevDayVol;
    @JsonProperty("PrevDayOI")
    private String prevDayOI;
    @JsonProperty("FixingPrice")
    private String fixingPrice;
    @JsonProperty("UndlyExch")
    private String undlyExch;
    @JsonProperty("UndlyID")
    private String undlyID;
    @JsonProperty("UndlySecTyp")
    private String undlySecTyp;
    @JsonProperty("UndlyMMY")
    private String undlyMMY;
    @JsonProperty("BankBusDay")
    private String bankBusDay;

    public LocalDate getBizDt() {
        return bizDt;
    }

    public void setBizDt(LocalDate bizDt) {
        this.bizDt = bizDt;
    }

    public String getSym() {
        return sym;
    }

    public void setSym(String sym) {
        this.sym = sym;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStrkPx() {
        return strkPx;
    }

    public void setStrkPx(String strkPx) {
        this.strkPx = strkPx;
    }

    public String getSecTyp() {
        return secTyp;
    }

    public void setSecTyp(String secTyp) {
        this.secTyp = secTyp;
    }

    public String getMmy() {
        return mmy;
    }

    public void setMmy(String mmy) {
        this.mmy = mmy;
    }

    public String getMatDt() {
        return matDt;
    }

    public void setMatDt(String matDt) {
        this.matDt = matDt;
    }

    public String getPutCall() {
        return putCall;
    }

    public void setPutCall(String putCall) {
        this.putCall = putCall;
    }

    public String getExch() {
        return exch;
    }

    public void setExch(String exch) {
        this.exch = exch;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLastTrdDt() {
        return lastTrdDt;
    }

    public void setLastTrdDt(String lastTrdDt) {
        this.lastTrdDt = lastTrdDt;
    }

    public String getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    public String getOpeningPrice() {
        return openingPrice;
    }

    public void setOpeningPrice(String openingPrice) {
        this.openingPrice = openingPrice;
    }

    public String getSettlePrice() {
        return settlePrice;
    }

    public void setSettlePrice(String settlePrice) {
        this.settlePrice = settlePrice;
    }

    public String getSettleDelta() {
        return settleDelta;
    }

    public void setSettleDelta(String settleDelta) {
        this.settleDelta = settleDelta;
    }

    public String getHighLimit() {
        return highLimit;
    }

    public void setHighLimit(String highLimit) {
        this.highLimit = highLimit;
    }

    public String getLowLimit() {
        return lowLimit;
    }

    public void setLowLimit(String lowLimit) {
        this.lowLimit = lowLimit;
    }

    public String getdHighPrice() {
        return dHighPrice;
    }

    public void setdHighPrice(String dHighPrice) {
        this.dHighPrice = dHighPrice;
    }

    public String getdLowPrice() {
        return dLowPrice;
    }

    public void setdLowPrice(String dLowPrice) {
        this.dLowPrice = dLowPrice;
    }

    public String getHighBid() {
        return highBid;
    }

    public void setHighBid(String highBid) {
        this.highBid = highBid;
    }

    public String getLowBid() {
        return lowBid;
    }

    public void setLowBid(String lowBid) {
        this.lowBid = lowBid;
    }

    public String getPrevDayVol() {
        return prevDayVol;
    }

    public void setPrevDayVol(String prevDayVol) {
        this.prevDayVol = prevDayVol;
    }

    public String getPrevDayOI() {
        return prevDayOI;
    }

    public void setPrevDayOI(String prevDayOI) {
        this.prevDayOI = prevDayOI;
    }

    public String getFixingPrice() {
        return fixingPrice;
    }

    public void setFixingPrice(String fixingPrice) {
        this.fixingPrice = fixingPrice;
    }

    public String getUndlyExch() {
        return undlyExch;
    }

    public void setUndlyExch(String undlyExch) {
        this.undlyExch = undlyExch;
    }

    public String getUndlyID() {
        return undlyID;
    }

    public void setUndlyID(String undlyID) {
        this.undlyID = undlyID;
    }

    public String getUndlySecTyp() {
        return undlySecTyp;
    }

    public void setUndlySecTyp(String undlySecTyp) {
        this.undlySecTyp = undlySecTyp;
    }

    public String getUndlyMMY() {
        return undlyMMY;
    }

    public void setUndlyMMY(String undlyMMY) {
        this.undlyMMY = undlyMMY;
    }

    public String getBankBusDay() {
        return bankBusDay;
    }

    public void setBankBusDay(String bankBusDay) {
        this.bankBusDay = bankBusDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CMESettlementPrice that = (CMESettlementPrice) o;

        if (!Objects.equals(bizDt, that.bizDt)) return false;
        if (!Objects.equals(sym, that.sym)) return false;
        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(strkPx, that.strkPx)) return false;
        if (!Objects.equals(secTyp, that.secTyp)) return false;
        if (!Objects.equals(mmy, that.mmy)) return false;
        if (!Objects.equals(matDt, that.matDt)) return false;
        if (!Objects.equals(putCall, that.putCall)) return false;
        if (!Objects.equals(exch, that.exch)) return false;
        if (!Objects.equals(desc, that.desc)) return false;
        if (!Objects.equals(lastTrdDt, that.lastTrdDt)) return false;
        if (!Objects.equals(bidPrice, that.bidPrice)) return false;
        if (!Objects.equals(openingPrice, that.openingPrice)) return false;
        if (!Objects.equals(settlePrice, that.settlePrice)) return false;
        if (!Objects.equals(settleDelta, that.settleDelta)) return false;
        if (!Objects.equals(highLimit, that.highLimit)) return false;
        if (!Objects.equals(lowLimit, that.lowLimit)) return false;
        if (!Objects.equals(dHighPrice, that.dHighPrice)) return false;
        if (!Objects.equals(dLowPrice, that.dLowPrice)) return false;
        if (!Objects.equals(highBid, that.highBid)) return false;
        if (!Objects.equals(lowBid, that.lowBid)) return false;
        if (!Objects.equals(prevDayVol, that.prevDayVol)) return false;
        if (!Objects.equals(prevDayOI, that.prevDayOI)) return false;
        if (!Objects.equals(fixingPrice, that.fixingPrice)) return false;
        if (!Objects.equals(undlyExch, that.undlyExch)) return false;
        if (!Objects.equals(undlyID, that.undlyID)) return false;
        if (!Objects.equals(undlySecTyp, that.undlySecTyp)) return false;
        if (!Objects.equals(undlyMMY, that.undlyMMY)) return false;
        return Objects.equals(bankBusDay, that.bankBusDay);
    }

    @Override
    public int hashCode() {
        int result = bizDt != null ? bizDt.hashCode() : 0;
        result = 31 * result + (sym != null ? sym.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (strkPx != null ? strkPx.hashCode() : 0);
        result = 31 * result + (secTyp != null ? secTyp.hashCode() : 0);
        result = 31 * result + (mmy != null ? mmy.hashCode() : 0);
        result = 31 * result + (matDt != null ? matDt.hashCode() : 0);
        result = 31 * result + (putCall != null ? putCall.hashCode() : 0);
        result = 31 * result + (exch != null ? exch.hashCode() : 0);
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        result = 31 * result + (lastTrdDt != null ? lastTrdDt.hashCode() : 0);
        result = 31 * result + (bidPrice != null ? bidPrice.hashCode() : 0);
        result = 31 * result + (openingPrice != null ? openingPrice.hashCode() : 0);
        result = 31 * result + (settlePrice != null ? settlePrice.hashCode() : 0);
        result = 31 * result + (settleDelta != null ? settleDelta.hashCode() : 0);
        result = 31 * result + (highLimit != null ? highLimit.hashCode() : 0);
        result = 31 * result + (lowLimit != null ? lowLimit.hashCode() : 0);
        result = 31 * result + (dHighPrice != null ? dHighPrice.hashCode() : 0);
        result = 31 * result + (dLowPrice != null ? dLowPrice.hashCode() : 0);
        result = 31 * result + (highBid != null ? highBid.hashCode() : 0);
        result = 31 * result + (lowBid != null ? lowBid.hashCode() : 0);
        result = 31 * result + (prevDayVol != null ? prevDayVol.hashCode() : 0);
        result = 31 * result + (prevDayOI != null ? prevDayOI.hashCode() : 0);
        result = 31 * result + (fixingPrice != null ? fixingPrice.hashCode() : 0);
        result = 31 * result + (undlyExch != null ? undlyExch.hashCode() : 0);
        result = 31 * result + (undlyID != null ? undlyID.hashCode() : 0);
        result = 31 * result + (undlySecTyp != null ? undlySecTyp.hashCode() : 0);
        result = 31 * result + (undlyMMY != null ? undlyMMY.hashCode() : 0);
        result = 31 * result + (bankBusDay != null ? bankBusDay.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CMESettlementPrice" + '[' +
                "bizDt='" + bizDt + '\'' +
                ", sym='" + sym + '\'' +
                ", id='" + id + '\'' +
                ", strkPx='" + strkPx + '\'' +
                ", secTyp='" + secTyp + '\'' +
                ", mmy='" + mmy + '\'' +
                ", matDt='" + matDt + '\'' +
                ", putCall='" + putCall + '\'' +
                ", exch='" + exch + '\'' +
                ", desc='" + desc + '\'' +
                ", lastTrdDt='" + lastTrdDt + '\'' +
                ", bidPrice='" + bidPrice + '\'' +
                ", openingPrice='" + openingPrice + '\'' +
                ", settlePrice='" + settlePrice + '\'' +
                ", settleDelta='" + settleDelta + '\'' +
                ", highLimit='" + highLimit + '\'' +
                ", lowLimit='" + lowLimit + '\'' +
                ", dHighPrice='" + dHighPrice + '\'' +
                ", dLowPrice='" + dLowPrice + '\'' +
                ", highBid='" + highBid + '\'' +
                ", lowBid='" + lowBid + '\'' +
                ", prevDayVol='" + prevDayVol + '\'' +
                ", prevDayOI='" + prevDayOI + '\'' +
                ", fixingPrice='" + fixingPrice + '\'' +
                ", undlyExch='" + undlyExch + '\'' +
                ", undlyID='" + undlyID + '\'' +
                ", undlySecTyp='" + undlySecTyp + '\'' +
                ", undlyMMY='" + undlyMMY + '\'' +
                ", bankBusDay='" + bankBusDay + '\'' +
                ']';
    }
}
