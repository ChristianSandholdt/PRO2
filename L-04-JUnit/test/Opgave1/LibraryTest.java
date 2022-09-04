package Opgave1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void calculateFineForAdult1Day() {
        //Arrange
        Library l1 = new Library(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,11),true);
        //Act
        int actual = l1.calculateFine(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,11),true);
        //Assert
        assertEquals(20, actual);
    }
    @Test
    void calculateFineForAdult7Days(){
        //Arrange
        Library l1 = new Library(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,17),true);
        //Act
        int actual = l1.calculateFine(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,17),true);
        //Assert
        assertEquals(20, actual);
    }

    @Test
    void calculateFineForAdult8Days(){
        //Arrange
        Library l1 = new Library(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,18),true);
        //Act
        int actual = l1.calculateFine(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,18),true);
        //Assert
        assertEquals(60, actual);
    }

    @Test
    void calculateFineForAdult14Days(){
        //Arrange
        Library l1 = new Library(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,24),true);
        //Act
        int actual = l1.calculateFine(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,24),true);
        //Assert
        assertEquals(60, actual);
    }
    @Test
    void calculateFineForAdultOver14Days(){
        //Arrange
        Library l1 = new Library(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,25),true);
        //Act
        int actual = l1.calculateFine(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,25),true);
        //Assert
        assertEquals(90, actual);
    }

    @Test
    void calculateFineForChild1Day(){
        //Arrange
        Library l1 = new Library(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,11),false);
        //Act
        int actual = l1.calculateFine(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,11),false);
        //Assert
        assertEquals(10, actual);
    }
    @Test
    void calculateFineForChild7Days(){
        //Arrange
        Library l1 = new Library(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,17),false);
        //Act
        int actual = l1.calculateFine(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,17),false);
        //Assert
        assertEquals(10, actual);
    }

    @Test
    void calculateFineForChild8Days(){
        //Arrange
        Library l1 = new Library(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,18),false);
        //Act
        int actual = l1.calculateFine(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,18),false);
        //Assert
        assertEquals(30, actual);
    }

    @Test
    void calculateFineForChild14Days(){
        //Arrange
        Library l1 = new Library(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,24),false);
        //Act
        int actual = l1.calculateFine(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,24),false);
        //Assert
        assertEquals(30, actual);
    }

    @Test
    void calculateFineForChildOver14Days(){
        //Arrange
        Library l1 = new Library(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,25),false);
        //Act
        int actual = l1.calculateFine(LocalDate.of(2022,8,10),
                LocalDate.of(2022,8,25),false);
        //Assert
        assertEquals(45, actual);
    }
}