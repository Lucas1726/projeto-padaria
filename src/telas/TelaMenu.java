package telas;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
        initComponents();
    }

    public TelaMenu(String usuario, String cargo) {
        // vai receber o nome do usuário e o cargo
        initComponents();
        //torno o painel invisivel
        pnlCadastrarProdutos.setVisible(false);
        // irá mostar uma mesangem de saudação para o usuário
        lblSaudacao.setText("Bem vindo(a), " + usuario);
        btnExcluir.setVisible(false);

        //se o cargo for CAIXA irá ficar desabilitado tais comandos
        if (cargo.equalsIgnoreCase("caixa") || cargo.equalsIgnoreCase("balconista")) {
            chavear();
        }
    }

    // não irá me dar nada em troca, só ira fazer 
    //private = para essa class ser chamada só da TelaMenu
    private void chavear() {

        itmCadastrarProdutos.setEnabled(false);
        itmAlterarProdutos.setEnabled(false);
        itmExcluirProdutos.setEnabled(false);
        itmRelatoriosProdutos.setEnabled(true);

        itmCadastrarFuncionarios.setEnabled(false);
        itmAlterarFuncionarios.setEnabled(false);
        itmExcluirFuncionarios.setEnabled(false);
        itmRelatoriosFuncionarios.setEnabled(false);

    }

    public TelaMenu(String cargo) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jSeparator1 = new javax.swing.JSeparator();
        lblSaudacao = new javax.swing.JLabel();
        pnlCadastrarProdutos = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnOutrosRelatorios = new javax.swing.JButton();
        barMenu = new javax.swing.JMenuBar();
        mnuProdutos = new javax.swing.JMenu();
        itmCadastrarProdutos = new javax.swing.JMenuItem();
        itmAlterarProdutos = new javax.swing.JMenuItem();
        itmExcluirProdutos = new javax.swing.JMenuItem();
        itmRelatoriosProdutos = new javax.swing.JMenuItem();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFuncionarios = new javax.swing.JMenuItem();
        itmAlterarFuncionarios = new javax.swing.JMenuItem();
        itmExcluirFuncionarios = new javax.swing.JMenuItem();
        itmRelatoriosFuncionarios = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setTitle("Menu Inicial");
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(280, 100, 0, 3);

        lblSaudacao.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(270, 10, 140, 30);

        pnlCadastrarProdutos.setLayout(null);

        lblCodigo.setText("Código:");
        pnlCadastrarProdutos.add(lblCodigo);
        lblCodigo.setBounds(20, 30, 40, 40);
        pnlCadastrarProdutos.add(txtCodigo);
        txtCodigo.setBounds(100, 40, 190, 22);

        lblNome.setText("Nome:");
        pnlCadastrarProdutos.add(lblNome);
        lblNome.setBounds(20, 70, 40, 40);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(txtNome);
        txtNome.setBounds(100, 80, 190, 22);

        lblCategoria.setText("Categoria:");
        pnlCadastrarProdutos.add(lblCategoria);
        lblCategoria.setBounds(20, 110, 60, 40);

        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(txtCategoria);
        txtCategoria.setBounds(100, 120, 190, 22);

        lblPreco.setText("Preço:");
        pnlCadastrarProdutos.add(lblPreco);
        lblPreco.setBounds(20, 150, 50, 40);
        pnlCadastrarProdutos.add(txtPreco);
        txtPreco.setBounds(100, 160, 190, 22);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnSalvar);
        btnSalvar.setBounds(60, 230, 72, 22);

        btnConsultar.setText("Buscar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnConsultar);
        btnConsultar.setBounds(340, 40, 90, 22);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnExcluir);
        btnExcluir.setBounds(240, 230, 80, 20);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnAlterar);
        btnAlterar.setBounds(150, 230, 72, 22);

        btnOutrosRelatorios.setText("Outros Relatório");
        btnOutrosRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutrosRelatoriosActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnOutrosRelatorios);
        btnOutrosRelatorios.setBounds(340, 80, 120, 20);

        getContentPane().add(pnlCadastrarProdutos);
        pnlCadastrarProdutos.setBounds(0, 0, 610, 340);

        mnuProdutos.setMnemonic('P');
        mnuProdutos.setText("Produtos");

        itmCadastrarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarProdutos.setText("Cadastrar");
        itmCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmCadastrarProdutos);

        itmAlterarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarProdutos.setText("Alterar");
        itmAlterarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmAlterarProdutos);

        itmExcluirProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirProdutos.setText("Excluir");
        itmExcluirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmExcluirProdutos);

        itmRelatoriosProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatoriosProdutos.setText("Relatórios");
        itmRelatoriosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatoriosProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmRelatoriosProdutos);

        barMenu.add(mnuProdutos);

        mnuFuncionarios.setMnemonic('F');
        mnuFuncionarios.setText("Funciónarios");
        mnuFuncionarios.setToolTipText("");

        itmCadastrarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarFuncionarios.setText("Cadastrar");
        itmCadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmCadastrarFuncionarios);

        itmAlterarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarFuncionarios.setText("Alterar");
        mnuFuncionarios.add(itmAlterarFuncionarios);

        itmExcluirFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirFuncionarios.setText("Excluir");
        mnuFuncionarios.add(itmExcluirFuncionarios);

        itmRelatoriosFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatoriosFuncionarios.setText("Relatórios");
        mnuFuncionarios.add(itmRelatoriosFuncionarios);

        barMenu.add(mnuFuncionarios);

        setJMenuBar(barMenu);

        setSize(new java.awt.Dimension(622, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmCadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmCadastrarFuncionariosActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            // Comando para inserir dados no banco de dados
            Connection conexao; // criação de variavel | conexão com o BD
            PreparedStatement st; // comandos SQL
            //local do driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // aqui sim funcionará a conexão
            // caminho do banco de dados | nome do usuario | senha do bd
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "lucas990818");
            // inserindo as informações no BD
            st = conexao.prepareStatement("INSERT INTO produtos VALUES(?,?,?,?)");
            st.setString(1, txtCodigo.getText());
            st.setString(2, txtNome.getText());
            st.setString(3, txtCategoria.getText());
            st.setDouble(4, Double.parseDouble(txtPreco.getText())); // convertendo o preço q é string para double
            st.executeUpdate();
            //monstrar mensagem de sucesso
            JOptionPane.showMessageDialog(btnSalvar, "Produto salvo com sucesso");
            // limpar os campos
            txtCodigo.setText("");
            txtNome.setText("");
            txtCategoria.setText("");
            txtPreco.setText("");
            //cursor voltar para o código
            txtCodigo.requestFocus();
            btnExcluir.setVisible(false);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem o driver na biblioteca" + ex.getMessage());
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "Este código de produto já está cadastrado");
                txtCodigo.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Erro número " + ex.getErrorCode() + "\nEntre em contato com o administrador e informe o número do erro");
            }
        } // null pode ser colocado elemento de tela onde a mensagem irá aparecer
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void itmCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(true);
        btnConsultar.setVisible(false);
        btnAlterar.setVisible(false);
        btnExcluir.setVisible(false);
        btnOutrosRelatorios.setVisible(false);
    }//GEN-LAST:event_itmCadastrarProdutosActionPerformed

    private void itmRelatoriosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatoriosProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(false);
        btnConsultar.setVisible(true);
        btnAlterar.setVisible(false);
        btnExcluir.setVisible(false);
        btnOutrosRelatorios.setVisible(true);

    }//GEN-LAST:event_itmRelatoriosProdutosActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        //verificar se o campo usuario está vazio
        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha ocódigo do produto");
            txtCodigo.requestFocus();
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

            //Busca o código do produto na tabela do BD
            st = conexao.prepareStatement("SELECT * from produtos WHERE codigo=?");
            st.setString(1, txtCodigo.getText());
            rs = st.executeQuery(); //Executa o SELECT acima

            if (rs.next()) { //Se encontrou o usuário na tabela
                txtNome.setText(rs.getString("nome"));
                txtCategoria.setText(rs.getString("categoria"));
                txtPreco.setText(rs.getString("preco"));
                btnExcluir.setVisible(true);
                btnAlterar.setVisible(true);
            } else { //Se não encontrou o usuário
                JOptionPane.showMessageDialog(null, "Produto não encontrado");
                txtCodigo.requestFocus();
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(btnConsultar, "Você não tem o driver na biblioteca");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(btnConsultar, "Algum parâmetro do BD está incorreto");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        try {
            //CONECTAR COM O BANCO DE DADOS
            Connection conexao;
            PreparedStatement st;
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "lucas990818");
            // DELETAR O PRODUTO PELO CÓDIGO INFORMADO
            st = conexao.prepareStatement("DELETE FROM produtos WHERE codigo=?");
            st.setString(1, txtCodigo.getText());
            int res = st.executeUpdate();
            //VERIFICAR SE O PRODUTO FOI OU NÃO DELETADO E INFORMAR
            if (res == 1) { // Se excluiu da tabela
                JOptionPane.showMessageDialog(null, "Produto excluído com sucesso");
                txtCodigo.setText("");
                txtNome.setText("");
                txtCategoria.setText("");
                txtPreco.setText("");
                txtCodigo.requestFocus();
                btnExcluir.setVisible(false);
                btnAlterar.setVisible(false);
            } else { // Se não excluiu da tabela
                JOptionPane.showMessageDialog(null, "Não foi possível excluir o produto com este código");
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem o driver na biblioteca " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto" + ex.getMessage());
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void itmExcluirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(false);
        btnConsultar.setVisible(true);
        btnAlterar.setVisible(false);
        btnExcluir.setVisible(false);
        btnOutrosRelatorios.setVisible(false);
    }//GEN-LAST:event_itmExcluirProdutosActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        try {
            Connection conexao;
            PreparedStatement st;
            //Irá guardar as informações recebida pelo BD
            ResultSet rs;
            //Conexão com o BD
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "lucas990818");

            //alterando o produto na tabela do BD
            st = conexao.prepareStatement("UPDATE produtos SET nome=?, categoria=?, preco=? WHERE codigo=?");
            st.setString(1, txtNome.getText());
            st.setString(2, txtCategoria.getText());
            st.setString(3, txtPreco.getText());
            st.setString(4, txtCodigo.getText());
            st.executeUpdate(); //Executa o UPDATE acima
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
            txtCodigo.setText("");
            txtNome.setText("");
            txtCategoria.setText("");
            txtPreco.setText("");
            txtCodigo.requestFocus();
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(btnConsultar, "Você não tem o driver na biblioteca");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(btnConsultar, "Algum parâmetro do BD está incorreto");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void itmAlterarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(false);
        btnConsultar.setVisible(true);
        btnAlterar.setVisible(false);
        btnExcluir.setVisible(false);
        btnOutrosRelatorios.setVisible(false);
    }//GEN-LAST:event_itmAlterarProdutosActionPerformed

    private void btnOutrosRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutrosRelatoriosActionPerformed
        TelaRelatorios tela;
        tela = new TelaRelatorios();
        tela.setVisible(true);
    }//GEN-LAST:event_btnOutrosRelatoriosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnOutrosRelatorios;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JMenuItem itmAlterarFuncionarios;
    private javax.swing.JMenuItem itmAlterarProdutos;
    private javax.swing.JMenuItem itmCadastrarFuncionarios;
    private javax.swing.JMenuItem itmCadastrarProdutos;
    private javax.swing.JMenuItem itmExcluirFuncionarios;
    private javax.swing.JMenuItem itmExcluirProdutos;
    private javax.swing.JMenuItem itmRelatoriosFuncionarios;
    private javax.swing.JMenuItem itmRelatoriosProdutos;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuProdutos;
    private javax.swing.JPanel pnlCadastrarProdutos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
