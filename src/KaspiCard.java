public class KaspiCard implements PaymentStrategy{
    @Override
    public void pay(int amount){
        System.out.println("Оплата с помощью каспи карты произошла успешно. С Вас сняли: " + amount);
    }
}