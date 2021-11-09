import java.util.Scanner;

public class checklist {
    String[] toDoList = new String[100]; //Array mit zu erledigenden Aufgaben
    int actCount = -1; //Anzahl der sich im Array befindenden Elemente
    String chMode = "n"; //wechseln des Modus
    boolean ovwr = false; //Überschreiben des letzten Elements im Array
    String taskComplete = ""; //Eingabe welche Aufgaben als Erledigt markiert werden soll

    Scanner sc = new Scanner(System.in);

    //Eingaben von Aufgaben
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
                taskComplete = sc.nextLine();

            if (!taskComplete.equals("exit")) {
                toDoList[Integer.parseInt(taskComplete)] = "DONE -> " + toDoList[Integer.parseInt(taskComplete)];
            }

        } while (!taskComplete.equals("exit"));
    }
}
