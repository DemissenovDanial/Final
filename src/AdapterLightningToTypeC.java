public class AdapterLightningToTypeC implements Charger{
    private Lightning lightning;

    public AdapterLightningToTypeC(Lightning lightning){
        this.lightning = lightning;
    }
    @Override
    public void connection(){
        System.out.println("Используется переходник с Lightning разъёма на Type-C разъём");
        lightning.connection();
    }
}