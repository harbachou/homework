package Computer;

import Computer.CPU.Intel;
import Computer.CPU.api.CPUStandard;
import Computer.HDD.Hitachi;
import Computer.HDD.api.HDDStandard;
import Computer.RAM.Corsair;
import Computer.RAM.api.RAMStandard;
import Computer.parts.api.IParts;
import Computer.parts.api.IStandard;

public class ComputerMain {
    public static void main(String[] args) {
        IParts[] parts = new IParts[3];
        parts[0] = new Hitachi(new IStandard[] {HDDStandard.SATA});
        parts[1] = new Corsair(new IStandard[] {RAMStandard.DDR1});
        parts[2] = new Intel (new IStandard[] {CPUStandard.ZEN});
        Computer comp = new Computer (parts, new IStandard[]{
                HDDStandard.SATA,
                RAMStandard.DDR1,
                CPUStandard.ZEN});
        comp.start();
        }
    }

