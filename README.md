# command-runner
Running commands in java made easy

# Example code
```java
package me.geuxy;

import me.geuxy.CommandRunner;

public class TestLol {

    public static void main(String[] args) {
        String os = System.getProperty("os.name");

        if(!os.toLowerCase().contains("linux")) {
            System.out.println(os + " does not support this application!");
            return;
        }

        CommandRunner runner = new CommandRunner("cat /etc/os-release");
        String distribution = runner.getOutput().getLineThatContains("NAME=")
                .replace("NAME=", "")
                .replace("\"", "");

        System.out.println("You are running " + distribution + "!");
    }

}
```
