/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

/**
 * boletin11 main class
 * @author jdominguezdominguez
 */
public class Seleccion {

    private int id, edade;
    private String nome, apelido;

    public Seleccion(int id, int edade, String nome, String apelido) {
        this.id = id;
        this.edade = edade;
        this.nome = nome;
        this.apelido = apelido;
    }

    public void concentrarse() {
        String concentrarse = "Concentrase a seleccion";
        System.out.println(concentrarse);
    }

    public void viaxar() {
        String viaxar = "Viaxa a seleccion";
        System.out.println(viaxar);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getApelido() {
        return apelido;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    @Override
    public String toString() {
        return "Seleccion{" + "id=" + id + ", edade=" + edade + ", nome=" + nome + ", apelido=" + apelido + '}';
    }

}
