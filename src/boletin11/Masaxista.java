/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

/**
 *
 * @author jdominguezdominguez
 */
public class Masaxista extends Seleccion {

    private String titulacion;
    private int anosExperiencia;

    public Masaxista(int id, int edade, String nome, String apelido, String titulacion, int anosExperiencia) {
        super(id, edade, nome, apelido);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public void darMasaxes() {

    }

    @Override
    public void viaxar() {
        String viaxar = "Viaxa o masaxista";
        System.out.println(viaxar);
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() + "Masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }

}
