import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int uneseniBroj = 0;
        String unos;
        boolean valid = true;
        int sum = 0;

        do {

            System.out.println("Unesite cijeli broj: ");

            unos = scanner.nextLine();              //uzimamo unesene vrijednosti iz terminala

            //provjeravamo da li je unesen integer
            try {
                uneseniBroj = Integer.parseInt(unos);
                valid = uneseniBroj >= 0 ? true : false;

            ProvjeraDana(uneseniBroj);      //pozivamo metodu koja provjerava koji je dan u tjednu

            }catch (NumberFormatException nfe){
                System.out.println("Unijeli ste krivi broj. Pokušajte ponovno.");
            }



            if(uneseniBroj > 0) {       //provjera da li je uneseni broj veci od 0


                switch (uneseniBroj % 2) {        //switch funkcija za zbrajanje ukoliko je uneseni broj paran

                    case 0:
                        sum += uneseniBroj;
                        break;
                    default:
                        break;
                }
            }
            
        }while (valid);

        System.out.println("Zbroj parnih brojeva je: " + sum);
    }


    //metoda za provjeru dana u tjednu
    public static void ProvjeraDana (int uneseniBroj){

        int provjeraDana = uneseniBroj % 7;

        switch (provjeraDana){

            case 0:
                System.out.println("Nedjelja");
                break;
            case 1:
                System.out.println("Ponedjeljak");
                break;
            case 2:
                System.out.println("Utorak");
                break;
            case 3:
                System.out.println("Srijeda");
                break;
            case 4:
                System.out.println("Četvrtak");
                break;
            case 5:
                System.out.println("Petak");
                break;
            case 6:
                System.out.println("Subota");
                break;
            default:
//                System.out.println("Unesen je krivi broj.");
                break;
        }
    }
}
