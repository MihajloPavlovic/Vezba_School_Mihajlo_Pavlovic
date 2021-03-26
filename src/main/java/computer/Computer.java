package computer;

public class Computer {
    
    private String operatingSystem;
    private double privateTact;
    private double memory;
    private int hardDrive;
    
    public void setOperatingSystem(String newOperatingSystem) {
        this.operatingSystem = newOperatingSystem;
    }
    
    public void setPrivateTact(double newPrivateTact) {
        this.privateTact = newPrivateTact;
    }
    
    public void setMemory(double newMemory) {
        this.memory = newMemory;
    }
    
    public void setHardDrive(int newHardDrive) {
        this.hardDrive = newHardDrive;
    }
    
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    
    public double getPrivateTact() {
        return this.privateTact;
    }
    
    public double getMemory() {
        return this.memory;
    }
    
    public int getHardDrive() {
        return this.hardDrive;
    }
    
    public Computer() {
        
    }
    
    public Computer(String operatingSystem, double privateTact, double memory, int hardDrive) {
        this.operatingSystem = operatingSystem;
        this.privateTact = privateTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }
    
    
    
}
