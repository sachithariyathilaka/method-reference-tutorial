package io.github.sachithariyathilaka;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * This class used to create instance in method reference tutorial.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/03/09
 */
public class MethodReference {

    /**
     * This is the default constructor of MethodReference class without any arguments.
     */
    public MethodReference() {
    }

    /**
     * This is the argument constructor of MethodReference class with one argument.
     *
     * @param   brand string value
     */
    public MethodReference(String brand) {
        StringUtils.capitalize(brand);
    }

    /**
     * This method used to handle the instance method reference.
     *
     * @param   brand string value
     */
    public void instanceMethodReference(String brand) {
        StringUtils.capitalize(brand);
    }
}
