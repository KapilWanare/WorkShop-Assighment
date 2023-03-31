package Assignment.Hospital_Managment_System;
import java.util.*;
public class Lab {
    String fecility;
        int lab_cost;
        void new_feci()
        {
            Scanner input = new Scanner(System.in);
            System.out.print("fecility:-");
            fecility = input.nextLine();
            System.out.print("cost:-");
            lab_cost = input.nextInt();
        }
        void feci_list()
        {
            System.out.println(fecility + "\t\t" + lab_cost);
        }
}
