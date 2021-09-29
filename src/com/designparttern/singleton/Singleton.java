
package com.designparttern.singleton;

/**
 * Creational Patterns: Singleton
 * What: A design patterns are well-proved solution for solving the specific problem/task
 * why: Singleton design pattern is the best solution for above specific problems( class only instance)
 *
 * */

public class Singleton {
    public static void main(String[] args) {
        Connection connection = Connection.getInstance();
        Connection connection2 = Connection.getInstance();
        System.out.println(connection+"----"+connection2);
    }
}
