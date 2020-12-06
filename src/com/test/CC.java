package com.test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: learnning
 * @description:
 * @author: Lv
 * @create: 2020-09-30 18:50
 **/
public class CC {
    public static void main(String[] args) {
        File file = new File("index.html");
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(file, "rw");
            byte[] arr = new byte[(int) file.length()];
            raf.read(arr);
            Socket socket = new ServerSocket(8080).accept();
            socket.getOutputStream().write(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
