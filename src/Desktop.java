//Desktop computer: adds GPU type

public class Desktop { // Inherits from Computer
    Computer computer = null;
    String GPUType = null;

    // Constructors
    public Desktop() {
    } // No-arg constructor

    public Desktop(String CPU, String RAM, String disk, String GPUType) {

        computer = new Computer(CPU, RAM, disk);

        // Only in Desktop subclass
        this.GPUType = GPUType;
    }

    // Setter
    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    // Getter
    public String getGPUType() {
        return this.GPUType;
    }

    // Return formatted version of data
    public String toString() {
        return "Type:Desktop\tCPU:" + computer.CPU + "\tRAM:" + computer.RAM + "\tDisk:" + computer.disk + "\tGPU:"
                + this.GPUType;
    }

}