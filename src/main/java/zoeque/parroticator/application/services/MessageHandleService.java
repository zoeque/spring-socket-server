package zoeque.parroticator.application.services;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Service;
import zoeque.parroticator.application.services.standard.AbstractMessageHandleService;

@Service
@MessageEndpoint
public class MessageHandleService extends AbstractMessageHandleService {
  @Transformer(inputChannel = "inputChannel",
          outputChannel = "outputChannel")
  public byte[] handleMessage(byte[] fullMessage) {
    return super.handleMessage(fullMessage);
  }
}
