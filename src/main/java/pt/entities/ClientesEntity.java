package pt.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "CLIENTES", schema = "BDA_1010136", catalog = "")
public class ClientesEntity {
  public static String CONSULTA_CLIENTES = "select c from ClientesEntity c";

  @Id
  @Column(name = "ID_CLIENTES", nullable = false, insertable = true, updatable = true, precision = 0)
  private long idClientes;

  @Column(name = "CONTRIBUINTE", nullable = false, insertable = true, updatable = true, precision = -127)
  private BigDecimal contribuinte;

  @Column(name = "NOME", nullable = false, insertable = true, updatable = true, length = 150)
  private String nome;

  @Column(name = "ROLE", nullable = false, insertable = true, updatable = true, precision = -127)
  private BigDecimal role;

  @Column(name = "MORADA", nullable = false, insertable = true, updatable = true, length = 200)
  private String morada;

  @Id
  @Column(name = "ID_CLIENTES", nullable = false, insertable = true, updatable = true, precision = 0)
  public long getIdClientes() {
    return idClientes;
  }

  public void setIdClientes(long idClientes) {
    this.idClientes = idClientes;
  }

  @Basic
  @Column(name = "CONTRIBUINTE", nullable = false, insertable = true, updatable = true, precision = -127)
  public BigDecimal getContribuinte() {
    return contribuinte;
  }

  public void setContribuinte(BigDecimal contribuinte) {
    this.contribuinte = contribuinte;
  }

  @Basic
  @Column(name = "NOME", nullable = false, insertable = true, updatable = true, length = 150)
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Basic
  @Column(name = "ROLE", nullable = false, insertable = true, updatable = true, precision = -127)
  public BigDecimal getRole() {
    return role;
  }

  public void setRole(BigDecimal role) {
    this.role = role;
  }

  @Basic
  @Column(name = "MORADA", nullable = false, insertable = true, updatable = true, length = 200)
  public String getMorada() {
    return morada;
  }

  public void setMorada(String morada) {
    this.morada = morada;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    ClientesEntity that = (ClientesEntity) o;

    if (idClientes != that.idClientes) {
      return false;
    }
    if (contribuinte != null ? !contribuinte.equals(that.contribuinte) : that.contribuinte != null) {
      return false;
    }
    if (morada != null ? !morada.equals(that.morada) : that.morada != null) {
      return false;
    }
    if (nome != null ? !nome.equals(that.nome) : that.nome != null) {
      return false;
    }
    if (role != null ? !role.equals(that.role) : that.role != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = (int) (idClientes ^ (idClientes >>> 32));
    result = 31 * result + (contribuinte != null ? contribuinte.hashCode() : 0);
    result = 31 * result + (nome != null ? nome.hashCode() : 0);
    result = 31 * result + (role != null ? role.hashCode() : 0);
    result = 31 * result + (morada != null ? morada.hashCode() : 0);
    return result;
  }
}
