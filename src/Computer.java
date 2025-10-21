//Computer class: manages computer CPU, RAM and Disk information

public class Computer {
    String CPU = null;
    String RAM = null;
    String disk = null;

    // Constructors
    public Computer() {
    } // No-arg contructor

    public Computer(String CPU, String RAM, String disk) {
        // Input validation for desktop 
        if (CPU == null || RAM == null || disk == null) {
            throw new IllegalArgumentException("Null value passed to Computer constructor");
        }   
        if (!CPU.equals("i5") && !CPU.equals("i7")) {  
            throw new IllegalArgumentException("Invalid CPU type");
        }
        if (!RAM.equals("16") && !RAM.equals("32")){
            throw new IllegalArgumentException("Invalid RAM amount");
        }
        if (!disk.equals("512") && !disk.equals("1024")){
            throw new IllegalArgumentException("Invalid RAM amount");
        }
        
        this.CPU = CPU;
        this.RAM = RAM;
        this.disk = disk;
    }

    // Setters
    public void setCPU(String CPU) {
        if (CPU.equals("i5") && !CPU.equals("i7")) {
            throw new IllegalArgumentException("Invalid CPU type");
        }
        this.CPU = CPU;
    }

    public void setRAM(String RAM) {
        if (!RAM.equals("16") && !RAM.equals("32")){
            throw new IllegalArgumentException("Invalid RAM amount");
        }
        this.RAM = RAM;
    }

    public void setDisk(String disk) {
        if (!disk.equals("512") && !disk.equals("1024")){
            throw new IllegalArgumentException("Invalid RAM amount");
        }
        this.disk = disk;
    }

    // Getters
    public String getCPU() {
        return this.CPU;
    }

    public String getRAM() {
        return this.RAM;
    }

    public String getDisk() {
        return this.disk;
    }

}