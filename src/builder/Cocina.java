
package builder;

public class Cocina {
    
    private PizzaBuilder pizzaBuilder;
    
    public void setPizzaBuilder(PizzaBuilder pb){
        this.pizzaBuilder = pb;
    }
    
    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }
    
    public void construirPizza(){
        pizzaBuilder.crearPizza();
        pizzaBuilder.buildMasa();
        pizzaBuilder.buildRelleno();
        pizzaBuilder.buildSalsa();
        pizzaBuilder.buildSinGluten();
        pizzaBuilder.buildPinha();
    }
    
    
    
    
}
