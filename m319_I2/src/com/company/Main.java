package com.company;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Quadrat zeichen
        System.out.println("Geben Sie die Seitenlänge ein:");
        int iZahl = sc.nextInt();

        for (int iVert = 1; iVert <= iZahl; iVert++) {
            String sZeile = "";

            for (int iHor = 1; iHor <= iZahl; iHor++) {
                sZeile = sZeile + "X";
            }
            System.out.println(sZeile);
        }
        System.out.println("");

        //a) Linie abwechselnd
        for (int iVert = 1; iVert <= iZahl; iVert++){
            String sZeile = "";
            for (int iHor = 1; iHor <= iZahl; iHor++) {
                if ((iVert % 2) != 0) {sZeile = sZeile + "X";}
                else {sZeile = sZeile + "*";}
            }
            System.out.println(sZeile);
        }

        System.out.println("");

        //Spalete alternierend
        for (int iVert = 1; iVert <= iZahl; iVert++){
            String sZeile = "";
            for (int iHor = 1; iHor <= iZahl; iHor++) {
                if ((iHor % 2) != 0) {sZeile = sZeile + "X";}
                else {sZeile = sZeile + "*";}
            }
            System.out.println(sZeile);
        }

        System.out.println("");

        //Werte multiplizieren


        for (int iVert = 1; iVert <= iZahl; iVert++){

        }

        for (int iVert = 1; iVert <= iZahl; iVert++){
            String sZeile = "";
            for (int iHor = 1; iHor <= iZahl; iHor++) {
                if (iHor == 1) {sZeile = sZeile + iVert;}
                else {sZeile = sZeile + (iVert * iHor);}
                sZeile = sZeile + " ";
            }
            System.out.println(sZeile);
        }
    }
}
