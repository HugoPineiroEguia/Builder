package builder;

public class PizzaConcreta extends PizzaBuilder{
    
    @Override
    public void buildMasa(){
        pizza.setMasa("Normal");
    }
    
    @Override
    public void buildRelleno(){
        pizza.setRelleno(true);
    }
    
    @Override
    public void buildSalsa(){
        pizza.setSalsa("Barbacoa");
    }
    
    @Override
    public void buildSinGluten(){
        pizza.setSinGluten(false);
    }
    
    @Override
    public void buildPinha(){
        pizza.setPinha(true);
    }

    
    
}
