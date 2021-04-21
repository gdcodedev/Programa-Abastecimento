package src;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import src.model.Car;
import src.model.CarModel;
import src.service.GasStationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    //Persistencia
    public static final HashMap<String, CarModel> models = new HashMap<>();
    public static final List<Car> cars = new ArrayList();

    private static GasStationService gasStationService = new GasStationService();

    public static void main(String args[]) {
        try {

            //Entrada
            BufferedReader readerModel = new BufferedReader(new FileReader("MODELOS.csv"));
            BufferedReader readerQueue = new BufferedReader(new FileReader("VEICULOS.csv"));

            //Pula primeira Linha (Header)
            readerModel.readLine();
            readerQueue.readLine();

            //Ler o Arquivo de Modelos e Converte para o POJO
            CSVReader csvReaderModel = new CSVReader(readerModel);
            List<String[]> listModel = csvReaderModel.readAll();

            readerModel.close();
            csvReaderModel.close();

            for(String[] s : listModel){
                models.put(s[0], new CarModel(s[0],
                        s[1].isEmpty() ? 0 : Integer.parseInt(s[1]),
                        s[2].isEmpty() ? 0 : Integer.parseInt(s[2]),
                        s[3].isEmpty() ? 0 : Integer.parseInt(s[3])));
            }

            //Ler o Arquivo da Fila
            CSVReader csvReaderQueue = new CSVReader(readerQueue);
            List<String[]> listQueue = csvReaderQueue.readAll();

            readerQueue.close();
            csvReaderQueue.close();

            for(String[] s : listQueue){
                gasStationService.toFuel(new Car(models.get(s[0]), 0, s[1]));
            }

            gasStationService.printTotal();

        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }

}
