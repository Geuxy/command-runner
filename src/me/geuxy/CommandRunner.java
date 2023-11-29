package me.geuxy;

public class CommandRunner {

    private CommandOutput output;

    public CommandRunner(String command) {
        this.output = new CommandOutput(ConsoleUtil.getCommandOutput(command));
    }

    public CommandOutput getOutput() {
        return output;
    }

}
