package Interfaces;
// Класс для бензинового двигателя

public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }
}
