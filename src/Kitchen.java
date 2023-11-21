public class Kitchen {
    public static Dish getDish(DishType type){
        if (type == DishType.Pizza){
            return Pizza.INSTANCE;
        }
        if (type == DishType.Burger){
            return Burger.INSTANCE;
        }
        return null;
    }
    public static enum DishType{
        Pizza, Burger;
    }
}
