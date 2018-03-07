/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cantinelli
 */
public class Meuble {
    
    Pied[] listePieds;
    Matiere matiere;
    
    //Constructeurs
    Meuble(){
        listePieds = new Pied[0];
        matiere = new Matiere();
    }
    
    Meuble(Matiere matiere){
        this.listePieds = new Pied[0];
        this.matiere = matiere;
    }
    
    Meuble(Pied[] listePieds, Matiere matiere){
        this.listePieds = listePieds;
        this.matiere = matiere;
    }
    
    //Methode affichant
    void afficheMeuble(){
        
        int hauteurTotal = 0;
        
        for(Pied item : listePieds){
            hauteurTotal += item.hauteur;
        }
        
        System.out.println("J’ai " + listePieds.length + " pied(s) de " + hauteurTotal + " cm de hauteur et je suis composé de " + matiere.nom + " de couleur " + matiere.couleur);

    }
}
