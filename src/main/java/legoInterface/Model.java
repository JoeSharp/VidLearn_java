package legoInterface;

public class Model {
    private final int modelNumber;
    private final String name;

    Model(int modelNumber, String name) {
        this.modelNumber = modelNumber;
        this.name = name;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Model{" +
                "modelNumber=" + modelNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
