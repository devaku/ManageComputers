// Laptop: immutable wrapper that adds screen size to a Computer
public final class Laptop {

    private final Computer computer;   
    private final String screenSize;   

    // No no-arg constructor (immutability)
    public Laptop(String CPU, String RAM, String disk, String screenSize) {
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

        this.computer = new Computer(CPU, RAM, disk);
        this.screenSize = screenSize;
    }

    // Getters
    public String getCPU()        { return computer.getCPU(); }
    public String getRAM()        { return computer.getRAM(); }
    public String getDisk()       { return computer.getDisk(); }
    public String getScreenSize() { return screenSize; }

    
    public Laptop withCPU(String newCPU) {
        Computer c2 = computer.withCPU(newCPU);
        return new Laptop(c2.getCPU(), c2.getRAM(), c2.getDisk(), this.screenSize);
    }
    public Laptop withRAM(String newRAM) {
        Computer c2 = computer.withRAM(newRAM);
        return new Laptop(c2.getCPU(), c2.getRAM(), c2.getDisk(), this.screenSize);
    }
    public Laptop withDisk(String newDisk) {
        Computer c2 = computer.withDisk(newDisk);
        return new Laptop(c2.getCPU(), c2.getRAM(), c2.getDisk(), this.screenSize);
    }
    public Laptop withScreenSize(String newScreen) {
        return new Laptop(this.getCPU(), this.getRAM(), this.getDisk(), newScreen);
    }

    @Override
    public String toString() {
        return "Type:Laptop\tCPU:" + computer.getCPU()
             + "\tRAM:" + computer.getRAM()
             + "\tDisk:" + computer.getDisk()
             + "\tScreen:" + this.screenSize;
    }
}
