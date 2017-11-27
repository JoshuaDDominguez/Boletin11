/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

/**
 * boletin 11 class xogador, subclase de seleccion 
 * @author jdominguezdominguez
 */
public class Xogador extends Seleccion {

    private int dorsal;
    private String demarcacion;

    public Xogador(int id, int edade, String nome, String apelido, int dorsal, String demarcacion) {
        super(id, edade, nome, apelido);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void xogarPartido() {

    }

    public void entrenar() {

    }

    @Override
    public void viaxar() {
        String viaxar = "Viaxan os xogadores";
        System.out.println(viaxar);
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Xogador{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

}
