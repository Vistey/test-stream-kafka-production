package com.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TmpKafkaProductionApplicationTests {

  @Autowired
  private SendingBean sendingBean;

  /**
   * 这是一个kafka生产端，通道与topic名字相绑定
   *
   * 绑定属性使用格式spring.cloud.stream.bindings.<channelName>.<property>=<value>提供
   * <channelName>表示正在配置的通道的名称（例如Source的output）本例中是testOutputString
   * topic设置 <property> = destination: topicName
   */
  @Test
  public void contextLoads() {
    sendingBean.sayHello(new Pojo("大世界",6666));
    System.out.println("-------------------");
  }

}
