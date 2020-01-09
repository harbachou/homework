package Computer.CPU;

import Computer.CPU.api.ICPU;
import Computer.parts.api.IParts;
import Computer.parts.api.IStandard;

public class Intel implements IParts {
    public Intel(IStandard[] iStandards) {
    }

    @Override
    public IStandard[] getStandard() {
        return new IStandard[0];
    }

    @Override
    public boolean test() {
        return false;
    }
}
