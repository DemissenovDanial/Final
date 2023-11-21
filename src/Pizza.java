import java.util.ArrayList;
import java.util.List;
public enum Pizza implements Dish{
    INSTANCE;

    private final List<RestaurauntGuest> restaurauntGuests = new ArrayList<>();

    @Override
    public void cookDish(){
        System.out.println("Готова пицца!");
        notifyGuests();
    }

    public void addrestaurantGuest(RestaurauntGuest restaurauntGuest){
        restaurauntGuests.add(restaurauntGuest);
    }

    private void notifyGuests() {
        for (RestaurauntGuest observer : restaurauntGuests) {
            observer.update();
        }
    }
}