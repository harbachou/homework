package Computer;

import Computer.CPU.api.CPUStandard;
import Computer.HDD.api.HDDStandard;
import Computer.RAM.api.RAMStandard;
import Computer.parts.api.IStandard;

public class Computer {
    public static void main(String[] args) {
        IStandard[] standards = new IStandard[3];
        standards[0] = HDDStandard.SATA;
        standards[1] = RAMStandard.DDR1;
        standards[2] = CPUStandard.ZEN;
        Computer comp = new Computer(new IStandard[](HDDStandard.SATA, RAMStandard.DDR1,
                CPUStandard.ZEN));
        comp.start();
        }
    }

