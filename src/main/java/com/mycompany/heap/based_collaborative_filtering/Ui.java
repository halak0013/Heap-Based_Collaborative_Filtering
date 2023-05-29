//Bismillahirrahmanirrahim
package com.mycompany.heap.based_collaborative_filtering;

import java.util.Random;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;

public class Ui extends javax.swing.JFrame {
    ZeroList<ZeroList<Integer>> tar_us_lst = new ZeroList<>();
    ZeroList<ZeroList<Integer>> main_us_lst = new ZeroList<>();
    ZeroList<ZeroList<String>> movie_lst = new ZeroList<>();

    ZeroList<ZeroList<String>> film_lst_combo = new ZeroList<>();

    public Ui() {
        initComponents();
        csvRead<Integer> csvInt = new csvRead<>();
        csvRead<String> csvString = new csvRead<>();

        csvInt.readFileInt("./data/target_user.csv", tar_us_lst);
        csvInt.readFileInt("./data/main_data.csv", main_us_lst);

        csvString.readFile("./data/movies.csv", movie_lst);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        csvInt.insert(tar_us_lst, 0, model);
        JCB_User_Select.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        JPN_TargetUser_Selected = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JCB_User_Select = new javax.swing.JComboBox<>();
        JL_X = new javax.swing.JLabel();
        JL_K = new javax.swing.JLabel();
        JB_Get_Selected_Recommendation = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JLS_Selected_Result = new javax.swing.JList<>();
        JSP_X_Selected_Value = new javax.swing.JSpinner();
        JSP_K_Selected_Value = new javax.swing.JSpinner();
        JPN_TargetUser_Insert = new javax.swing.JPanel();
        JCB_First_Movie = new javax.swing.JComboBox<>();
        JCB_Second_Movie = new javax.swing.JComboBox<>();
        JCB_Third_Movie = new javax.swing.JComboBox<>();
        JCB_Fourth_Movie = new javax.swing.JComboBox<>();
        JCB_Fifth_Movie = new javax.swing.JComboBox<>();
        JL_X1 = new javax.swing.JLabel();
        JL_K1 = new javax.swing.JLabel();
        JB_Get_Insert_Recommendation = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        JLS_Insert_Result = new javax.swing.JList<>();
        JS_1_MOVIE_VAL = new javax.swing.JSpinner();
        JS_2_MOVIE_VAL = new javax.swing.JSpinner();
        JS_3_MOVIE_VAL = new javax.swing.JSpinner();
        JS_4_MOVIE_VAL = new javax.swing.JSpinner();
        JS_5_MOVIE_VAL = new javax.swing.JSpinner();
        JSP_X_Insert_Value = new javax.swing.JSpinner();
        JSP_K_Insert_Value = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
        });

        JPN_TargetUser_Selected.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Target User:");
        JPN_TargetUser_Selected.add(jLabel1);
        jLabel1.setBounds(6, 27, 77, 17);

        JPN_TargetUser_Selected.add(JCB_User_Select);
        JCB_User_Select.setBounds(89, 24, 130, 23);

        JL_X.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JL_X.setText("X:");
        JPN_TargetUser_Selected.add(JL_X);
        JL_X.setBounds(10, 70, 23, 17);

        JL_K.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JL_K.setText("K:");
        JPN_TargetUser_Selected.add(JL_K);
        JL_K.setBounds(120, 70, 30, 17);

        JB_Get_Selected_Recommendation.setText("Get Recommendations");
        JB_Get_Selected_Recommendation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_Get_Selected_RecommendationMouseClicked(evt);
            }
        });
        JPN_TargetUser_Selected.add(JB_Get_Selected_Recommendation);
        JB_Get_Selected_Recommendation.setBounds(30, 110, 190, 23);

        jScrollPane3.setViewportView(JLS_Selected_Result);

        JPN_TargetUser_Selected.add(jScrollPane3);
        jScrollPane3.setBounds(262, 6, 317, 262);

        JSP_X_Selected_Value.setModel(new javax.swing.SpinnerNumberModel(5, 1, null, 1));
        JPN_TargetUser_Selected.add(JSP_X_Selected_Value);
        JSP_X_Selected_Value.setBounds(30, 70, 70, 23);

        JSP_K_Selected_Value.setModel(new javax.swing.SpinnerNumberModel(3, 1, null, 1));
        JPN_TargetUser_Selected.add(JSP_K_Selected_Value);
        JSP_K_Selected_Value.setBounds(150, 70, 70, 23);

        jTabbedPane1.addTab("Selected Part", JPN_TargetUser_Selected);

        JL_X1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JL_X1.setText("X:");

        JL_K1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JL_K1.setText("K:");

        JB_Get_Insert_Recommendation.setText("Get Recommendations");
        JB_Get_Insert_Recommendation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_Get_Insert_RecommendationMouseClicked(evt);
            }
        });

        jScrollPane4.setViewportView(JLS_Insert_Result);

        JS_1_MOVIE_VAL.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        JS_2_MOVIE_VAL.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        JS_3_MOVIE_VAL.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        JS_4_MOVIE_VAL.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        JS_5_MOVIE_VAL.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        JSP_X_Insert_Value.setModel(new javax.swing.SpinnerNumberModel(5, 1, null, 1));

        JSP_K_Insert_Value.setModel(new javax.swing.SpinnerNumberModel(3, 1, null, 1));

        javax.swing.GroupLayout JPN_TargetUser_InsertLayout = new javax.swing.GroupLayout(JPN_TargetUser_Insert);
        JPN_TargetUser_Insert.setLayout(JPN_TargetUser_InsertLayout);
        JPN_TargetUser_InsertLayout.setHorizontalGroup(
            JPN_TargetUser_InsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_TargetUser_InsertLayout.createSequentialGroup()
                .addGroup(JPN_TargetUser_InsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPN_TargetUser_InsertLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(JPN_TargetUser_InsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPN_TargetUser_InsertLayout.createSequentialGroup()
                                .addComponent(JCB_First_Movie, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JS_1_MOVIE_VAL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPN_TargetUser_InsertLayout.createSequentialGroup()
                                .addComponent(JCB_Second_Movie, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JS_2_MOVIE_VAL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPN_TargetUser_InsertLayout.createSequentialGroup()
                                .addComponent(JCB_Third_Movie, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JS_3_MOVIE_VAL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPN_TargetUser_InsertLayout.createSequentialGroup()
                                .addComponent(JCB_Fourth_Movie, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JS_4_MOVIE_VAL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPN_TargetUser_InsertLayout.createSequentialGroup()
                                .addComponent(JCB_Fifth_Movie, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JS_5_MOVIE_VAL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPN_TargetUser_InsertLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(JL_X1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(JSP_X_Insert_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPN_TargetUser_InsertLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(JL_K1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(JSP_K_Insert_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPN_TargetUser_InsertLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(JB_Get_Insert_Recommendation, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        JPN_TargetUser_InsertLayout.setVerticalGroup(
            JPN_TargetUser_InsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_TargetUser_InsertLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(JPN_TargetUser_InsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPN_TargetUser_InsertLayout.createSequentialGroup()
                        .addGroup(JPN_TargetUser_InsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCB_First_Movie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JS_1_MOVIE_VAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(JPN_TargetUser_InsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCB_Second_Movie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JS_2_MOVIE_VAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(JPN_TargetUser_InsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCB_Third_Movie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JS_3_MOVIE_VAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(JPN_TargetUser_InsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCB_Fourth_Movie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JS_4_MOVIE_VAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(JPN_TargetUser_InsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCB_Fifth_Movie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JS_5_MOVIE_VAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(JPN_TargetUser_InsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPN_TargetUser_InsertLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(JL_X1))
                            .addComponent(JSP_X_Insert_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(JPN_TargetUser_InsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPN_TargetUser_InsertLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(JL_K1))
                            .addComponent(JSP_K_Insert_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(JB_Get_Insert_Recommendation))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Insert Part", JPN_TargetUser_Insert);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Main_Part");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JB_Get_Selected_RecommendationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_Get_Selected_RecommendationMouseClicked
        MaxHeap2<Distance> user_reco = new MaxHeap2<>(Integer.parseInt(JSP_X_Selected_Value.getValue().toString()));

        CosSimilarity cs = new CosSimilarity();
        int sel_index = JCB_User_Select.getSelectedIndex();

        Node<ZeroList<Integer>> tmp_tar = tar_us_lst.root;
        for (int i = 0; i < sel_index; i++) {
            tmp_tar = tmp_tar.next;
        }
        Node<ZeroList<Integer>> tmp_main = main_us_lst.root;

        while (tmp_main != null) {
            user_reco.insert(new Distance(tmp_main.data, cs.calculateCosSim(tmp_tar.data, tmp_main.data)));
            tmp_main = tmp_main.next;
        }
        wriet_to_list(fillFilm(user_reco, Integer.parseInt(JSP_K_Selected_Value.getValue().toString())),
                JLS_Selected_Result);
    }//GEN-LAST:event_JB_Get_Selected_RecommendationMouseClicked

    private void JB_Get_Insert_RecommendationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_Get_Insert_RecommendationMouseClicked
        Node<ZeroList<String>> m_index = film_lst_combo.root;
        ZeroList<Integer> user_vector = new ZeroList<Integer>();

        int[] sellected_film_start = { Integer.parseInt(JS_1_MOVIE_VAL.getValue().toString()),
                Integer.parseInt(JS_2_MOVIE_VAL.getValue().toString()),
                Integer.parseInt(JS_3_MOVIE_VAL.getValue().toString()),
                Integer.parseInt(JS_4_MOVIE_VAL.getValue().toString()),
                Integer.parseInt(JS_5_MOVIE_VAL.getValue().toString()) };
        int[] sellected_film_index = { JCB_First_Movie.getSelectedIndex(),
                JCB_Second_Movie.getSelectedIndex(),
                JCB_Third_Movie.getSelectedIndex(),
                JCB_Fourth_Movie.getSelectedIndex(),
                JCB_Fifth_Movie.getSelectedIndex() };

        for (int i = 0; i < 5; i++) {
            Node<String> flm_nod = m_index.data.root;
            for (int j = 0; j < sellected_film_index[i]; j++) {
                flm_nod = flm_nod.next;
            }
            user_vector.insertFilm(sellected_film_start[i],flm_nod.film_index); // ⭐⭐⭐⭐⭐
            m_index = m_index.next;
        }

        MaxHeap2<Distance> user_reco = new MaxHeap2<>(Integer.parseInt(JSP_X_Insert_Value.getValue().toString()));

        CosSimilarity cs = new CosSimilarity();
        Node<ZeroList<Integer>> tmp_main = main_us_lst.root;

        while (tmp_main != null) {
            user_reco.insert(new Distance(tmp_main.data, cs.calculateCosSim(user_vector, tmp_main.data)));
            tmp_main = tmp_main.next;
        }
        wriet_to_list(fillFilm(user_reco, Integer.parseInt(JSP_K_Insert_Value.getValue().toString())),
                JLS_Insert_Result);
    }//GEN-LAST:event_JB_Get_Insert_RecommendationMouseClicked


    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTabbedPane1MousePressed
        Random r = new Random();
        //int ran = 0;
        int rr;
        Node<ZeroList<String>> mv_lst = movie_lst.root;
        ZeroList<String> films;
        for (int k = 0; k < 5; k++) {
            films = new ZeroList<>();
            for (int i = 0; i < 5; i++) {
                rr=r.nextInt(240);
                for (int j = 0; j < rr; j++) {
                    mv_lst = mv_lst.next;
                    //ran++;
                }
                Node<String> t = films.insert(mv_lst.data.root.next.data);
                t.film_index = Integer.parseInt(mv_lst.data.root.data);
                //ran += r.nextInt(20);
            }
            film_lst_combo.insert(films);
        }
        //System.out.println(ran);
        JComboBox[] vcm_arr = {
                JCB_First_Movie,
                JCB_Second_Movie,
                JCB_Third_Movie,
                JCB_Fourth_Movie,
                JCB_Fifth_Movie
        };
        Node<ZeroList<String>> t = film_lst_combo.root;
        for (int i = 0; i < vcm_arr.length; i++) {
            add_movie_in_combobox(t.data, vcm_arr[i]);
            t = t.next;
        }
    }// GEN-LAST:event_jTabbedPane1MousePressed

    private void add_movie_in_combobox(ZeroList<String> movies, JComboBox jcb) {
        Node<String> temp = movies.root;
        while (temp != null) {
            jcb.addItem(temp.data);
            temp = temp.next;
        }
    }

    private void wriet_to_list(ZeroList<Integer> zl, JList jls) {
        Node<Integer> idx_n = zl.root;
        Node<ZeroList<String>> table_i = movie_lst.root;

        DefaultListModel<String> dlm = new DefaultListModel<>();

        while (idx_n != null) {
            while (table_i != null) {
                int index_table = Integer.parseInt(table_i.data.root.data);
                if (idx_n.data == index_table) {
                    dlm.addElement(table_i.data.root.next.data);
                    break;
                }
                table_i = table_i.next;
            }
            table_i = movie_lst.root;
            idx_n = idx_n.next;
        }
        // reco.addEl(dlm);
        jls.setModel(dlm);

    }

    private ZeroList<Integer> fillFilm(MaxHeap2<Distance> user_reco, int k) {
        Node<Distance> usr_rc_n = user_reco.heap.root;
        ZeroList<Integer> result = new ZeroList<>();
        MaxHeap2<Distance> star_heap;
        Node<Integer> tmp_vetor;

        // int idx = 0;
        for (int i = 0; i < user_reco.capacity; i++) {
            star_heap = new MaxHeap2<>(k);
            tmp_vetor = usr_rc_n.data.vektor.root.next; // 599 next 3

            while (tmp_vetor != null) {
                star_heap.insert(new Distance(tmp_vetor.index, tmp_vetor.data));
                tmp_vetor = tmp_vetor.next;
            }
            // idx = 0;
            Node<Distance> star_node = star_heap.heap.root;
            for (int j = 0; j < k; j++) {
                result.insert(star_node.data.index);
                star_node = star_node.next;
            }
            usr_rc_n = usr_rc_n.next;
        }
        System.out.println("sonuç");
        result.print();
        System.out.println("sonuç");
        return result;
    }

    private void get_recomended(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_get_recomended


        // user_reco.print();
    }// GEN-LAST:event_get_recomended

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        FlatArcDarkOrangeIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Get_Insert_Recommendation;
    private javax.swing.JButton JB_Get_Selected_Recommendation;
    private javax.swing.JComboBox<String> JCB_Fifth_Movie;
    private javax.swing.JComboBox<String> JCB_First_Movie;
    private javax.swing.JComboBox<String> JCB_Fourth_Movie;
    private javax.swing.JComboBox<String> JCB_Second_Movie;
    private javax.swing.JComboBox<String> JCB_Third_Movie;
    private javax.swing.JComboBox<String> JCB_User_Select;
    private javax.swing.JList<String> JLS_Insert_Result;
    private javax.swing.JList<String> JLS_Selected_Result;
    private javax.swing.JLabel JL_K;
    private javax.swing.JLabel JL_K1;
    private javax.swing.JLabel JL_X;
    private javax.swing.JLabel JL_X1;
    private javax.swing.JPanel JPN_TargetUser_Insert;
    private javax.swing.JPanel JPN_TargetUser_Selected;
    private javax.swing.JSpinner JSP_K_Insert_Value;
    private javax.swing.JSpinner JSP_K_Selected_Value;
    private javax.swing.JSpinner JSP_X_Insert_Value;
    private javax.swing.JSpinner JSP_X_Selected_Value;
    private javax.swing.JSpinner JS_1_MOVIE_VAL;
    private javax.swing.JSpinner JS_2_MOVIE_VAL;
    private javax.swing.JSpinner JS_3_MOVIE_VAL;
    private javax.swing.JSpinner JS_4_MOVIE_VAL;
    private javax.swing.JSpinner JS_5_MOVIE_VAL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
