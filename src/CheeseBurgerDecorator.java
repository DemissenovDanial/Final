public class CheeseBurgerDecorator implements Decorator{
    private final Dish Burger;

    public CheeseBurgerDecorator(Dish Burger){
        this.Burger = Burger;
    }

    @Override
    public void cookDish(){
        Burger.cookDish();
        addIngredient();
    }

    @Override
    public void addIngredient(){
        System.out.println("С сыром!");
    }
}
