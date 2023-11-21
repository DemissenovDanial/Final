public class AdapterTypeCToLightning implements Charger{
    private TypeC typeC;

    public AdapterTypeCToLightning(TypeC typeC){
        this.typeC = typeC;
    }
    @Override
    public void connection(){
        System.out.println("Используется переходник с Type-C разъёма на Lightning разъём");
        typeC.connection();
    }
}
