package garage.parts.engine;

import garage.parts.engine.api.IEngine;

public class NoNameEngine implements IEngine {
    @Override
    public void start() {
        System.out.println("Завёлся... И немного глохну");
    }

    @Override
    public void stop() {
        System.out.println("Остановился");

    }

    @Override
    public void running() {
        System.out.println("Ем бензин не в себя");
    }
}
