package com.romankushmiruk.gof.blinnov.behavioral.command;

public class BlockingCommand implements ICommand {
    private Receiver receiver;

    public BlockingCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action(CommandTypes.BLOCKING);
    }
}
