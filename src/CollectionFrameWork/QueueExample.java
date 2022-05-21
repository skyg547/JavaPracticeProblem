package CollectionFrameWork;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messagesQueue = new LinkedList<>();

        messagesQueue.offer(new Message("sendMail", "홍길동"));
        messagesQueue.offer(new Message("sendSMS", "신억"));
        messagesQueue.offer(new Message("sendKatok", "제이슨"));


        while (!messagesQueue.isEmpty()) {
            Message message = messagesQueue.poll();
            switch (message.coomand) {
                case "sendMail":
                    System.out.println(message.to + "메일을 보내여");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "문자를 보내여");
                    break;
                case "sendKatok":
                    System.out.println(message.to + " 카톡을 보내여");
                    break;
            }

        }

    }

}
