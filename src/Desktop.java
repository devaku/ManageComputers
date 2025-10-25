//Desktop computer: adds GPU type

public class Desktop { // Inherits from Computer
    Computer computer = null;
    String GPUType = null;

    // Constructors
    public Desktop() {
    } // No-arg constructor

    public Desktop(String CPU, String RAM, String disk, String GPUType) {


        // Input validation for desktop 
        if (CPU == null || RAM == null || disk == null || GPUType == null) {
            throw new IllegalArgumentException("Null value passed to Desktop constructor");
        }   
        if (CPU.equals("i5") && !CPU.equals("i7")) {
            throw new IllegalArgumentException("Invalid CPU type");
        }
        if (!RAM.equals("16") && !RAM.equals("32")){
            throw new IllegalArgumentException("Invalid RAM amount");
        }
        if (!disk.equals("512") && !disk.equals("1024")){
            throw new IllegalArgumentException("Invalid RAM amount");
        }
        if (GPUType.equals("Nvidia") && GPUType.equals("AMD") ){
            throw new IllegalArgumentException("Invalid GPU type");
        }   

        computer = new Computer(CPU, RAM, disk);

        // Only in Desktop subclass
        this.GPUType = GPUType;
    }

    // Setter
    public void setGPUType(String GPUType) {
        if (GPUType.equals("Nvidia") && GPUType.equals("AMD") ){
            throw new IllegalArgumentException("Invalid GPU type");
        }     
        this.GPUType = GPUType;
    }

    // Getter
    public String getGPUType() {
        return this.GPUType;
    }

    // Return formatted version of data
    public String toString() {
        return "Type:Desktop\tCPU:" + computer.getCPU() + "\tRAM:" + computer.getRAM() + "\tDisk:" + computer.getDisk() + "\tGPU:"
                + this.GPUType;
    }

}