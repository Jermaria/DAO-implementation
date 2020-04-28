package main.java.by.tc.task01.entity;

import java.io.Serializable;

public class VacuumCleaner extends Appliance implements Serializable {
	
    private int powerConsumption;
    private char filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private double cleaningWidth;
    
    public VacuumCleaner() {}

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public char getFilterType() {
        return filterType;
    }

    public void setFilterType(char filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
        long temp;
        temp = Double.doubleToLongBits(cleaningWidth);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + filterType;
        result = prime * result + motorSpeedRegulation;
        result = prime * result + powerConsumption;
        result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VacuumCleaner other = (VacuumCleaner) obj;
        if (bagType == null) {
            if (other.bagType != null)
                return false;
        } else if (!bagType.equals(other.bagType))
            return false;
        if (Double.doubleToLongBits(cleaningWidth) != Double.doubleToLongBits(other.cleaningWidth))
            return false;
        if (filterType != other.filterType)
            return false;
        if (motorSpeedRegulation != other.motorSpeedRegulation)
            return false;
        if (powerConsumption != other.powerConsumption)
            return false;
        if (wandType == null) {
            if (other.wandType != null)
                return false;
        } else if (!wandType.equals(other.wandType))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName()+"[powerConsumption=" + powerConsumption + ", filterType=" + filterType + ", bagType="
                + bagType + ", wandType=" + wandType + ", motorSpeedRegulation=" + motorSpeedRegulation
                + ", cleaningWidth=" + cleaningWidth + "]";
    }
    
    
    
}
