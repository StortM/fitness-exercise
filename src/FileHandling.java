import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {
    public FileHandling() {
    }

    private ArrayList<Person> readPersonFile(){
        ArrayList<Person> personArrayList = new ArrayList<>();

        try{
            File file = new File("src/persons.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()){
                String name = sc.next();
                String cpr = sc.next();

                personArrayList.add(new Person(name,cpr));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return personArrayList;
    }

    public ArrayList<Person> getPeopleFromFile(){
        return readPersonFile();
    }
}
