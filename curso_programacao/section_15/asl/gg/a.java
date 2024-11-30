package gg;
import java.util.ArrayList;

public class a {
    public static void main(String[] args) {
        // Cria uma ArrayList 2D de Strings
        ArrayList<ArrayList<String>> arrayList2D = new ArrayList<>();

        // Adiciona uma linha de dados
        ArrayList<String> row1 = new ArrayList<>();
        row1.add("A1");
        row1.add("A2");
        row1.add("A3");
        arrayList2D.add(row1);

        // Adiciona outra linha de dados
        ArrayList<String> row2 = new ArrayList<>();
        row2.add("B1");
        row2.add("B2");
        row2.add("B3");
        arrayList2D.add(row2);

        // Adiciona outra linha de dados
        ArrayList<String> row3 = new ArrayList<>();
        row3.add("C1");
        row3.add("C2");
        row3.add("C3");
        arrayList2D.add(row3);

        // Exibe o conteúdo da ArrayList 2D
        for (int i = 0; i < arrayList2D.size(); i++) {
            for (int j = 0; j < arrayList2D.get(i).size(); j++) {
                System.out.print(arrayList2D.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
