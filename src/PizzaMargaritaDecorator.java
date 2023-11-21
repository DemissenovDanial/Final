public class PizzaMargaritaDecorator implements Decorator{
    private final Dish Pizza;

    public PizzaMargaritaDecorator(Dish Pizza){
        this.Pizza = Pizza;
    }

    @Override
    public void cookDish(){
        Pizza.cookDish();
        addIngredient();
    }

    @Override
    public void addIngredient(){
        System.out.println("Маргарита!");
    }
}
