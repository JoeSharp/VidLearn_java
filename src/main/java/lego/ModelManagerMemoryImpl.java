package lego;

import java.util.ArrayList;
import java.util.List;

public class ModelManagerMemoryImpl implements ModelManager {
    private List<Model> models = new ArrayList<>();

    @Override
    public void addModel(Model model) {
        models.add(model);
    }

    @Override
    public Model getModel(int id) {
        return models.stream()
                .filter(m -> m.getModelNumber() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void deleteModel(int id) {
        this.models.removeIf(m -> m.getModelNumber() == id);
    }
}
