package session7.homework7;

import java.time.LocalDate;

public class ChecksTodaysDate {

    public static void main(String[] args){
     isTodaySpecificDate();

    }

    public static void isTodaySpecificDate(){
        LocalDate todaysDate = LocalDate.now();
        LocalDate specificDate =LocalDate.of(2019,12,10);

        if(todaysDate.isEqual(specificDate)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
