package src.service;

import src.model.Car;

public class GasStationService {

    private int totalGas = 0;
    private int totalEthanol = 0;

    public void toFuel(Car car) {
        if(car.getCarModel().getEthanolConsumption() > 0) {
            totalEthanol += car.getCarModel().getTankSize();
            System.out.println("Veiculo modelo " + car.getCarModel().getModel() + ", placa " + car.getPlate() + " foi abastecido com " + car.getCarModel().getTankSize() + " de ETANOL");
        } else {
            totalGas += car.getCarModel().getTankSize();
            System.out.println("Veiculo modelo " + car.getCarModel().getModel() + ", placa " + car.getPlate() + " foi abastecido com " + car.getCarModel().getTankSize() + " de GASOLINA");
        }
    }

    public void printTotal() {
        System.out.println("RESUMO DA SIMULAÇÃO");
        System.out.println("Total abastecido de GASOLINA: " + totalGas);
        System.out.println("Total abastecido de ETANOL: " + totalEthanol);
    }

}
