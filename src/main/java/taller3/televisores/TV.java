package taller3.televisores;

public class TV {

    private Marca marca;
    private int canal, precio, volumen;
    private Boolean estado;
    private Control control;
    private static int numTV;

    public TV(Marca marca, Boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.precio = 500;
        this.volumen = 1;
        numTV++;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setCanal(int canal) {
        if (estado == true && canal >= 1 && canal <= 120) {
            this.canal = canal;
        }
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(int volumen) {
        if (this.estado == true && volumen >= 1 && volumen <= 7) {
            
            this.volumen = volumen;
        }
    }

    public void setControl(Control control) {
        this.control = control;
    }
    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
    public Marca getMarca() {
        return marca;
    }
    public int getCanal() {
        return canal;
    }
    public int getPrecio() {
        return precio;
    }
    public int getVolumen() {
        return volumen;
    }
    public Control getControl() {
        return control;
    }
    public static int getNumTV() {
        return numTV;
    }
    public void turnOn() {
        this.estado = true;
    }
    public void turnOff() {
        this.estado = false;
    }
    public Boolean getEstado() {
        return estado;
    }
    public int canalUp() {
        if (estado == true && (canal >= 1 && canal < 120)) {
            canal++;
        }
        return canal;
    }
    public int canalDown() {
        if (estado == true && (canal > 1 && canal <= 120)) {
            canal--;
        }
        return canal;
    }
    public int volumenUp() {
        if (estado == true && (volumen >= 1 && volumen < 7)) {
            volumen++;
        }
        return volumen;
    }
    public int volumenDown() {
        if (estado == true && (volumen > 1 && volumen <= 7)) {
            volumen--;
        }
        return volumen;
    }
}