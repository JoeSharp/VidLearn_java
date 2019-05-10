package lego;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        final ModelManager modelManager = new ModelManager() {
            @Override
            public void addModel(Model model) {

            }

            @Override
            public Model getModel(int id) {
                return null;
            }

            @Override
            public void deleteModel(int id) {

            }
        };

        addModels(modelManager);

        final Model diner = modelManager.getModel(10260);
        System.out.println("Diner " + diner);

        modelManager.deleteModel(31313);
    }

    private static void addModels(final ModelManager modelManager) {
        modelManager.addModel(new Model(10260, "Creator Expert - Diner"));
        modelManager.addModel(new Model(10769, "Extreme Adventure Truck"));
        modelManager.addModel(new Model(31313, "Mindstorms Home Kit"));
    }
}
