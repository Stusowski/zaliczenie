import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Podaj ilość elementów macierzy:");
    int ile = in.nextInt();
    System.out.println("Podaj elementy macierzy:");
    int[] szerokosc = new int[ile];
    for(int i=0;i<ile;i++){
      szerokosc[i] = in.nextInt();
    }
    int suma=0;
    for(int j=0;j<ile;j++){
      suma=suma+szerokosc[j];
    }
    System.out.println(suma);
  }
}