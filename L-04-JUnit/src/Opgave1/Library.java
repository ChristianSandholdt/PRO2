package Opgave1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Library {

    private LocalDate calculatedDato;
    private LocalDate actualDate;
    private boolean adult;

    public Library(LocalDate calculatedDato, LocalDate actualDate, boolean adult) {
        this.calculatedDato = calculatedDato;
        this.actualDate = actualDate;
        this.adult = adult;
    }

    /*
Returns the amount of the fine according to the table above.
Pre: calculatedDate < actualDate
(calculatedDate is the expected return date and
actualDate is the day you actually return the book)
*/

    //Actualdate er dagen hvor man afleverer bogen og calculatedDate er den dag hvor den senest skulle være afleveret
    public int calculateFine(LocalDate calculatedDate, LocalDate actualDate, boolean adult){
        int fine = 0;
        int daysOver = (int )calculatedDate.until(actualDate, ChronoUnit.DAYS);
        if (daysOver >= 1 && daysOver <= 7){
            if (adult){
                fine = 20;
            } else fine = 10;
        }
        else if (daysOver >=8 && daysOver <= 14){
            if (adult){
                fine = 60;
            }else fine = 30;
        }
        else if (adult){
            fine = 90;
        } else fine = 45;


        return fine;
    }

}
