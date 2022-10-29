package com.example.ejercicio1;

public class funcionesmatematicas {

    private Integer n1;
    private Integer n2;


    private Integer suma;
    private Integer resta;
    private Integer multipliacion;
    private Integer division;


    public funcionesmatematicas(int i, int parseInt) {
    }


    public funcionesmatematicas(Integer numero1, Integer numero2, Integer suma, Integer resta, Integer multipliacion, Integer division) {
        this.n1 = numero1;
        this.n2 = numero2;

    }



    public Integer getN1() {
        return n1;
    }

    public void setN1(Integer num1) {
        this.n1 = num1;
    }

    public Integer getN2() {
        return n2;
    }

    public void setN2(Integer num2) {
        this.n2 = num2;
    }




    public Integer suma(Integer numero1,Integer numero2) {
        return suma= numero1 + numero2;
    }
    public Integer resta(Integer numero1,Integer numero2) {
        return resta= numero1 - numero2;
    }
    public Integer multiplicacion(Integer numero1,Integer numero2) {
        return multipliacion= numero1 * numero2;
    }
    public Integer division(Integer numero1,Integer numero2) {
        return division= numero1 / numero2;
    }


}
