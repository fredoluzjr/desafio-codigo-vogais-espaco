//import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
     //Scanner sc = new Scanner(System.in);
     //String str = sc.nextLine();
     String str = "Amo a DIO";
     String[] strSplit = str.split(" ");
     char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
     int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
    
    for (String item : strSplit) {
        item = item.toLowerCase();
        System.out.println(item);


  //Dica: Você pode utilizar o Character.toLowerCase em sua condição:
      for (int i = 0; i < strSplit.length; i++) {

        //System.out.println(strSplit[i]);
        for(int j = 0; j < arrVogais.length; j++) {
            //System.out.println(item);
          //item = item.toLowerCase();
          //System.out.println(item);
          if (item.equals(arrVogais[j])) {
            //System.out.println(item);
            //System.out.println(arrVogais[j]);
            quantVogais++;
          }
        }
      }
    }
    System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
}
}