import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        var menu = "1-Cadastrar\n2-Listar\n3-Atualizar\n4-Apagar\n0-Sair\n";
        int op = 0;
        do{
          op = Integer.parseInt(
            JOptionPane.showInputDialog(menu)
          );
          switch(op){
            case 1:{
              var nome = JOptionPane.showInputDialog("Nome?");
              var fone = JOptionPane.showInputDialog("Fone?");
              var email = JOptionPane.showInputDialog("E-mail?");
              var p = new Pessoa(0, nome, fone, email);
              var dao = new PessoaDAO();
              dao.cadastrar(p);
              JOptionPane.showMessageDialog(null,"Cadastro OK!");
              break;
            }
            case 2:{
              var pessoas = new PessoaDAO().listar();
              JOptionPane.showMessageDialog(null, pessoas);
              break;
            }
            case 3:{
              //capturar codigo, nome fone e e-mail
              //atualizar nome, fone e e-mail pessoa cujo codigo foi especificado
              int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código da pessoa?"));
              String nome = JOptionPane.showInputDialog("Novo nome?");
              String fone = JOptionPane.showInputDialog("Novo fone?");
              String email = JOptionPane.showInputDialog("Novo email?");
              
              Pessoa p = new Pessoa();
              p.setNome(nome);
              p.setFone(fone);
              p.setEmail(email);
              p.setCodigo(codigo);
              
              PessoaDAO dao = new PessoaDAO();
              dao.atualizar(p);
              JOptionPane.showMessageDialog(null, "Pessoa atualizada com sucesso!");
              break;
            }
            case 4: {
              var codigo = Integer.parseInt(
                JOptionPane.showInputDialog("Código?")
              );
              var p = new Pessoa(codigo);
              var dao = new PessoaDAO();
              dao.apagar(p);
              JOptionPane.showMessageDialog(null, "Apagou!");
              break;
            }
            case 5:{
              //capturar uma letra
              //listar todas as pessoas cujo nome começa com essa letra
            }
            case 0:{
              JOptionPane.showMessageDialog(null, "Até!");
            }            
          }
        }while(op != 0);
      }
}
