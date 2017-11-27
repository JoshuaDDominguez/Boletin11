/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

/**
 * boletin11 class adestrador, subclase de seleccion
 * @author jdominguezdominguez
 */
public class Adestrador extends Seleccion {

    private String idFederacion;

    public Adestrador(int id, int edade, String nome, String apelido, String idFederacion) {
        super(id, edade, nome, apelido);
        this.idFederacion = idFederacion;
    }

    public void dirixirPartido() {

    }

    public void dirixirAdestramento() {

    }

    @Override
    public void viaxar() {
        String viaxar = "Viaxa o adestrador";
        System.out.println(viaxar);
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    /**
     * retorna la identificacion de el adstrador.
     * @return 
     */
    public String getIdFederacion() {
        return idFederacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Adestrador{" + "idFederacion=" + idFederacion + '}';
    }

}
