package part3;

public class Phone {

    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, String number) {
        System.out.println("Звонит " + callerName + " Номер: " + number);
    }

    public void sendMessage(String... numbers) {
        System.out.println("Номера звонящих:");
        for (String number : numbers)
            System.out.println("\t" + number);

    }

    public String getNumber() {
        return number;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
}
