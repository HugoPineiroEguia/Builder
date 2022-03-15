
package builder;

public class Builder {
    
    public static void main(String[] args) {
        
        Cocina cocina = new Cocina();
        PizzaBuilder concreta = new PizzaConcreta();
        
        cocina.setPizzaBuilder(concreta);
        cocina.construirPizza();
        
        Pizza pizza = cocina.getPizza();
        System.out.println(pizza.toString());
    }
    
}
