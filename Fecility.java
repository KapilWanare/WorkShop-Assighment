package Assignment.Hospital_Managment_System;
import java.util.*;
public class Fecility {
        String fec_name;
        void add_feci()
        {
            Scanner input = new Scanner(System.in);
            System.out.print("fecility:-");
            fec_name = input.nextLine();
        }
        void show_feci()
        {
            System.out.println(fec_name);
        }
    }

