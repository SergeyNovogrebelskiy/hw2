import java.util.Objects;

public class Task {
    int id;
    String brand;
    String model;
    int engineCapacity;
    boolean automaticTransmission;

    public Task(int id, String brand, String model, int engineCapacity, boolean automaticTransmission) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.automaticTransmission = automaticTransmission;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", automaticTransmission=" + automaticTransmission +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task car = (Task) o;
        return engineCapacity == car.engineCapacity && automaticTransmission == car.automaticTransmission && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity, automaticTransmission);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }

    public void setAutomaticTransmission(boolean automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }
}
