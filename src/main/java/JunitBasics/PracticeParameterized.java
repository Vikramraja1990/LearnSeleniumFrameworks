package JunitBasics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import org.junit.runners.Parameterized;


public class PracticeParameterized {
    @BeforeAll
    public static void intro()
    {
        System.out.println("The Game is about to begin");
    }


    @ParameterizedTest
    @ValueSource(strings ={"Let","The","Game","Begins"})
    public void content(String strings)
    {
        System.out.print(strings);
    }

@AfterAll
public static void extro()
{
    System.out.println("The Game Over");
}
}
