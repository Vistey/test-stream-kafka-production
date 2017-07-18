package com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * MessageBuilder.withPayload(Pojo).build() 格式必须
 * stream会自动在传输实体类上增加head信息 便于客户端解析（二次封装）
 * content-type: application/json 以json形式发送数据
 */
@EnableBinding(TestOutput.class)
@Component
public class SendingBean {

  private TestOutput testOutput;

  @Autowired
  public SendingBean(TestOutput testOutput) {
    this.testOutput = testOutput;
  }

  void sayHello(Pojo pojo){
    System.out.println(MessageBuilder.withPayload(pojo).build());
    testOutput.testOutputHello().send(MessageBuilder.withPayload(pojo).build());
  }

}
