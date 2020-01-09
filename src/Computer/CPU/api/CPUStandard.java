package Computer.CPU.api;

import Computer.parts.api.IStandard;

public enum CPUStandard implements IStandard {
    ZEN,
    ZEN2,
    XEON;

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
