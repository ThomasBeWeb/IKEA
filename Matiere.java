/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cantinelli
 */
public class Matiere {
    
    String nom;
    String couleur;
    
    Matiere(){
        nom = "inconnu";
        couleur = "inconnue";
    }
    
    Matiere(String nom){
        this.nom = nom;
        this.couleur = "inconnue";
    }
    
    Matiere(String nom, String couleur){
        this.nom = nom;
        this.couleur = couleur;
    }
}
