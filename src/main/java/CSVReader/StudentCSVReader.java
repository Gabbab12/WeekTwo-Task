package CSVReader;
import org.example.Student;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentCSVReader {
        public static void main(String[] args) throws IOException {

            ArrayList<Student> studentList= new ArrayList<>();

            BufferedReader br = new BufferedReader(new FileReader("/Users/decagon/Desktop/Decagon Assignment/Week two/WeekTwoTask/Wk2/Student.csv"));
            String line = "";

            while ((line = br.readLine()) != null) {
                //System.out.println(line +");
                String[] data = new String[9];
                String[] data1 = line.split(",");
                System.out.println(data1[5]);



                for (int i = 0; i < data1.length; i++) {
                    data[i] = data1[i];

                    if (data[i].isEmpty()){
                        data[i] = "Null";
                    }
//                    System.out.println(data1[i]);
                }


              Student student = new Student();
                student.setStudentID(data[0]);
                student.setEmail(data[1]);
                student.setFirstName(data[2]);
                student.setLastName(data[3]);
                student.setGradeLevel(data[4]);
                student.setGuardianEmail1(data[5]);
                student.setGuardianEmail2(data[6]);
                student.setIsArchived(data[7]);
                student.setIsDeleted(data[8]);



            }

        }

}