package src.model;

public class Car {

    private CarModel carModel;
    private int actualTank;
    private String plate;

    public Car(CarModel carModel, int actualTank, String plate) {
        this.carModel = carModel;
        this.actualTank = actualTank;
        this.plate = plate;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public int getActualTank() {
        return actualTank;
    }

    public void setActualTank(int actualTank) {
        this.actualTank = actualTank;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
