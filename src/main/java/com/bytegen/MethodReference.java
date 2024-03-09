package com.bytegen;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * @class MethodReference
 * @description This class used to create instance in method reference tutorial.
 *
 * @author Sachith Ariyathilaka
 * @version 1.0.0
 * @date 2024/03/09
 *
 */
public class MethodReference {

    /**
     * @constructor MethodReference
     * @description This is the default constructor of MethodReference class without any arguments.
     *
     */
    public MethodReference() {
    }

    /**
     * @constructor MethodReference
     * @description This is the argument constructor of MethodReference class with one argument.
     *
     * @param brand string value
     *
     */
    public MethodReference(String brand) {
        StringUtils.capitalize(brand);
    }

    /**
     * @method instanceMethodReference
     * @description This method used to handle the instance method reference.
     *
     * @param brand string value
     */
    public void instanceMethodReference(String brand) {
        StringUtils.capitalize(brand);
    }
}
