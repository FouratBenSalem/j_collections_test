import java.util.LinkedList;
import java.util.ListIterator;


/*
    ArrayList : mono-thread, accès direct, optimisée pour la lecture
    LinkedList : insertions rapides
    Vector : multi-thread, accès direct, optimisée pour la lecture
    Stack : LIFO

    Informations Ordonnées, acceptent les valeurs Nulles et les doublons
    
    à prendre en consideration : 
        Capacité != Taile
        Taille <= Capacité

    add(), addAll(), get(),remove(), clear(), size(), //Vectors : capacity()

    LinkedList methods : 
        addFirst(), addLast, removeFirst(), removeLast(), getFirst(), getLast()
*/

public class Main
{
    public static void main(String[] args) 
    {
        LinkedList<Cat> group = new LinkedList<Cat>();

        Cat c1 = new Cat("Toudoux");
        Cat c2 = new Cat("Popy");
        Cat c3 = new Cat("Maki");

        group.addFirst(c1);
        group.addFirst(c2);
        group.addFirst(c3);

        ListIterator<Cat> lit = group.listIterator();

        while(lit.hasNext())
            lit.next().meow();


        
    }
}