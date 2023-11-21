public class RestaurauntGuest implements Guest{
    private final String name;

    public RestaurauntGuest(String name){
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println(name + ", Ваш заказ готов!");
    }
}