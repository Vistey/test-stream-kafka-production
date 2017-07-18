package com.kafka;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * MessageChannel 调用通道发送数据
 * 参照
 * org.springframework.cloud.stream.messaging.Sink
 * org.springframework.cloud.stream.messaging.Source
 */
@Component
public interface TestOutput {

  String output = "testOutputString";

  @Output(TestOutput.output)
  MessageChannel testOutputHello();
}
