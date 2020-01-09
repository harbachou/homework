package Computer.HDD.api;

import Computer.parts.api.IStandard;

public enum HDDStandard implements IStandard {
    SATA,
    SAS,
    SCSI;

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
