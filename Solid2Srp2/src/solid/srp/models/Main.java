package srp.models;



public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order =new ConsoleInput().inputFromConsole();
     SaveManagamer saveManagamer=new SaveManagamer("order.json");
    saveManagamer.saveToJson(order);
    }
}
