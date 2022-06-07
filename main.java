import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                int counter,number, max=1,min=1;
                Scanner input =new Scanner(System.in);
                System.out.print("Kaç tane sayı gireceksiniz : ");
                counter= input.nextInt();

                for(int i=1;i<=counter;i++){
                    System.out.print(i+" .sayıyı giriniz : ");
                    number =input.nextInt();

                    if(counter<number) {
                        max = number;
                    }else
                        min = number;
                }
                System.out.println("en büyük sayı : "+ max);
                System.out.println("en küçük sayı :"+ min);

            }
        }
