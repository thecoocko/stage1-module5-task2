package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {
    /**
     * Implement a program which have your own functional interface according code below
     *
     * @FunctionalInterface
     * public interface Operation<T> {
     *     List<T> apply(List<T> arg);
     * }
     * Implement a class InterfaceCreator with one method Operation<Integer>
     *     divideBy(Integer divider).
     *     This method return your functional interface with
     *     logic where creates new list with values from the first list divided on divider of method.*/
    public Operation<Integer> divideBy(Integer divider) {
        return (List<Integer> args)->{
            List<Integer> result = new ArrayList<>();
            for(int i: args){
                result.add(i/divider);
            }
            return result;
        };
    }
}
