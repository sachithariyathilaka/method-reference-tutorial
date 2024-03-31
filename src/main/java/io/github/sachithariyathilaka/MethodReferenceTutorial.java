package io.github.sachithariyathilaka;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * This is the main class for the method reference tutorial.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/03/09
 */
public class MethodReferenceTutorial {

    public static void main( String[] args ) {

        List<String> brands = Arrays.asList("honda", "audi", "toyota");
        MethodReferenceTutorial methodReferenceTutorial = new MethodReferenceTutorial();

        methodReferenceTutorial.staticMethodReference(brands);
        methodReferenceTutorial.instanceMethodReference(brands);
        methodReferenceTutorial.instanceMethodReferenceWithArbitraryObject(brands);
        methodReferenceTutorial.constructorMethodReference(brands);
    }

    /**
     * This method used to handle the with and without static method reference example.
     *
     * @param   brands list of strings
     */
    public void staticMethodReference(List<String> brands) {

        System.out.print("Without the static method reference: ");
        brands.forEach(brand -> StringUtils.capitalize(brand));
        displayBrands(brands);

        System.out.print("With the static method reference: ");
        brands.forEach(StringUtils::capitalize);
        displayBrands(brands);
    }

    /**
     * This method used to handle the with and without instance method reference example.
     *
     * @param   brands list of strings
     */
    public void instanceMethodReference(List<String> brands) {

        MethodReference methodReference = new MethodReference();

        System.out.print("Without the instance method reference: ");
        brands.forEach(brand -> methodReference.instanceMethodReference(brand));
        displayBrands(brands);

        System.out.print("With the instance method reference: ");
        brands.forEach(methodReference::instanceMethodReference);
        displayBrands(brands);
    }

    /**
     * This method used to handle the with and without instance method reference with an arbitrary object example.
     *
     * @param   brands list of strings
     */
    public void instanceMethodReferenceWithArbitraryObject(List<String> brands) {

        System.out.print("Without the instance method reference with arbitrary object: ");
        brands.stream().sorted((a,b) -> b.compareTo(a));
        displayBrands(brands);

        System.out.print("With the instance method reference with arbitrary object: ");
        brands.stream().sorted(String::compareTo);
        displayBrands(brands);
    }

    /**
     * This method used to handle the with and without constructor method reference example.
     *
     * @param   brands list of strings
     */
    public void constructorMethodReference(List<String> brands) {

        System.out.print("Without the constructor method reference: ");
        brands.forEach(brand -> new MethodReference(brand));
        displayBrands(brands);

        System.out.print("With the constructor method reference: ");
        brands.forEach(MethodReference::new);
        displayBrands(brands);
    }

    /**
     * This method used to print brands as strings to the console.
     *
     * @param   brands list of strings
     */
   private void displayBrands(List<String> brands) {

       for (String brand: brands)
           if (brands.indexOf(brand) != brands.size() -1)
               System.out.print(StringUtils.capitalize(brand) + ", ");
           else
               System.out.print(StringUtils.capitalize(brand));

       System.out.println();
   }
}
