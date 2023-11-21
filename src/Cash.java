public class Cash implements PaymentStrategy{
    @Override
    public void pay(int amount){
        System.out.println("Оплата наличными. Вы заплатили: " + amount);
    }
}
