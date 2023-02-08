package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @Test // minimal output
    public void minimumOutput() {
        String testString = "A1:A1";
        String[] expected = {"A1"};
        String[] actual = Problem.cellsInRange(testString).toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }

    @Test // huge output
    public void hugeOutput() {
        String testString = "A1:R9";
        String[] expected = {"A1","A2","A3","A4","A5","A6","A7","A8","A9","B1","B2","B3","B4","B5","B6","B7","B8","B9",
                        "C1","C2","C3","C4","C5","C6","C7","C8","C9","D1","D2","D3","D4","D5","D6","D7","D8","D9",
                        "E1","E2","E3","E4","E5","E6","E7","E8","E9","F1","F2","F3","F4","F5","F6","F7","F8","F9",
                        "G1","G2","G3","G4","G5","G6","G7","G8","G9","H1","H2","H3","H4","H5","H6","H7","H8","H9",
                        "I1","I2","I3","I4","I5","I6","I7","I8","I9","J1","J2","J3","J4","J5","J6","J7","J8","J9",
                        "K1","K2","K3","K4","K5","K6","K7","K8","K9","L1","L2","L3","L4","L5","L6","L7","L8","L9",
                        "M1","M2","M3","M4","M5","M6","M7","M8","M9","N1","N2","N3","N4","N5","N6","N7","N8","N9",
                        "O1","O2","O3","O4","O5","O6","O7","O8","O9","P1","P2","P3","P4","P5","P6","P7","P8","P9",
                        "Q1","Q2","Q3","Q4","Q5","Q6","Q7","Q8","Q9","R1","R2","R3","R4","R5","R6","R7","R8","R9"
                        };
        String[] actual = Problem.cellsInRange(testString).toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }
}