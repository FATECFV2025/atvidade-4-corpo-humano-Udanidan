package main.java;

public class CorpoHumano {
    private double massa;
    private double volume;
    private double densidade;
    private double altura;
    
    public CorpoHumano(double massa, double volume, double densidade, double altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
    }

    public double imc(){
        double imc = massa/(altura*altura);
        return imc;
    }

    //getters
    public double getMassa() {
        return massa;
    }

    public double getVolume() {
        return volume;
    }

    public double getDensidade() {
        return densidade;
    }

    public double getAltura() {
        return altura;
    }


    //setters
    public void setMassa(double massa) {
        this.massa = massa;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    
}
