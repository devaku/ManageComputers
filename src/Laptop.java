//Laptop computer: adds screen size to other Computer info

public class Laptop extends Computer { // Laptop inherits from Computer
    String screenSize = null;

    // Constructors
    public Laptop() {
    } // No-arg constructor

    public Laptop(String CPU, String RAM, String disk, String screenSize) {

        // Constructor level validation for laptop
        if (CPU == null || RAM == null || disk == null || screenSize == null) {
            throw new IllegalArgumentException("Null value passed to Laptop constructor");
        }
        if (!CPU.equals("i5") && !CPU.equals("i7")) {
            throw new IllegalArgumentException("Invalid CPU type");
        }
        if (!RAM.equals("16") && !RAM.equals("32")) {
            throw new IllegalArgumentException("Invalid RAM amount");
        }
        if (!disk.equals("512") && !disk.equals("1024")) {
            throw new IllegalArgumentException("Invalid disk size");
        }
        if (!screenSize.equals("13") && !screenSize.equals("14")) {
            throw new IllegalArgumentException("Invalid screen size");
        }

        // Inherited from Computer superclass
        this.CPU = CPU;
        this.RAM = RAM;
        this.disk = disk;

        // Only in Laptop subclass
        this.screenSize = screenSize;
    }

    // Setter
    public void setScreenSize(String screenSize) {
        // Variable validation for screen size
        if (!screenSize.equals("13") && !screenSize.equals("14")) {
            throw new IllegalArgumentException("Invalid screen size");
        }
        this.screenSize = screenSize;
    }

    // Getter
    public String getScreenSize() {
        return this.screenSize;
    }

    // Return formatted version of data
    public String toString() {
        return "Type:Laptop\tCPU:" + this.CPU + "\tRAM:" + this.RAM + "\tDisk:" + this.disk + "\tScreen:"
                + this.screenSize;
    }

}