package com.galaxy.venus.io.bio.server;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SendHandler implements Runnable {

    private Socket socket;
    public SendHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String info = scanner.nextLine();
            try {
                socket.getOutputStream().write(info.getBytes("UTF-8"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
