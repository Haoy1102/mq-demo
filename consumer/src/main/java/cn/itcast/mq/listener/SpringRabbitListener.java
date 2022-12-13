package cn.itcast.mq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author haoy
 * @description
 * @date 2022/12/13 11:13
 */
@Component
public class SpringRabbitListener {
    @RabbitListener(queues="simple.queue")
    public void lisenSimpleQueue(String msg){
        System.out.println("消费者接受:{"+msg+"}");
    }

    @RabbitListener(queues = "fanout.queue1")
    public void listenFanoutQueue1(String msg) {
        System.out.println("消费者1接收到Fanout消息：【" + msg + "】");
    }

    @RabbitListener(queues = "fanout.queue2")
    public void listenFanoutQueue2(String msg) {
        System.out.println("消费者2接收到Fanout消息：【" + msg + "】");
    }
}
