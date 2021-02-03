package bingo;

import java.util.Scanner;


    public class MainBingo {

        
        public static void main(String[] args) {
            bingo.Bingo bn = new bingo.Bingo();
            bn.carton();

            Scanner sc = new Scanner(System.in);
            while (!bn.bingo) {
                bn.mcartilla();
                bn.bola();

                System.out.println("Es bingo?");
                String bingo = sc.nextLine();
                if (bingo.equalsIgnoreCase("bingo")) {
                    bn.bingo = !bn.bingo;
                }
            }
        }
    }

