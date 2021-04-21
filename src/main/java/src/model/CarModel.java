package src.model;

public class CarModel {

    private String model;
    private int ethanolConsumption;
    private int gasolineConsumption;
    private int tankSize;

    public CarModel(String model, int ethanolConsumption, int gasolineConsumption, int tankSize) {
        this.model = model;
        this.ethanolConsumption = ethanolConsumption;
        this.gasolineConsumption = gasolineConsumption;
        this.tankSize = tankSize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEthanolConsumption() {
        return ethanolConsumption;
    }

    public void setEthanolConsumption(int ethanolConsumption) {
        this.ethanolConsumption = ethanolConsumption;
    }

    public int getGasolineConsumption() {
        return gasolineConsumption;
    }

    public void setGasolineConsumption(int gasolineConsumption) {
        this.gasolineConsumption = gasolineConsumption;
    }

    public int getTankSize() {
        return tankSize;
    }

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }
}
