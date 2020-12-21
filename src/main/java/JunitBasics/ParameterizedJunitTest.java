package JunitBasics;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertTrue;

public class ParameterizedJunitTest
{
     @ParameterizedTest
     @ValueSource(ints = {1,2,3} )
     void test_int_arrays(int arg){assertTrue(arg > 1);}

     @ParameterizedTest
     @ValueSource(ints = {1,2,3} )
     void test_int_Strings(String arg){assertTrue(arg.length() > 0);}
}
