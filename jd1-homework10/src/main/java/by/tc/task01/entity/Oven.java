package main.java.by.tc.task01.entity;

import java.io.Serializable;

public class Oven extends Appliance implements Serializable {
	
    private int powerConsumption;
    private double weight;
    private int capacity;
    private double depth;
    private double height;
    private double width;
    
    public Oven() {}

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weigth) {
        this.weight = weigth;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
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
        result = prime * result + capacity;
        long temp;
        temp = Double.doubleToLongBits(depth);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + powerConsumption;
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
        Oven other = (Oven) obj;
        if (capacity != other.capacity)
            return false;
        if (Double.doubleToLongBits(depth) != Double.doubleToLongBits(other.depth))
            return false;
        if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
            return false;
        if (powerConsumption != other.powerConsumption)
            return false;
        if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
            return false;
        if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[powerConsumption=" + powerConsumption + ", weight=" + weight + ", capacity=" + capacity
                + ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
    }
    
    
    
}
