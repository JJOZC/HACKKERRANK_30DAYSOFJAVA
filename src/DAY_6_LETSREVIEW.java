import java.util.Scanner;

public class DAY_6_LETSREVIEW {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int deneme = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<deneme;i++){

            String girdi = scanner.nextLine();
            char dizi[] = new char[girdi.length()];
            for(int j=0;j<girdi.length();j++){dizi[j] = girdi.charAt(j);}

            if (dizi.length % 2 == 1){
                int uzunluktek   = (girdi.length() - 1)/2;
                int uzunlukcift = (girdi.length() - 1)/2 + 1;

                char dizitek[] = new char[uzunluktek];
                char dizicift[] = new char[uzunlukcift];

                for(int j=0;j<girdi.length();j++){

                    if(j%2==0){
                        int indexcift = j/2;
                        dizicift[indexcift] = dizi[j];
                    }
                    else if(j%2==1){
                        int indextek = j/2;
                        dizitek[indextek] = dizi[j];
                    }
                }
                for(int j=0;j<dizicift.length;j++){System.out.print(dizicift[j]);}
                System.out.print(" ");
                for(int j=0;j<dizitek.length;j++){System.out.print(dizitek[j]);}
                System.out.print("\n");
            }
            else if (girdi.length() % 2 == 0){

                int uzunluk = girdi.length()/2;
                char dizitek[] = new char[uzunluk];
                char dizicift[] = new char[uzunluk];

                for(int j=0;j<girdi.length();j++){

                    if(j%2==0){
                        int indexcift = j/2;
                        dizicift[indexcift] = dizi[j];
                    }
                    else if(j%2==1){
                        int indextek = j/2;
                        dizitek[indextek] = dizi[j];
                    }
                }

                for(int j=0;j<dizicift.length;j++){System.out.print(dizicift[j]);}
                System.out.print(" ");
                for(int j=0;j<dizitek.length;j++){System.out.print(dizitek[j]);}
                System.out.print("\n");

            }


        }

    }
}