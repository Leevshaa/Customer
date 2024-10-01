package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        // Створюємо об'єкт класу LocalDateTime та задаємо значення поточного часу
        LocalDateTime localDateTime = LocalDateTime.now();
        // Створюємо об'єкт класу DateTimeFormatter та редагуємо формат виведення дати і часу
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        /*
        Створюємо змінну currentDateTime, якій присвоюємо значення поточної дати і часу
        та застосовуємо до цих значень наше форматування виведення (formatter)
         */
        String currentDateTime = localDateTime.format(formatter);


        Customer customer = getCustomer(getData());
        String output = "Customer: " + customer.getName() +
                ", phone " + customer.getPhone() +
                "\nCurrent date and time: " + currentDateTime;
        getOutput(output);
    }

    public static String[] getData() {
        return new String[]{"Daryl Dixon", "+1-408-123-4567"};
    }

    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
