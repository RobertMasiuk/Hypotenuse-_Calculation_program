/*
This program calculates the hypotenuse
*/
package pythagoreantheorem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
/**
 * @author Robert Masiuk robert@masiuk.pl
 */
public class PythagoreanTheorem {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader data = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(data);
        
        double a, b, c;

        System.out.println("give first cathetus");
        a = Double.parseDouble(br.readLine());
        System.out.println("give second cathetus");
        b = Double.parseDouble(br.readLine());
        
        c = (pow(a, 2)) + (pow(b, 2));
        c = sqrt(c);
        System.out.println("Hypotenuse equals: " + c);
        }

}
