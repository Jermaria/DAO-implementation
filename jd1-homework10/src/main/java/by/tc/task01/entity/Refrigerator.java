package main.java.by.tc.task01.entity;

import java.io.Serializable;

public class Refrigerator extends Appliance implements Serializable {
	
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;
    
    public Refrigerator() {}

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overAllCapacity) {
        this.overallCapacity = overAllCapacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(freezerCapacity);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(overallCapacity);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(powerConsumption);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Refrigerator other = (Refrigerator) obj;
        if (Double.doubleToLongBits(freezerCapacity) != Double.doubleToLongBits(other.freezerCapacity))
            return false;
        if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
            return false;
        if (Double.doubleToLongBits(overallCapacity) != Double.doubleToLongBits(other.overallCapacity))
            return false;
        if (Double.doubleToLongBits(powerConsumption) != Double.doubleToLongBits(other.powerConsumption))
            return false;
        if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
            return false;
        if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName()+"[powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
                + freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width
                + "]";
    }
    
    
    
}
