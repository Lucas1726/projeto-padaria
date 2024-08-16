package telas;

//Guardar na memória a conexão com o banco de Dados
import java.sql.Connection;

//Guardar na memória e executar comando SQL (INSERT, SELECT, UPDATE..)
import java.sql.PreparedStatement;

//Informar o caminho do BD, nome do BD, usuário e senha
import java.sql.DriverManager;

//Tratar problemas causados pela informação incorreta de dados do BD 
//(nome do BD, senha, porta, usuário, nome da tabela)
import java.sql.SQLException;

//Guardar o que retorna do BD em uma consulta (SELECT)
import java.sql.ResultSet;

//Exibir caixas de diálogo (mensagens)
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        pswSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso ao sistema");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblUsuario.setText("Usúario:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(260, 150, 60, 50);

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(320, 160, 310, 30);

        lblSenha.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(260, 210, 60, 40);

        pswSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pswSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(pswSenha);
        pswSenha.setBounds(320, 220, 310, 30);

        btnEntrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(490, 340, 140, 40);

        btnCadastrar.setBackground(new java.awt.Color(0, 51, 255));
        btnCadastrar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 51, 255));
        btnCadastrar.setText("Cadastre-se");
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(270, 340, 140, 40);

        setSize(new java.awt.Dimension(914, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        TelaCadastroUsuario t; // reservando área da memória
        t = new TelaCadastroUsuario();  // gerando a tela e guardando na variável T
        t.setVisible(true); // tornando a tela visivel
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        //verificar se o campo usuario está vazio
        if (txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o nome do usuário");
            txtUsuario.requestFocus();
            return; //parar a execução nesta linha
        }
        //verificar se o campo senha está vazio
        if (pswSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha a senha");
            pswSenha.requestFocus();
            return; //parar a execução nesta linha
        }

        try {
            Connection conexao;
            PreparedStatement st;
            //Irá guardar as informações recebida pelo BD
            ResultSet rs;
            //Conexão com o BD
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "lucas990818");

            //Busca o usuario na tabela do BD
            st = conexao.prepareStatement("SELECT * from usuario WHERE usuario=? AND senha=?");
            st.setString(1, txtUsuario.getText());
            st.setString(2, pswSenha.getText());
            rs = st.executeQuery(); //Executa o SELECT acima

            if (rs.next()) { //Se encontrou o usuário na tabela
                txtUsuario.setText("");
                pswSenha.setText("");
                TelaMenu tela;
                // estou chamando o construtor da tela menu | e estou passando o nome do usuario e o cargo da tabela do banco de dados
                // pegue de dentro da variavel o resultado como string "usuario" e/ou "cargo"
                tela = new TelaMenu(rs.getString("usuario"),rs.getString("cargo"));
                tela.setVisible(true);
            } else { //Se não encontrou o usuário
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido");
                txtUsuario.requestFocus();
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(btnEntrar, "Você não tem o driver na biblioteca");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(btnEntrar, "Algum parâmetro do BD está incorreto");
        }

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnEntrar.requestFocus(); //Método que tienes que crearte
        }
    }//GEN-LAST:event_btnEntrarKeyPressed

    private void pswSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswSenhaKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnEntrar.doClick();
        }
    }//GEN-LAST:event_pswSenhaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
