package me.geuxy;

import java.util.ArrayList;
import java.util.Arrays;

public class CommandOutput {

    private final String output;

    public CommandOutput(String output) {
        this.output = output;
    }

    public String toString() {
        return output;
    }

    public String[] toArray() {
        return output.split("\n");
    }

    public ArrayList<String> toList() {
        return new ArrayList<>(Arrays.asList(toArray()));
    }

    public String getLineThatContains(String text) {
        return Arrays.stream(toArray()).filter(line -> line.contains(text)).findFirst().orElse(null);
    }

    public boolean contains(String text) {
        return output.contains(text);
    }

}
