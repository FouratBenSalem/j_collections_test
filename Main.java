import java.util.ArrayList;
import java.util.Vector;


/*
    ArrayList : mono-thread, accès direct, optimisée pour la lecture
    LinkedList : insertions rapides
    Vector : multi-thread, accès direct, optimisée pour la lecture
    Stack :

    Informations Ordonnées, acceptent les valeurs Nulles et les doublons
    
    à prendre en consideration : 
        Capacité != Taile
        Taille <= Capacité

    add(), addAll(), remove(), clear(), size(), //Vectors : capacity()
*/

public class Main
{
    public static void main(String[] args) 
    {
        Vector<Cat> group = new Vector<Cat>();

        Cat c1 = new Cat("Toudoux");
        Cat c2 = new Cat("Popy");
        Cat c3 = new Cat("Maki");

        group.add(c1);
        group.add(c2);
        group.add(c3);

        for(Cat c: group)
            c.meow();
        System.out.println("\n"+ group.get(0) + "\n");

        System.out.println("Taille : "+group.size());
        System.out.println("Capacite : "+group.capacity()); // Pour les Vectors

        
    }
}