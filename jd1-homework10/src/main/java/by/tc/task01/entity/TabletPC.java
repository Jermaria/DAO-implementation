package main.java.by.tc.task01.entity;

import java.io.Serializable;

public class TabletPC extends Appliance implements Serializable {
	
    private int batteryCapacity;
    private double displayInches;
    private int memoryROM;
    private int flashMemoryCapacity;
    private String colour;
    
    public TabletPC() {}

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int bataryCapacity) {
        this.batteryCapacity = bataryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + batteryCapacity;
        result = prime * result + ((colour == null) ? 0 : colour.hashCode());
        long temp;
        temp = Double.doubleToLongBits(displayInches);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + flashMemoryCapacity;
        result = prime * result + memoryROM;
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
        TabletPC other = (TabletPC) obj;
        if (batteryCapacity != other.batteryCapacity)
            return false;
        if (colour == null) {
            if (other.colour != null)
                return false;
        } else if (!colour.equals(other.colour))
            return false;
        if (Double.doubleToLongBits(displayInches) != Double.doubleToLongBits(other.displayInches))
            return false;
        if (flashMemoryCapacity != other.flashMemoryCapacity)
            return false;
        if (memoryROM != other.memoryROM)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName()+"[batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches + ", memoryROM="
                + memoryROM + ", flashMemoryCapacity=" + flashMemoryCapacity + ", colour=" + colour + "]";
    }
    
    
}
