package ro.ase.course6.xml;

import java.io.Serializable;
import java.util.Date;

//enum EngineType {BENZINA, MOTORINA, HYBRID, ELECTRIC}

//enum Transmission {MANUALA, AUTOMATA}

public class Vehicle implements Serializable {

    private String brandAuto;
    private String modelAuto;
    private Date date;
    private int price;
    private String engineType;
    //private EngineType engineType;
    private String transmission;

    public Vehicle(){

    }

    public Vehicle(String brandAuto, String modelAuto, Date date, int price, String engineType, String transmission) {
        this.brandAuto = brandAuto;
        this.modelAuto = modelAuto;
        this.date = date;
        this.price = price;
        this.engineType = engineType;
        this.transmission = transmission;
    }

    public String getBrandAuto() {
        return brandAuto;
    }

    public void setBrandAuto(String brandAuto) {
        this.brandAuto = brandAuto;
    }

    public String getModelAuto() {
        return modelAuto;
    }

    public void setModelAuto(String modelAuto) {
        this.modelAuto = modelAuto;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brandAuto='" + brandAuto + '\'' +
                ", modelAuto='" + modelAuto + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", engineType=" + engineType +
                ", transmission=" + transmission +
                '}';
    }
}
