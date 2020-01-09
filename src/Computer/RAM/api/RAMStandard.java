package Computer.RAM.api;

import Computer.parts.api.IStandard;

public enum RAMStandard implements IStandard {
    DDR1,
    DDR2,
    DDR3;

    @Override
    public String CPUStandard() {
        return null;
    }

    @Override
    public String HDDStandard() {
        return null;
    }

    @Override
    public String RAMStandard() {
        return null;
    }
}
