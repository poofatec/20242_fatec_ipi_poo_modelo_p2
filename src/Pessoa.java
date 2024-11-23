public class Pessoa {
  private int codigo = 0;
  private String nome, fone, email;

  public Pessoa(){

  }

  public Pessoa(int codigo){
    this.codigo = codigo;
  }

  public Pessoa(int codigo, String nome, String fone, String email){
    this.codigo = codigo;
    this.nome = nome;
    this.fone = fone;
    this.email = email;
  }

  public int getCodigo() {
    return codigo;
  }

  public String getEmail() {
    return email;
  }

  public String getFone() {
    return fone;
  }

  public String getNome() {
    return nome;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setFone(String fone) {
    this.fone = fone;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return String.format(
      "nome: %s, fone: %s, email: %s",
      nome, fone, email
    );
  }


}
