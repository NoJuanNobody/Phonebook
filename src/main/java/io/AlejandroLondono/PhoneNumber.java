package io.AlejandroLondono;

/**
 * Created by alejandrolondono on 5/16/16.
 */
public class PhoneNumber {
    private int areaCode;
    private int exchange;
    private int station;
    Type numType;

    public enum Type{HOME, WORK, MOBILE}

    public String getFullNumber(){
        return "("+this.areaCode+")-"+this.exchange+"-"+this.station;
    }

    public int getAreaCode(){
        return this.areaCode;
    }

    public int getExchange(){
        return this.exchange;
    }

    public int getStation(){
        return this.station;
    }

    public PhoneNumber(int areaCode, int exchange, int station){
        this.areaCode = areaCode;
        this.exchange = exchange;
        this.station = station;
        this.numType = Type.HOME;
    }
}
