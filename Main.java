import java.util.Stack;
import java.util.ListIterator;


/*
    1)ArrayList : mono-thread, accès direct, optimisée pour la lecture
    2)LinkedList : insertions rapides
    3)Vector : multi-thread, accès direct, optimisée pour la lecture
      |-> 4)Stack : LIFO

    Informations Ordonnées, acceptent les valeurs Nulles et les doublons
    
    [!] à prendre en consideration : 
            Capacité != Taile
            Taille <= Capacité

    * Collections Methods : 
        add(), addAll(), get(),remove(), clear(), size(), isEmpty(), empty(), //Vectors : capacity()

    * LinkedList Methods : 
        addFirst(), addLast, removeFirst(), removeLast(), getFirst(), getLast()
*/

public class Main
{
    public static void main(String[] args) 
    {
        Stack<Cat> group = new Stack<Cat>();

        Cat c1 = new Cat("Toudoux");
        Cat c2 = new Cat("Popy");
        Cat c3 = new Cat("Maki");

        group.push(c1);
        group.push(c2);
        group.push(c3);

        ListIterator<Cat> lit = group.listIterator();

        while(lit.hasNext())
            lit.next().meow();

        System.out.println("\nSommet de la liste : "+group.peek());
        group.peek().meow();


        
    }
}