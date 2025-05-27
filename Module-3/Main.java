package com.greetings;

import com.utils.Utility;

public class Main {
    public static void main(String[] args) {
        Utility.greet("World");
    }
}
package com.utils;

public class Utility {
    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }
}

