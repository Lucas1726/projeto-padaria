package telas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;  // dados do banco, senha, etc
import java.sql.SQLException; // verificar se o comando sql está certo ou não 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {


    public TelaCadastroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        txtRepitaSenha = new javax.swing.JTextField();
        lblCadastro = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        lblRepitaSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();

        jMenu1.setText("jMenu1");

        setTitle("Cadastro de usúario");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        txtRepitaSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRepitaSenha.setText("Repita novamente sua senha");
        getContentPane().add(txtRepitaSenha);
        txtRepitaSenha.setBounds(390, 230, 210, 30);

        lblCadastro.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblCadastro.setText("Cadastro");
        getContentPane().add(lblCadastro);
        lblCadastro.setBounds(370, 20, 150, 40);

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSalvar.setText("Cadastrar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarKeyPressed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(490, 380, 110, 40);

        lblUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblUsuario.setText("Usuário:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(260, 150, 60, 18);

        lblSenha.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(260, 190, 60, 18);

        lblCargo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblCargo.setText("Cargo:");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(260, 270, 60, 18);

        cmbCargo.setBackground(new java.awt.Color(153, 153, 153));
        cmbCargo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Caixa", "Balconista" }));
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(390, 270, 120, 30);

        lblRepitaSenha.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblRepitaSenha.setText("Repita a senha:");
        getContentPane().add(lblRepitaSenha);
        lblRepitaSenha.setBounds(260, 230, 100, 18);

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUsuario.setText("Digite seu nome");
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(390, 150, 210, 30);

        txtSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSenha.setText("Digite uma senha");
        getContentPane().add(txtSenha);
        txtSenha.setBounds(390, 190, 210, 30);

        setSize(new java.awt.Dimension(914, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try { 
            // Comando para inserir dados no banco de dados
            Connection conexao; // criação de variavel | conexão com o BD
            PreparedStatement st; // comandos SQL
            Class.forName("com.mysql.cj.jdbc.Driver"); //local do driver
            // aqui sim funcionará a conexão
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria","root","lucas990818");  // caminho do banco de dados | nome do usuario | senha do bd
            
            if (txtSenha.getText().equals(txtRepitaSenha.getText())) {
            // só irá salvar no banco de dados, se a SENHA for igual a REPITA SENHA
                
                st = conexao.prepareStatement("INSERT INTO usuario VALUES(?, ?, ?)"); // NÃO É UMA BOA PRATICAR COLOCAR ONDE IRÁ SALVAR OS DADOS
                st.setString(1, txtUsuario.getText()); // pegando as informações colocada na caixinha
                st.setString(2, txtSenha.getText());
                st.setString(3, cmbCargo.getSelectedItem().toString()); // vai pegar o valor e transformar em string
                st.executeUpdate(); //Executa o comando INSERT acima
                JOptionPane.showMessageDialog(null,"Dados salvos com sucesso");
                txtUsuario.setText(""); // limpa o ponto
                txtSenha.setText("");
                txtRepitaSenha.setText("");
                txtUsuario.requestFocus(); // volta o cusor para o usuario
            
            } else { // se colocarem senhas diferentes, irá aparecer a mensagem abaixo
                JOptionPane.showMessageDialog(null,"As senhas não coincidem");
                txtSenha.requestFocus();  // usuário coloca a senha novamente
            }
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Você não tem o driver na biblioteca");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Algum parâmetro do BD está incorreto");
        } // null pode ser colocado elemento de tela onde a mensagem irá aparecer
        
        
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarKeyPressed


    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblRepitaSenha;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtRepitaSenha;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
