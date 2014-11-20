package pt.teste;

import javax.jws.WebService;

@WebService(portName = "WSTestPort",serviceName = "wsteste")
public interface WSTeste {
  String getTeste();
}
