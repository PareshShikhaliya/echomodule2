package org.example.class3;

// CPU class (Part of Composition)
class CPU {

    int number_of_Core;
    String type;

    public int getNumber_of_Core() {
        return number_of_Core;
    }

    public void setNumber_of_Core(int number_of_Core) {
        this.number_of_Core = number_of_Core;
    }

    public void executeInstructions() {
        System.out.println("CPU executing instructions.");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

// RAM class (Part of Composition)
class RAM {
    public void storeData() {
        System.out.println("RAM storing data.");
    }
}

// HardDisk class (Part of Composition)
class HardDisk {
    public void readData() {
        System.out.println("HardDisk reading data.");
    }
}

// Computer class (Container with Composition)
class Computer {
    private CPU cpu;
    private RAM ram;
    private HardDisk hardDisk;

    public Computer() {
        cpu = new CPU();
        ram = new RAM();
        hardDisk = new HardDisk();
    }
    public void boot() {
        cpu.executeInstructions();
        ram.storeData();
        hardDisk.readData();
        System.out.println("Computer booted successfully.");
    }

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}

public class CompositionComputerExample4 {
    public static void main(String[] args)
    {
        Computer computer = new Computer();
        computer.getCpu().setNumber_of_Core(2);
        computer.getCpu().setType("intel");
        computer.boot();
    }
}
