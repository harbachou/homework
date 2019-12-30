package garage.cars;

import garage.cars.api.ACars;
import garage.parts.engine.MercedesEngine;
import garage.parts.engine.NoNameEngine;
import garage.parts.engine.api.IEngine;

public class Mercedes extends ACars{
    private String model;
    private IEngine engine;

    public Mercedes(String model, IEngine engine){
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return "Mercedes";
    }
}
