public class Iphone implements Phone{
    @Override
    public void connected(Charger charger){
        System.out.println("Подключено к зарядному устройству");
        charger.connection();
    }
}
