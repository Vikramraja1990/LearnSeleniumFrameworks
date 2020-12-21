package JunitBasics;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CsvFileSourceTest
{
    @ParameterizedTest
    @CsvFileSource(resources ="/AccountLoginDetails.csv",numLinesToSkip = 1)
    void csvTestString2(String FirstName, String LastName)
    {
        System.out.println(FirstName+""+LastName);
    }

    @ParameterizedTest
    @CsvFileSource(resources ="/drivers/RegistrationAccountLoginDetails.csv",numLinesToSkip = 1)
    public static String csvTestEmail(String email)
    {
        System.out.println();
        return email;
    }
}
