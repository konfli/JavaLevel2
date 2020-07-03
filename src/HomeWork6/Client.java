package HomeWork6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String SERVER_ADR = "localhost";
    private static final int SERVER_PORT = 1111;

    public static void main(String[] args) {

        Socket socket = null;

        try {
            socket = new Socket(SERVER_ADR, SERVER_PORT);
            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String msg = in.nextLine();
                        System.out.println("Сервер: " + msg);
                    }
                }
            }).start();

            while (true) {
                System.out.println("Клиент: напишите ваше сообщение...");
                String msg = sc.nextLine();
                out.println(msg);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}