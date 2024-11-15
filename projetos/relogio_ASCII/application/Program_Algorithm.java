package application;

public class Program_Algorithm {
	public static String create_ASCII_Hour(String time) {
	      String asciiTime="";
	      String linha1="";
	      String linha2="";
	      String linha3="";
	      
	      

	      String[] textoSeparado = time.split("");
	      
	      if (textoSeparado[0].equals("0")) {
	            textoSeparado[0] = "";
	      }
	        
	        for (String number : textoSeparado) {
	        	switch(number) {
		        	case "1":
		        		linha1 += "   ";
		        	break;
		        	case "2": 
		        		linha1 += " _ ";
		        	break;
		        	case "3": 
		        		linha1 += " _ ";
		        	break;
		        	case "4": 
		        		linha1 += "   ";
		        	break;
		        	case "5": 
		        		linha1 += " _ ";
		        	break;
		        	case "6": 
		        		linha1 += " _ ";
		        	break;
		        	case "7": 
		        		linha1 += " _ ";
		        	break;
		        	case "8": 
		        		linha1 += " _ ";
		        	break;
		        	case "9": 
		        		linha1 += " _ ";
		        	break;
		        	case "0": 
		        		linha1 += " _ ";
		        	break;
		        	case ":": 
		        		linha1 += "   ";
		        	break;
		        	default:
		        		linha1 += "   ";
		        	break;
	        	}
	        
	          
	        }

	        linha1 +="\n";
	        asciiTime+=linha1;
	        
	        for (String number : textoSeparado) {
	        	switch(number) {
	        	case "1":
	        		linha2 += "  |";
	        	break;
	        	case "2": 
	        		linha2 += " _|";
	        	break;
	        	case "3": 
	        		linha2 += " _|";
	        	break;
	        	case "4": 
	        		linha2 += "|_|";
	        	break;
	        	case "5": 
	        		linha2 += "|_ ";
	        	break;
	        	case "6": 
	        		linha2 += "|_ ";
	        	break;
	        	case "7": 
	        		linha2 += "  |";
	        	break;
	        	case "8": 
	        		linha2 += "|_|";
	        	break;
	        	case "9": 
	        		linha2 += "|_|";
	        	break;
	        	case "0": 
	        		linha2 += "| |";
	        	break;
	        	case ":": 
	        		linha2 += " . ";
	        	break;
	        	default:
	        		linha2 += "   ";
	        	break;
	        	}
	        }
	          linha2 +="\n";
	          asciiTime+=linha2;
	          for (String number : textoSeparado) {
	        	  switch(number) {
		        	case "1":
		        		linha3 += "  |";
		        	break;
		        	case "2": 
		        		linha3 += "|_ ";
		        	break;
		        	case "3": 
		        		linha3 += " _|";
		        	break;
		        	case "4": 
		        		linha3 += "  |";
		        	break;
		        	case "5": 
		        		linha3 += " _|";
		        	break;
		        	case "6": 
		        		linha3 += "|_|";
		        	break;
		        	case "7": 
		        		linha3 += "  |";
		        	break;
		        	case "8": 
		        		linha2 += "|_|";
		        	break;
		        	case "9": 
		        		linha3 += " _|";
		        	break;
		        	case "0": 
		        		linha3 += "|_|";
		        	break;
		        	case ":": 
		        		linha3 += " . ";
		        	break;
		        	default:
		        		linha3 += "   ";
		        	break;
		        	}

	          }
	          asciiTime+=linha3;
	        
	        
	        
				return asciiTime;
			}

	
}
