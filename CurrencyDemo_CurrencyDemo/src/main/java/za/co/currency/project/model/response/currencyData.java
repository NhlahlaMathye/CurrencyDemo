package za.co.currency.project.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class currencyData {
    
    @JsonProperty("ZAR") 
    public double zAR;

    @JsonProperty("PKR") 
    public double pKR;

    @JsonProperty("INR") 
    public double iNR;

    @JsonProperty("BDT") 
    public double bDT;

    public double getzAR() {
        return zAR;
    }

    public void setzAR(double zAR) {
        this.zAR = zAR;
    }

    public double getpKR() {
        return pKR;
    }

    public void setpKR(double pKR) {
        this.pKR = pKR;
    }

    public double getiNR() {
        return iNR;
    }

    public void setiNR(double iNR) {
        this.iNR = iNR;
    }

    public double getbDT() {
        return bDT;
    }

    public void setbDT(double bDT) {
        this.bDT = bDT;
    }

    
}
