import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое имя");
        RestaurauntGuest restaurauntGuest = new RestaurauntGuest(sc.next());
        System.out.println("Что будете заказывать?");
        System.out.println("Пицца: 1000, Маргарита: 2000, Бургер: 700, Чизбургер: 1200");
        System.out.println("Введите 1, если хотите заказать пиццу. Введите 2, если хотите заказать пиццу-маргариту. Введите 3, если хотите заказать бургер. Введите 4, если хотите заказать Чизбургер");
        int a = sc.nextInt();
        System.out.println("Нужна ли вам зарядка?");
        System.out.println("Введите 1, если да. Введите 2, если нет");
        int b = sc.nextInt();
        if(b == 1){
            System.out.println("У вас айфон?");
            System.out.println("Введите 1, если да. Введите 2, если нет");
            int c = sc.nextInt();
            if(c == 1){
                Iphone iphone = new Iphone();
                TypeC typeC = new TypeC();
                AdapterTypeCToLightning adapterTypeCToLightning = new AdapterTypeCToLightning(typeC);
                iphone.connected(adapterTypeCToLightning);
            }
            if(c == 2){
                SmartPhone smartPhone = new SmartPhone();
                Lightning lightning = new Lightning();
                AdapterLightningToTypeC adapterLightningToTypeC = new AdapterLightningToTypeC(lightning);
                smartPhone.connected(adapterLightningToTypeC);
            }
        }
        if(b == 2){
            System.out.println("Ожидайте свой заказ");
        }
        if(a == 1){
            Pizza pizza = Pizza.INSTANCE;
            pizza.addrestaurantGuest(restaurauntGuest);
            pizza.cookDish();
        }
        if(a == 2){
            Pizza pizza = Pizza.INSTANCE;
            PizzaMargaritaDecorator pizzaMargarita = new PizzaMargaritaDecorator(pizza);
            pizza.addrestaurantGuest(restaurauntGuest);
            pizzaMargarita.cookDish();
        }
        if(a == 3){
            Burger burger = Burger.INSTANCE;
            burger.addrestaurantGuest(restaurauntGuest);
            burger.cookDish();
        }
        if(a == 4){
            Burger burger = Burger.INSTANCE;
            CheeseBurgerDecorator cheeseBurger = new CheeseBurgerDecorator(burger);
            burger.addrestaurantGuest(restaurauntGuest);
            cheeseBurger.cookDish();
        }
        System.out.println("Оплатите заказ");
        System.out.println("Введите 1, если оплата картой. Введите 2, если оплата наличными");
        int d = sc.nextInt();
        Payment payment = new Payment();
        if(d == 1){
            KaspiCard kaspiCard = new KaspiCard();
            payment.setPaymentStrategy(kaspiCard);
            if(a == 1) {
                payment.checkout(1000);
            }
            if(a == 2) {
                payment.checkout(2000);
            }
            if(a == 3) {
                payment.checkout(700);
            }
            if(a == 4) {
                payment.checkout(1200);
            }
        }
        if(d == 2){
            Cash cash = new Cash();
            payment.setPaymentStrategy(cash);
            if(a == 1) {
                payment.checkout(1000);
            }
            if(a == 2) {
                payment.checkout(2000);
            }
            if(a == 3) {
                payment.checkout(700);
            }
            if(a == 4) {
                payment.checkout(1200);
            }
        }
        System.out.println("До свидания!");
    }
}