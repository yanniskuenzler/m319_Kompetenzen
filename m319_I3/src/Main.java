import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        checklist cl = new checklist();

        System.out.println("Willkommen zur ToDo-Liste von Yannis Künzler!\n\nMan kann hier seine Tasks, die man erledigen möchte eintragen und dann, im Erledigen-Modus als erledigt markieren. Um den Modus zu wechseln einfach Enter ohne eine Eingabe drücken.");

        //Eingabe von Aufgaben, die zu lösen sind
        cl.insert();

        System.out.println("Erledigen Sie nun Ihre Aufgaben. Immer wenn Sie etwas gemacht haben, geben Sie die Nummer der Aufgabe ein.\nWenn Sie alles gemacht haben oder einfach nur das Programm beenden wollen, schreiben Sie -1 und bestätigen Sie mit Enter.\n\nWICHTIG: Wenn das Programm einmal beendet wurde lässt es sich nicht wieder starten und die Daten sind verloren.");

        //Erledigen der Aufgaben

        cl.done();


    }
}
