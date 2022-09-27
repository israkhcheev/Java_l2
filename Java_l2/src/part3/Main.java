package part3;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone("89299900981", "iPhone", 145.3);
        Phone phone2 = new Phone("88005553535", "Samsung", 167.7);
        Phone phone3 = new Phone("89853486889", "Xiaomi", 100.3);

        System.out.println(phone1.getModel() + " " + phone1.getNumber() + " " + phone1.getWeight());
        System.out.println(phone2.getModel() + " " + phone2.getNumber() + " " + phone2.getWeight());
        System.out.println(phone3.getModel() + " " + phone3.getNumber() + " " + phone3.getWeight());

        phone1.receiveCall("Ilya");
        phone1.receiveCall("Ilya", "88005553535");
        phone2.sendMessage("89299900981", "89653462134", "89856590890");

    }

}
