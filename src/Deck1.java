import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Deck1 {
    public static void main(String[] args) {
        Card carta = new Card();
        int Palo = carta.palo.length;
        int Color = carta.color.length;
        int Valor = carta.valor.length;
        int NUM = Palo * Color * Valor;

        ArrayList<String> deck = new ArrayList<>();
        for (int i = 0; i < Valor; i++){
            for (int p = 0; p < Palo; p++){
                deck.add(carta.palo[p]+ "- Rojo -" + carta.valor[i]); //Se copia el codigo para el color negro tambien.
                deck.add(carta.palo[p]+ "- Negro -" + carta.valor[i]);
            }
        }
        Iterator<String> siguienteIt = deck.iterator();
        while(siguienteIt.hasNext()){
            String componente = siguienteIt.next();
            System.out.println(componente+"--");
        }
        shuffle(deck);
        head(deck);
        pick(deck);
        hand(deck);
    }
    //Paso 1: Ahora se debe mezlcar el deck con el metodo "Shuffle".

    public static void shuffle(ArrayList deck){
        ArrayList<String> values = deck;
        Collections.shuffle(values);
        System.out.println("\n Se mezclo el Deck");
        Iterator<String> nombreIterator2 = deck.iterator();
        while(nombreIterator2.hasNext()){
            String componente = nombreIterator2.next();
            System.out.println(componente+"--");
        }
    }

    //Paso 2: Ahora se debe mostrar la primera carta del deck con el metodo "Head".

    public static void head(ArrayList deck){
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " numeros de cartas \n");
    }

    // Paso 3: Ahora se debe seleccionar una carta aleatoria del deck con el metodo "Pick".

    public static void pick(ArrayList deck){
        Random aleatorio = new Random();
        System.out.println(deck.get(aleatorio.nextInt(deck.size())));
        deck.remove(aleatorio.nextInt(deck.size()));
        System.out.println("Quedan " + deck.size() + " numeros de cartas \n");
    }

    // Paso 4: Por ultimo se regresara el arreglo de cinco cartas del deck con el metodo "Hand".

    public static void hand(ArrayList deck){
        for(int i = 0; i <= 4; i++){
            System.out.println(deck.get(i));
        }
        for(int i = 0; i <= 4; i++){
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size()+ "numeros de cartas");
    }
}

