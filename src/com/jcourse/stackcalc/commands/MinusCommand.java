package com.jcourse.stackcalc.commands;

import com.jcourse.stackcalc.Stack;

import java.util.Map;

/**
 * last - previos
 */
public class MinusCommand implements Command{
    @Override
    public String getName() {
        return "-";
    }

    @Override
    public void execute(String arg, Stack stack, Map<String, Double> environment) {
        Double a = stack.pop();
        Double b = stack.pop();
        stack.push(a-b);
    }
}
