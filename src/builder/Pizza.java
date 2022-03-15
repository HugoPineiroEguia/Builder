
package builder;

public class Pizza {
    
    private String masa;
    private boolean relleno;
    private String salsa;
    private boolean sinGluten;
    private boolean pinha;

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public void setPinha(boolean pinha) {
        this.pinha = pinha;
    }

    @Override
    public String toString() {
        return "Pizza:\n" + "masa: " + masa + ", relleno: " + relleno + ", salsa: " + salsa + ", sinGluten: " + sinGluten + ", pinha: " + pinha;
    }
    
    
    
    
    
}
