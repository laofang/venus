package com.galaxy.venus.io.bio.server;

import lombok.Data;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
@Data
public class ReceiveHandler implements Runnable {

    private Socket socket;

    public ReceiveHandler(Socket socket) {
        super();
        this.socket = socket;
    }

    @Override
    public void run() {
        try (InputStream is = socket.getInputStream()) {
            byte[] b = new byte[1024];
            while (true) {
                int data = is.read(b);
                if (data != -1) {
                    String info = new String(b, 0, data, "UTF-8");
                    System.out.println(info);
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
