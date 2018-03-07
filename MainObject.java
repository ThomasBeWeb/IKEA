/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cantinelli
 */
public class MainObject {
    
    public static void main(String[] args){
        
        //Creations de 5 objets Pied, stockes dans un tableau
        int[] listeHauteurs = {12,26,45,22,38};

        Pied[] listeNewPieds = new Pied[listeHauteurs.length];

        for(int i = 0 ; i < listeNewPieds.length ; i++){
            listeNewPieds[i] = new Pied(listeHauteurs[i]);
        }
        
        //Creation de 3 tableaux de pieds de taille differente, stockes dans un tableau
        
        Pied[][] listePieds = {{listeNewPieds[0],listeNewPieds[3]},{listeNewPieds[0],listeNewPieds[3],listeNewPieds[1],listeNewPieds[4]},{listeNewPieds[2]}};

        //Creations de 3 objets Matiere stockes dans un tableau
        String[] listeNoms = {"bois","plastique","aluminium"};
        String[] listeCouleurs = {"marron","rouge","gris"};
    
        Matiere[] listeNewMatieres = new Matiere[listeNoms.length];
        
        for(int i = 0 ; i < listeNoms.length ; i++){
            listeNewMatieres[i] = new Matiere(listeNoms[i],listeCouleurs[i]);
        }
        
        //Creation des 3 objets Meuble
        
        Meuble[] listeMeubles = new Meuble[3];
        
        for(int i = 0 ; i < listeMeubles.length ; i++){
            listeMeubles[i] = new Meuble(listePieds[i],listeNewMatieres[i]);
        }
        
        for(Meuble item : listeMeubles){
            item.afficheMeuble();
        }
    }    
}
