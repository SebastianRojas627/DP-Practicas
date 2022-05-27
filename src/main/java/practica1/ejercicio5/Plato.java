package practica1.ejercicio5;

public class Plato {

    public String tipoCarne;
    public String saborRefresco;
    public String Guarniciones;

    public Plato() {
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public String getSaborRefresco() {
        return saborRefresco;
    }

    public void setSaborRefresco(String saborRefresco) {
        this.saborRefresco = saborRefresco;
    }

    public String getGuarniciones() {
        return Guarniciones;
    }

    public void setGuarniciones(String guarniciones) {
        Guarniciones = guarniciones;
    }

    public void showInfo() {
        System.out.println("Tipo de carne: " + this.tipoCarne);
        System.out.println("Sabor de refresco: " + this.saborRefresco);
        System.out.println("Guraciones: " + this.Guarniciones);
    }
}
