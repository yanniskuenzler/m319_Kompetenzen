import java.util.Scanner;

public class checklist {
    String[] toDoList = new String[100]; //Array mit zu erledigenden Aufgaben
    int actCount = -1; //Anzahl der sich im Array befindenden Elemente
    String chMode = "n"; //wechseln des Modus
    boolean ovwr = false; //Überschreiben des letzten Elements im Array
    int taskComplete = 0; //Eingabe welche Aufgaben als Erledigt markiert werden soll

    Scanner sc = new Scanner(System.in);
    Input in = new Input();

    /***
     *
     */
    public void insert() {
        do {
            if (ovwr == false) {
                actCount++;
            }

            ovwr = false;
            toDoList[actCount] = sc.nextLine();

            if (toDoList[actCount].equals("")) {
                do {
                    System.out.println("Wollen Sie in den Erledigen-Modus gehen, um Ihre Aufgaben zu erledigen [y] oder wollen Sie weitere Tasks eingeben [n]?");
                    chMode = sc.nextLine();
                } while ((!chMode.equals("y"))&&(!chMode.equals("n")));
                ovwr = true;
            } else {
                toDoList[actCount] = Integer.toString(actCount) + ": " + toDoList[actCount];
            }
        } while ((chMode.equals("n")) && (actCount < 100));

    }

    //Erledigen von Aufgaben
    public void done() {
        do {
            for (int i = 0; i <= actCount; i++) {
                System.out.println(toDoList[i]);
            }

            do {
                taskComplete = Input.inputInt("Welche Aufgabe haben Sie erledigt?");
            } while ((taskComplete < -1)||(taskComplete > actCount));

            if (taskComplete != -1) {
                toDoList[taskComplete] = "DONE -> " + toDoList[taskComplete];
            }

        } while (taskComplete != -1);
    }
}
