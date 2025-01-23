public class ejemplo {
    private double precioX = 0;
    private double precioY = 0;
    private String nombre = "";
    public Ingrediente(double precioX,double precioY,String nombre){
        this.precioX = precioX;
        this.precioY = precioY;
        this.nombre = nombre;
    }
    public double getPrecioX() {
        return precioX;
    }
    public double getPrecioY() {
        return precioY;
    }
    public String getNombre() {
        return nombre;
    }
    public void setPrecioX(int precioX) {
        this.precioX = precioX;
    }
    public void setPrecioY(int precioY) {
        this.precioY = precioY;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
