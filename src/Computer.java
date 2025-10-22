// Immutable Computer class: manages CPU, RAM, and Disk information securely
public final class Computer {

    private final String CPU;
    private final String RAM;
    private final String disk;

    // Constructor performs whitelist validation
    public Computer(String CPU, String RAM, String disk) {
        if (CPU == null || RAM == null || disk == null) {
            throw new IllegalArgumentException("Null value passed to Computer constructor");
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

        this.CPU = CPU;
        this.RAM = RAM;
        this.disk = disk;
    }

    // Getters only, no setters
    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getDisk() {
        return disk;
    }

    // helper to "modify" by returning a new object
    public Computer withCPU(String newCPU) {
        return new Computer(newCPU, this.RAM, this.disk);
    }

    public Computer withRAM(String newRAM) {
        return new Computer(this.CPU, newRAM, this.disk);
    }

    public Computer withDisk(String newDisk) {
        return new Computer(this.CPU, this.RAM, newDisk);
    }

    @Override
    public String toString() {
        return "CPU: " + CPU + ", RAM: " + RAM + "GB, Disk: " + disk + "GB";
    }
}
