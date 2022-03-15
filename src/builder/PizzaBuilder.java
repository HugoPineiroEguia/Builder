package builder;


public abstract class PizzaBuilder {
    
    protected Pizza pizza;
    
    public Pizza getPizza(){
        return pizza;
    }
    
    public void crearPizza(){
        this.pizza = new Pizza();
    }   
    
    public abstract void buildMasa();
    public abstract void buildRelleno();
    public abstract void buildSalsa();
    public abstract void buildSinGluten();
    public abstract void buildPinha();
    
    
    
    
}
