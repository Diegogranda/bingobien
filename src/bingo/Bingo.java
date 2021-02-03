package bingo;

import java.util.ArrayList;
import java.util.Random;



    public class Bingo {

        ArrayList Lb = new ArrayList();
        ArrayList Li = new ArrayList();
        ArrayList Ln = new ArrayList();
        ArrayList Lg = new ArrayList();
        ArrayList Lo = new ArrayList();

        boolean bingo = false; //ternimar juego

        public void carton() {
            this.Lb.add("B");
            this.Li.add("I");
            this.Ln.add("N");
            this.Lg.add("G");
            this.Lo.add("O");

            this.glista();
        }

        public void mcartilla() {
            System.out.println("--------------------------------------------");
            for (int i = 0; i < this.Lb.size(); i++) {
                System.out.println("|\t" + this.Lb.get(i) + "\t|\t" + this.Li.get(i) + "\t|\t" + this.Ln.get(i) + "\t|\t" + this.Lg.get(i) + "\t|\t" + this.Lo.get(i) + "\t|\t");
                System.out.println("--------------------------------------------");
            }
        }

        public void glista() {
            Random rd = new Random();
            for (int i = 0; i < 5; i++) {
                this.Lb.add(rd.nextInt(20));
                this.Li.add(rd.nextInt(20) + 20);
                this.Ln.add(rd.nextInt(20) + 40);
                this.Lg.add(rd.nextInt(20) + 60);
                this.Lo.add(rd.nextInt(20) + 80);
            }
        }

        public void bola() {
            String[] bolas = new String[5];
            bolas[0] = "B";
            bolas[1] = "I";
            bolas[2] = "N";
            bolas[3] = "G";
            bolas[4] = "O";

            Random rd = new Random();

            String bola1 = bolas[rd.nextInt(5)];

            int numero = rd.nextInt(20);
            switch (bola1) {
                case "B":
                    this.xencartilla(Lb, numero);
                    break;
                case "I":
                    numero += 20;
                    this.xencartilla(Li, numero);
                    break;
                case "N":
                    numero += 40;
                    this.xencartilla(Ln, numero);
                    break;
                case "G":
                    numero += 60;
                    this.xencartilla(Lg, numero);
                    break;
                case "O":
                    numero += 80;
                    this.xencartilla(Lo, numero);
                    break;
            }
            System.out.println(bola1 + numero);
        }

        public ArrayList xencartilla(ArrayList lista, int numero) {
            int pos = lista.indexOf(numero);
            if (pos >= 0) {
                lista.set(pos, "X");
            }
            return lista;
        }
    }

