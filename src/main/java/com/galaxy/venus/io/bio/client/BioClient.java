package com.galaxy.venus.io.bio.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class BioClient {
    private static final int DEFAULT_PORT = 7777;
    private static final String DEFAULT_IP = "127.0.0.1";

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(DEFAULT_IP,DEFAULT_PORT);
        OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String info = scanner.nextLine();
            socket.getOutputStream().write(info.getBytes("UTF-8"));
        }
    }
}
