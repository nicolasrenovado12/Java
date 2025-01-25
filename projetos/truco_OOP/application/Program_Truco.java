package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import entities.Player;
import services.Random_Matriz_Service;

public class Program_Truco {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> deck = new HashMap<>(); 
        Map<Integer, String> symbols = Map.of(
        		0, "4",
        		1, "5",
        		2, "6",
        		3, "7",
        		4, "Vallete",
        		5, "Dama",
        		6, "Rei",
        		7, "1(ás)",
        		8, "2",
        		9, "3");
        Map<Integer, String> suit = Map.of(
        		1, "Ouros",
        		2, "Espadas",
        		3, "Copas",
        		4, "Paus"
        		);
        int cardNumber = 0;
   
        for(int i=0; i<symbols.size(); i++) {
        	for(int e=1; e<=suit.size(); e++) {
        		deck.put(cardNumber, symbols.get(i)+" "+suit.get(e));
        		cardNumber++;
        	}
        }
        System.out.println(deck);
        System.out.println("Digit your name: ");
        String name = sc.next();        
        Map<Integer, String> playerCards = new HashMap<>(); 
        Map<Integer, String> machineCards = new HashMap<>();
        
        Random_Matriz_Service.randomizerMap(playerCards, deck, 3);
        Random_Matriz_Service.randomizerMap(machineCards, deck, 3);
        List<Integer> keysMachine = new ArrayList<>();
        List<Integer> keysPlayer = new ArrayList<>();

        
        Player player = new Player(name, playerCards);
        
        machineCards.forEach((key, value) -> {
        	keysMachine.add(key);
        	});
        playerCards.forEach((key, value) -> {
        	keysPlayer.add(key);
        	});
        
        boolean game = false;
        while(game == false) {

        	int machineGame = random.nextInt(machineCards.size());
            System.out.println("Your cards");
            playerCards.forEach((key, value) -> {
               	
                	System.out.println("Chave: " + keysPlayer.indexOf(key) + " Valor: " + value);
                   	

                });
;

            System.out.println("Digit value of your card: ");
            int playerGame = sc.nextInt();
           
            if (playerCards.get(keysPlayer.get(playerGame)) != null) {
            	System.out.println("Your card:");
            	System.out.println(playerCards.get(keysPlayer.get(playerGame)));
               	playerCards.remove(keysPlayer.get(playerGame));
               	
              
                System.out.println("Card of machine: ");
                System.out.println(machineCards.get(keysMachine.get(machineGame)));
                machineCards.remove(keysMachine.get(machineGame));
                
                
                if(keysPlayer.get(playerGame) > keysMachine.get(machineGame)) {
                    System.out.println("Player win");
                    keysMachine.remove(keysMachine.get(machineGame));
                    keysPlayer.remove(keysPlayer.get(playerGame));
                    System.out.println();
                    
                } else {
                    System.out.println("Machine win");
                    keysMachine.remove(keysMachine.get(machineGame));
                    keysPlayer.remove(keysPlayer.get(playerGame));
                    System.out.println();
                
                }

            } else {
            	System.out.println("Digite um valor válido");
            }
        }    
                
                
    





    }
	
	
	
}
