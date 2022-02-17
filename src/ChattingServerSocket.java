import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class ChattingServerSocket {
    ServerSocket serverSocket;
    List<UserList> list;

    public ChattingServerSocket() {
        try {
            serverSocket = new ServerSocket(2000);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("연결 성공");
                UserList ul = new UserList(socket);
                list.add(ul);
                System.out.println("접속 인원 수 : " + list.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    class UserList implements Runnable {
        Socket socket;
        BufferedReader reader;
        BufferedWriter writer;
        String username;
        boolean isLogin = true;

        public UserList(Socket socket) {
            this.socket = socket;

            try { // 소켓 하나에 BR, BW들
                writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                username = reader.readLine();
                isLogin = true;
            } catch (Exception e) {
                isLogin = false;
                System.out.println("username을 받지 못 했습니다.");
            }

            try {
                String inputData = reader.readLine();
                System.out.println(username + ":" + inputData);

                for (UserList ul : list) {
                    if (ul != this) {
                        ul.writer.write(username + ":" + inputData + "\n");
                        writer.flush();

                    }
                }
            } catch (Exception e) {
                System.out.println("통신 실패 : " + e.getMessage());
                try {
                    list.remove(this); // 리스트 지우기
                    reader.close();
                    writer.close();
                    socket.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
        }

    }

    public static void main(String[] args) {
        new ChattingServerSocket();
    }
}
