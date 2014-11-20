package pt.teste;

import pt.entities.ClientesEntity;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@WebService(portName = "WSTestPort",serviceName = "wsteste",endpointInterface = "pt.teste.WSTeste")
public class WSTesteImp implements WSTeste {
  @PersistenceContext(name = "persistenceUnit")
  private EntityManager entityManager;

  @Override
  public String getTeste(){
    List<ClientesEntity> lista = entityManager.createQuery(ClientesEntity.CONSULTA_CLIENTES).getResultList();

    String retorno = "";

    for(ClientesEntity clientesEntity:lista){
        retorno+= clientesEntity.getNome()+";";
    }

    return retorno;
  }
}
