package main.java.by.tc.task01.entity;

import java.io.Serializable;

public class Laptop extends Appliance implements Serializable {
	
    private double batteryCapacity;
    private String os;
    private int memoryROM;
    private int systemMemory;
    private double cpu;
    private int displayInchs;
    
    public Laptop() {}

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(int displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(batteryCapacity);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cpu);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + displayInchs;
        result = prime * result + memoryROM;
        result = prime * result + ((os == null) ? 0 : os.hashCode());
        result = prime * result + systemMemory;
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
        Laptop other = (Laptop) obj;
        if (Double.doubleToLongBits(batteryCapacity) != Double.doubleToLongBits(other.batteryCapacity))
            return false;
        if (Double.doubleToLongBits(cpu) != Double.doubleToLongBits(other.cpu))
            return false;
        if (displayInchs != other.displayInchs)
            return false;
        if (memoryROM != other.memoryROM)
            return false;
        if (os == null) {
            if (other.os != null)
                return false;
        } else if (!os.equals(other.os))
            return false;
        if (systemMemory != other.systemMemory)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[batteryCapacity=" + batteryCapacity + ", os=" + os + ", memoryROM=" + memoryROM
                + ", systemMemory=" + systemMemory + ", cpu=" + cpu + ", displayInchs=" + displayInchs + "]";
    }
    
    

    
}
