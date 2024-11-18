package application;
import java.util.ArrayList;
import java.util.Arrays;

public class Program_Find_Snake {
    public static ArrayList<ArrayList<Integer>> findSnakeOnGrid(ArrayList<String> grid) {
       ArrayList<ArrayList<Integer>> arrayOutput = new ArrayList<ArrayList<Integer>>();
      int r=0;
      int progressivoX = 0;
      int progressivoY = 0;
      for (int i = 0; i < grid.size(); i++) {   
            String linha = grid.get(i);
            for (int j = 0; j < linha.length(); j++) {
                System.out.println(linha.charAt(j));
                char parametro = linha.charAt(j);

                if (parametro == 'h') {
                    arrayOutput.add(new ArrayList<Integer>());
                    arrayOutput.get(r).add(j);
                    arrayOutput.get(r).add(i);
                    progressivoX = j;
                    progressivoY = i;
                    r+=1;
                    
                      
                }
              
            }
        }
        int parametro1 = 0;
        int parametro2 = 0;
        int parametro3 = 0;
        int parametro4 = 0;
        char parametroApontado = 'a';
        // Primeiro é importante calcular a quantidade de certos parâmetros
        for (int i = 0; i < grid.size(); i++) {
            String linha = grid.get(i);
            for (int j = 0; j < linha.length(); j++) {
                char parametro = linha.charAt(j);

                if (parametro == '>') { 
                    parametro1+=1;    
                    if (j == progressivoX-1 && i == progressivoY) {
                        parametroApontado = '>';
                    }
                } 
                if (parametro == '^') {
                    parametro2+=1;
                    if (i == progressivoY+1 && j == progressivoX) {
                        parametroApontado = '^';
                    }
                }
                if (parametro == '<') {
                    parametro3+=1;
                    if (j == progressivoX+1 && i == progressivoY) {
                        parametroApontado = '<';
                    }
                }
                if (parametro == 'v') {
                    parametro4+=1;
                    if (i == progressivoY-1 && j == progressivoX) {
                        parametroApontado = 'v';
                    }
                }

                
            }
        }
        int parametrosSomados = parametro1 + parametro2 + parametro3 + parametro4; 
        System.out.println("Parâmetros somados = " + parametrosSomados);
        Boolean completo = true;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        // j = x
        // i = y
        // Resultado = (x, y)
        while (completo) {
            for (int i = 0; i < grid.size(); i++) {
                String linha = grid.get(i);
                for (int j = 0; j < linha.length(); j++) {
                    char parametro = linha.charAt(j);
    
                   

                        if (parametro == '>' && j == progressivoX-1 && i == progressivoY && p1 != parametro1) {
                            arrayOutput.add(new ArrayList<Integer>());
                            
                            arrayOutput.get(r).add(j);
                            arrayOutput.get(r).add(i);
                            progressivoX = j;
                            progressivoY = i;
                            r+=1;
                            p1+=1;
                            System.out.println(p1);
                             
                            
                        } 
                        
                        if (parametro == '^' && i == progressivoY+1 && j == progressivoX && p2 != parametro2) {
                            arrayOutput.add(new ArrayList<Integer>());
                            
                            arrayOutput.get(r).add(j);
                            arrayOutput.get(r).add(i);
                            progressivoX = j;
                            progressivoY = i;
                            r+=1;
                            p2+=1;
                            System.out.println("p2 = " + p2);
                        }
                        if (parametro == '<' && j == progressivoX+1 && i == progressivoY) {
                            arrayOutput.add(new ArrayList<Integer>());
                            
                            arrayOutput.get(r).add(j);
                            arrayOutput.get(r).add(i);
                            progressivoX = j;
                            progressivoY = i;
                            r+=1;
                            p3+=1;
                            System.out.println("p3 = " + p3);
                        }
                        if (parametro == 'v' && i == progressivoY-1 && j == progressivoX) {
                            arrayOutput.add(new ArrayList<Integer>());
                            
                            arrayOutput.get(r).add(j);
                            arrayOutput.get(r).add(i);
                            progressivoX = j;
                            progressivoY = i;
                            r+=1;
                            p4+=1;
                            System.out.println("p4 = " + p4);
                        }
                        if ((p1+p2+p3+p4) == parametrosSomados) {
                            completo = false;
                        }

                }
            }
           
            
        }
        

                       
        
        return arrayOutput;
    }
}