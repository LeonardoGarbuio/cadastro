package cadastro;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        conexaoDAO c1 = new conexaoDAO();

     
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String cpf = JOptionPane.showInputDialog("Digite seu CPF:");
        String email = JOptionPane.showInputDialog("Digite seu email:");
        String telefone = JOptionPane.showInputDialog("Digite seu telefone:");
        String dataNasc = JOptionPane.showInputDialog("Digite sua data de nascimento:");
        String ano = JOptionPane.showInputDialog("digite o ano em que esta:");
      
        Usuario u1 = new Usuario();
        u1.setNome(nome);
        u1.setCpf(cpf);
        u1.setEmail(email);
        u1.setTelefone(telefone);
        u1.setDataNasc(dataNasc);
        u1.setAno(ano);
   
        
        c1.save(u1);
        
        int AnosDvida = Integer.parseInt(u1.getAno()) - Integer.parseInt(u1.getDataNasc());
        
        JOptionPane.showMessageDialog(null, AnosDvida);

    }
}
