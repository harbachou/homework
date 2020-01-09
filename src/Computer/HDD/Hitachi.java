package Computer.HDD;

import Computer.parts.api.IParts;
import Computer.parts.api.IStandard;

public class Hitachi implements IParts {
    public Hitachi(IStandard[] iStandards) {
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
