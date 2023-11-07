/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Autor;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author Marko
 */
public class Controller {
    private List<Knjiga> listaKnjiga;
    private List<Autor> listaAutora;

    private static Controller instance;
    public static Controller getInstance(){
        if(instance == null){
            instance = new Controller();
        }
        return instance;
    }
    
    private Controller() {
        Autor autor1 = new Autor("Ivo", "Andric", 1892, "Biografije Ive kuracpalac");
        Autor autor2 = new Autor("Danilo", "Kis", 1935, "Danilova biografija");
        Autor autor3 = new Autor("Mesa", "Selimovic", 1910, "Biografija mese");
        
        Knjiga knjiga1 = new Knjiga("Na Drini", autor1, "32156753", 1945, Zanr.ROMAN);
        Knjiga knjiga2 = new Knjiga("Basta, pepeo", autor2, "33264432", 1982, Zanr.ISTORIJSKI);
        Knjiga knjiga3 = new Knjiga("Tvrdjava", autor3, "7533525", 1970, Zanr.POEZIJA);
        
        listaKnjiga = new ArrayList<>();
        listaAutora = new ArrayList<>();
        
        listaKnjiga.add(knjiga1);
        listaKnjiga.add(knjiga2);
        listaKnjiga.add(knjiga3);
        
        listaAutora.add(autor1);
        listaAutora.add(autor2);
        listaAutora.add(autor3);
    }

    public List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void setListaKnjiga(List<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }

    public List<Autor> getListaAutora() {
        return listaAutora;
    }

    public void setListaAutora(List<Autor> listaAutora) {
        this.listaAutora = listaAutora;
    }

    public void obrisiKnjigu(int selektovaniRed) {
        listaKnjiga.remove(selektovaniRed);
    }

    public void dodajKnjigu(Knjiga novaKnjiga) {
        listaKnjiga.add(novaKnjiga);
        //System.out.println("Knjiga je dodata!");
        //System.out.println(listaKnjiga);
    }


    
    
}
