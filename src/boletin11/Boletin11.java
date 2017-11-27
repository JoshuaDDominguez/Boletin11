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
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Seleccion seleccion = new Seleccion(1, 10, "Joshua", "Dominguez");
        Xogador xogador = new Xogador(2, 20, "Maria", "Nuñez", 100, "Delantero");
        Adestrador adestrador = new Adestrador(3, 30, "Ivan", "Soya", "Idntificador");
        Masaxista masaxista = new Masaxista(4, 40, "Ale", "Soto", "Doctorado", 5);
        Seleccion xogadorSel = new Xogador(5, 50, "Andrea", "Gregores", 200, "Portero");

        seleccion.concentrarse();
        xogador.concentrarse();
        adestrador.concentrarse();
        masaxista.concentrarse();
        xogadorSel.concentrarse();

        System.out.println("\n");

        seleccion.viaxar();
        xogador.viaxar();
        adestrador.viaxar();
        masaxista.viaxar();
        xogadorSel.viaxar();
        
        xogador.concentrarse();
        
        System.out.println("\n");
        
        System.out.println(xogadorSel.toString());
    }

}
