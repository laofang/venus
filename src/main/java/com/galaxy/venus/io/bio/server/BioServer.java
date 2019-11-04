package com.galaxy.venus.io.bio.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class BioServer {

    private static final int DEFAULT_PORT = 7777;

    public static void main(String[] args) throws IOException {
        ServerSocket sst = new ServerSocket(DEFAULT_PORT);
        while (true) {
            Socket st = sst.accept();
            System.out.println("有新用户连接");
            new Thread(() -> {
                try {
                    InputStream is = st.getInputStream();
                    byte[] b = new byte[1024];
                    while(true) {
                        int data = is.read(b);
                        if(data != -1) {
                            String info = new String(b,0,data,"UTF-8");
                            System.out.println(info);
                        }
                        else{
                            break;
                        }
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
