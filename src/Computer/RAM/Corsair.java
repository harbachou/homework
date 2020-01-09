package Computer.RAM;

import Computer.parts.api.IParts;
import Computer.parts.api.IStandard;

public class Corsair implements IParts {
    public Corsair(IStandard[] iStandards) {
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
