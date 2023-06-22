package CSVReader;

import org.example.Teacher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TeacherCSVReader {
    public static void main(String[] args) throws IOException {

    ArrayList<Teacher> teacherList= new ArrayList<>();

                BufferedReader br = new BufferedReader(new FileReader("/Users/decagon/Desktop/Decagon Assignment/Week two/WeekTwoTask/Wk2/src/main/java/DataFile/Teachers.csv"));
                String line = "";

                while ((line = br.readLine()) != null) {
                    String[] data = new String[6];

                    String[] data1 = line.split(",");
                    System.out.println(data1[3]);


                    for (int i = 0; i < data1.length; i++) {
                       data[i] = data1[i];
                    }
                        Teacher teacher = new Teacher();
                        teacher.setTeacherID(data[0]);
                        teacher.setFirstName(data[1]);
                        teacher.setLastName(data[2]);
                        teacher.setEmail(data[3]);
                        teacher.setGradeLevel(data[4]);
                    }

                }

        }



