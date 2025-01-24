package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

import entities.Letters;
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
        		deck.put(cardNumber, symbols.get(i)+suit.get(e));
        		cardNumber++;
        	}
        }
        
        Map<Integer, String> playerCards = new HashMap<>(); 
        
        /*
        Random_Matriz_Service.randomizerMap(ranksPlayer, ranks, 3);
        Random_Matriz_Service.randomizerMap(suitsPlayer, suits, 3);
        
        Letters letters = new Letters(ranksPlayer, suitsPlayer);;              
        playerCards.forEach((key, value) -> {
            System.out.println("Chave: " + key + " Valor: " + value);
            });        
          */      
                
                
    





    }
	
	
	
}
