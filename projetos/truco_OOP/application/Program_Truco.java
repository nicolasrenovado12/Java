package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import entities.Letters;
import entities.Player;
import services.Random_Matriz_Service;

public class Program_Truco {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> ranks = Map.of(
                1, "4",
                2, "5",
                3, "6",
                4, "7",
                5, "Valete",
                6, "Dama",
                7, "Rei",
                8, "As",
                9, "2",
                10, "3"
        );
        Map<Integer, String> suits = Map.of(
                1, "Copas",
                2, "Ouros",
                3, "Espadas",
                4, "Paus"
                
        );
          
        
        System.out.println("Digit name of player: ");
        String name = sc.next();
        Map<Integer, String> ranksPlayer = new HashMap<>(); 
        Map<Integer, String> suitsPlayer = new HashMap<>();
        
        
        Random_Matriz_Service.randomizerMap(ranksPlayer, ranks);
        Random_Matriz_Service.randomizerMap(suitsPlayer, suits);
        
                
        Letters letters = new Letters(ranksPlayer, suitsPlayer);
        Player player = new Player(name, letters);
                
        
        
                
                
                
    





    }
	
	
	
}
