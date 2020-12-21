package JunitBasics;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvSource1
{
        @ParameterizedTest
        @CsvSource({"Let,Me,in"})
        public void printStrings(ArgumentsAccessor acs)
        {
                System.out.println(acs.get(0));
                System.out.println(acs.get(1));
                System.out.println(acs.get(2));
        }


        @ParameterizedTest
        @CsvFileSource(resources ="/AccountLoginDetails.csv",numLinesToSkip = 1)
        public void printStringsFile(ArgumentsAccessor acs, ArgumentsAccessor tcs)
        {
                System.out.println(acs.get(0));
                System.out.println(tcs.get(1));
        }

}
