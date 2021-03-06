package main.ua.alvin.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "result_bill")
public class ResultBillTable implements BillTable {

    @Id//mark for primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//let mysql handle the generation of autoincrement
    @Column(name = "id")
    private int id;

    @Column(name = "hot_water_cost")
    private int hotWater;

    @Column(name = "cold_water_cost")
    private int coldWater;

    @Column(name = "sewage_cost")
    private int sewage;

    @Column(name = "electricity_cost")
    private int electricity;

    @Column(name = "gas_supply_cost")
    private int gasSupply;

    @Column(name = "house_heating_cost")
    private int houseHeating;

    @Column(name = "rent_service_cost")
    private int rentService;

    @Column(name = "garbage_removal_cost")
    private int garbageRemoval;

    @Column(name = "indication_date")
    private Date indicationDate;

    @OneToOne(mappedBy = "resultBillTable", cascade = CascadeType.ALL)
    private CountedBillTable countedBillTable;

    @OneToOne(mappedBy = "resultBillTable", cascade = CascadeType.ALL)
    private FixedBillTable fixedBillTable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHotWater() {
        return hotWater;
    }

    public void setHotWater(int hotWater) {
        this.hotWater = hotWater;
    }

    public int getColdWater() {
        return coldWater;
    }

    public void setColdWater(int coldWater) {
        this.coldWater = coldWater;
    }

    public int getSewage() {
        return sewage;
    }

    public void setSewage(int sewage) {
        this.sewage = sewage;
    }

    public int getElectricity() {
        return electricity;
    }

    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }

    public int getGasSupply() {
        return gasSupply;
    }

    public void setGasSupply(int gasSupply) {
        this.gasSupply = gasSupply;
    }

    public int getHouseHeating() {
        return houseHeating;
    }

    public void setHouseHeating(int houseHeating) {
        this.houseHeating = houseHeating;
    }

    public int getRentService() {
        return rentService;
    }

    public void setRentService(int rentService) {
        this.rentService = rentService;
    }

    public int getGarbageRemoval() {
        return garbageRemoval;
    }

    public void setGarbageRemoval(int garbageRemoval) {
        this.garbageRemoval = garbageRemoval;
    }

    public Date getIndicationDate() {
        return indicationDate;
    }

    public void setIndicationDate(Date indicationDate) {
        this.indicationDate = indicationDate;
    }

    public CountedBillTable getCountedBillTable() {
        return countedBillTable;
    }

    public void setCountedBillTable(CountedBillTable countedBillTable) {
        this.countedBillTable = countedBillTable;
    }

    public FixedBillTable getFixedBillTable() {
        return fixedBillTable;
    }

    public void setFixedBillTable(FixedBillTable fixedBillTable) {
        this.fixedBillTable = fixedBillTable;
    }

    @Override
    public String toString() {
        return "ResultBillTable{" +
                "id=" + id +
                ", hotWater=" + hotWater +
                ", coldWater=" + coldWater +
                ", sewage=" + sewage +
                ", electricity=" + electricity +
                ", gasSupply=" + gasSupply +
                ", houseHeating=" + houseHeating +
                ", rentService=" + rentService +
                ", garbageRemoval=" + garbageRemoval +
                ", indicationDate=" + indicationDate +
                ", countedBillTable=" + countedBillTable +
                ", fixedBillTable=" + fixedBillTable +
                '}';
    }
}
