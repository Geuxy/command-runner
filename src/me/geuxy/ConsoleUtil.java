package me.geuxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleUtil {

    public static String getCommandOutput(String exec) {
        String result = "";

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(exec).getInputStream()));

            String input;
            while ((input = reader.readLine()) != null) {
                result += "\n" + input;
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.err.print("Failed to execute command '" + exec + "': " + e.getCause());
        }
        return result;
    }

}
