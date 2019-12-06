package Calculator;

import java.io.*;
import java.util.*;
import java.lang.String;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        Razbivka raz = new Razbivka(s);

        raz.vozvrat();

        RaschetSim rasch = new RaschetSim(raz.simvol1, raz.simvol2, raz.simvol3);

        if ((thisarab(raz.simvol1)) & (thisarab(raz.simvol3))){
            int s1, s2;
            s1 = Integer.parseInt(raz.simvol1);
            s2 = Integer.parseInt(raz.simvol3);
            System.out.println(rasch.vozvratZnacheniya(s1, s2));
        }else if ((thisrim(raz.simvol1)) & (thisrim(raz.simvol3))){
            switch (String.valueOf((rasch.vozvratZnacheniya(raz.simvol1, raz.simvol3)))){
                case ("1"):{
                    System.out.println("I");
                    break;
                }
                case ("2"):{
                    System.out.println("II");
                    break;
                }
                case ("3"):{
                    System.out.println("III");
                    break;
                }
                case ("4"):{
                    System.out.println("IV");
                    break;
                }
                case ("5"):{
                    System.out.println("V");
                    break;
                }
                case ("6"):{
                    System.out.println("VI");
                    break;
                }
                case ("7"):{
                    System.out.println("VII");
                    break;
                }
                case ("8"):{
                    System.out.println("VIII");
                    break;
                }
                case ("9"):{
                    System.out.println("IX");
                    break;
                }
                case ("10"):{
                    System.out.println("X");
                    break;
                }
                case ("11"):{
                    System.out.println("XI");
                    break;
                }
                case ("12"):{
                    System.out.println("XII");
                    break;
                }
                case ("13"):{
                    System.out.println("XIII");
                    break;
                }
                case ("14"):{
                    System.out.println("XIV");
                    break;
                }
                case ("15"):{
                    System.out.println("XV");
                    break;
                }
                case ("16"):{
                    System.out.println("XVI");
                    break;
                }
                case ("17"):{
                    System.out.println("XVII");
                    break;
                }
                case ("18"):{
                    System.out.println("XVIII");
                    break;
                }
                case ("19"):{
                    System.out.println("XIX");
                    break;
                }
                case ("20"):{
                    System.out.println("XX");
                    break;
                }
            }
        }else System.out.println("Неверный входящий поток");
    }

    private static boolean thisarab (String chislo){
        return (chislo.equals("1")) | (chislo.equals("2")) | (chislo.equals("3")) | (chislo.equals("4")) | (chislo.equals("5")) | (chislo.equals("6")) | (chislo.equals("7")) | (chislo.equals("8")) | (chislo.equals("9")) | (chislo.equals("10"));
    }

    private static boolean thisrim(String chislo){
        return (chislo.equals("I")) | (chislo.equals("II")) | (chislo.equals("III")) | (chislo.equals("IV")) | (chislo.equals("V")) | (chislo.equals("VI")) | (chislo.equals("VII")) | (chislo.equals("VIII")) | (chislo.equals("IX")) | (chislo.equals("X"));
    }

    public static class Razbivka {
        String stroka, simvol1, simvol2, simvol3;

        private Razbivka(String stroka){
            this.stroka = stroka;
        }

        private void vozvrat (){
            StringTokenizer st = new StringTokenizer(stroka);
            this.simvol1 = st.nextToken();
            this.simvol2 = st.nextToken();
            this.simvol3 = st.nextToken();
        }
    }

    public static class RaschetSim{
        String znak, iznachSim1, iznachSim3;
        int preobrazSim1, preobrazSim2;

        private RaschetSim(String iznachSim1, String znak, String iznachSim3){
            this.iznachSim1 = iznachSim1;
            this.znak = znak;
            this.iznachSim3 = iznachSim3;
        }

        private int vozvratZnacheniya(int znach1, int zhach3){
            preobrazSim1 = znach1;
            preobrazSim2 = zhach3;
            return podschetznacheniy();
        }

        private int vozvratZnacheniya(String znach1, String znach3){
            switch (znach1){
                case ("I"):{
                    preobrazSim1 = 1;
                    break;
                }
                case ("II"):{
                    preobrazSim1 = 2;
                    break;
                }
                case ("III"):{
                    preobrazSim1 = 3;
                    break;
                }
                case ("IV"):{
                    preobrazSim1 = 4;
                    break;
                }
                case ("V"):{
                    preobrazSim1 = 5;
                    break;
                }
                case ("VI"):{
                    preobrazSim1 = 6;
                    break;
                }
                case ("VII"):{
                    preobrazSim1 = 7;
                    break;
                }
                case ("VIII"):{
                    preobrazSim1 = 8;
                    break;
                }
                case ("IX"):{
                    preobrazSim1 = 9;
                    break;
                }
                case ("X"):{
                    preobrazSim1 = 10;
                    break;
                }
                default:{
                    preobrazSim1 = 0;
                }
            }
            switch (znach3){
                case ("I"):{
                    preobrazSim2 = 1;
                    break;
                }
                case ("II"):{
                    preobrazSim2 = 2;
                    break;
                }
                case ("III"):{
                    preobrazSim2 = 3;
                    break;
                }
                case ("IV"):{
                    preobrazSim2 = 4;
                    break;
                }
                case ("V"):{
                    preobrazSim2 = 5;
                    break;
                }
                case ("VI"):{
                    preobrazSim2 = 6;
                    break;
                }
                case ("VII"):{
                    preobrazSim2 = 7;
                    break;
                }
                case ("VIII"):{
                    preobrazSim2 = 8;
                    break;
                }
                case ("IX"):{
                    preobrazSim2 = 9;
                    break;
                }
                case ("X"):{
                    preobrazSim2 = 10;
                    break;
                }
                default:{
                    preobrazSim2 = 0;
                }
            }
            return podschetznacheniy();
        }

        private int podschetznacheniy() {
            switch (this.znak) {
                case "+":
                    return preobrazSim1 + preobrazSim2;
                case "-":
                    return preobrazSim1 - preobrazSim2;
                case "*":
                    return preobrazSim1 * preobrazSim2;
                case "/":
                    return preobrazSim1 / preobrazSim2;
            }
            return 0;
        }
    }
}
