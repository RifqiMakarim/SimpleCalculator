
import java.util.ArrayList;
/**
 *
 * @author Rifqi Makarim
 */
public class SimpleCalculator extends javax.swing.JFrame {
    
    private StringBuilder expression = new StringBuilder();
    private double lastResult;
    
    public SimpleCalculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        TextCalculator = new javax.swing.JLabel();
        DisplayText = new javax.swing.JTextField();
        ClearButton = new javax.swing.JButton();
        SevenButton = new javax.swing.JButton();
        FourButton = new javax.swing.JButton();
        OneButton = new javax.swing.JButton();
        EightButton = new javax.swing.JButton();
        BackspaceButton = new javax.swing.JButton();
        FiveButton = new javax.swing.JButton();
        TwoButton = new javax.swing.JButton();
        ZeroButton = new javax.swing.JButton();
        ModuloButton = new javax.swing.JButton();
        DivisionButton = new javax.swing.JButton();
        NineButton = new javax.swing.JButton();
        SixButton = new javax.swing.JButton();
        ThreeButton = new javax.swing.JButton();
        CommaButton = new javax.swing.JButton();
        MultipleButton = new javax.swing.JButton();
        SubtractButton = new javax.swing.JButton();
        PlusButton = new javax.swing.JButton();
        EqualsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextCalculator.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextCalculator.setText("CALCULATOR");

        DisplayText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DisplayText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        DisplayText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayTextActionPerformed(evt);
            }
        });

        ClearButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ClearButton.setText("C");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        SevenButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SevenButton.setText("7");
        SevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenButtonActionPerformed(evt);
            }
        });

        FourButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        FourButton.setText("4");
        FourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourButtonActionPerformed(evt);
            }
        });

        OneButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        OneButton.setText("1");
        OneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneButtonActionPerformed(evt);
            }
        });

        EightButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        EightButton.setText("8");
        EightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EightButtonActionPerformed(evt);
            }
        });

        BackspaceButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BackspaceButton.setText("<-");
        BackspaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackspaceButtonActionPerformed(evt);
            }
        });

        FiveButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        FiveButton.setText("5");
        FiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveButtonActionPerformed(evt);
            }
        });

        TwoButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TwoButton.setText("2");
        TwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoButtonActionPerformed(evt);
            }
        });

        ZeroButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ZeroButton.setText("0");
        ZeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroButtonActionPerformed(evt);
            }
        });

        ModuloButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ModuloButton.setText("%");
        ModuloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModuloButtonActionPerformed(evt);
            }
        });

        DivisionButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DivisionButton.setText("÷");
        DivisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionButtonActionPerformed(evt);
            }
        });

        NineButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NineButton.setText("9");
        NineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineButtonActionPerformed(evt);
            }
        });

        SixButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SixButton.setText("6");
        SixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixButtonActionPerformed(evt);
            }
        });

        ThreeButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ThreeButton.setText("3");
        ThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeButtonActionPerformed(evt);
            }
        });

        CommaButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CommaButton.setText(".");
        CommaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommaButtonActionPerformed(evt);
            }
        });

        MultipleButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        MultipleButton.setText("×");
        MultipleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultipleButtonActionPerformed(evt);
            }
        });

        SubtractButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SubtractButton.setText("-");
        SubtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtractButtonActionPerformed(evt);
            }
        });

        PlusButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PlusButton.setText("+");
        PlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusButtonActionPerformed(evt);
            }
        });

        EqualsButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        EqualsButton.setText("=");
        EqualsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Created by Rifqi Makarim");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BackspaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ModuloButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DivisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MultipleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SubtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TwoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ThreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PlusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ZeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CommaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EqualsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DisplayText))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(TextCalculator)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DisplayText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackspaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModuloButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DivisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MultipleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TwoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ZeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EqualsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>                        
    
    private void EnterNum(String number){
        expression.append(number);
        DisplayText.setText(expression.toString());
    }
    
    private double evaluateExpression(String expr) {
        try {
            
            String[] tokens = expr.trim().split("\\s+");

            ArrayList<Double> numbers = new ArrayList<>();
            ArrayList<String> operators = new ArrayList<>();

            numbers.add(Double.parseDouble(tokens[0]));
            for (int i = 1; i < tokens.length; i += 2) {
                operators.add(tokens[i]);
                numbers.add(Double.parseDouble(tokens[i + 1]));
            }

            for (int i = 0; i < operators.size(); i++) {
                String op = operators.get(i);
                if (op.equals("*") || op.equals("/") || op.equals("%")) {
                    double num1 = numbers.get(i);
                    double num2 = numbers.get(i + 1);
                    double result;

                    switch (op) {
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 == 0) {
                                throw new ArithmeticException("Division by zero");
                            }
                            result = num1 / num2;
                            break;
                        case "%":
                            if (num2 == 0) {
                                throw new ArithmeticException("Modulo by zero");
                            }
                            result = num1 % num2;
                            break;
                        default:
                            continue;
                    }

                 
                    numbers.set(i, result);              
                    numbers.remove(i + 1);               
                    operators.remove(i);     
                    i--;
                }
            }

            double result = numbers.get(0);
            for (int i = 0; i < operators.size(); i++) {
                String op = operators.get(i);
                double num2 = numbers.get(i + 1);

                switch (op) {
                    case "+":
                        result += num2;
                        break;
                    case "-":
                        result -= num2;
                        break;
                }
            }

            return result;

        } catch (Exception e) {
            throw new RuntimeException("Invalid expression");
        }
    }
    
    private void DisplayTextActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // Display Text
    }                                           

    private void MultipleButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        expression.append(" * ");
        DisplayText.setText(expression.toString());   
    }                                              

    private void EqualsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
           try {

           double result = evaluateExpression(expression.toString());

           String resultStr;
           if (result == (long) result) {
               resultStr = String.format("%d", (long) result);
           } else {
               resultStr = String.format("%.2f", result);
           }

 
           DisplayText.setText(resultStr);
           expression = new StringBuilder(resultStr);
           lastResult = result;

       } catch (Exception e) {
           DisplayText.setText("ERROR");
           expression.setLength(0);
       }
    }                                            

    private void FiveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        EnterNum("5");
    }                                          

    private void SixButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        EnterNum("6");
    }                                         

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        expression.setLength(0);
        DisplayText.setText("");
        lastResult = 0;
    }                                           

    private void BackspaceButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                

        if ( expression.length() > 0 ) {
            expression.deleteCharAt(expression.length() - 1);
            DisplayText.setText(expression.toString());
        }
    }                                               

    private void ModuloButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        expression.append(" % ");
        DisplayText.setText(expression.toString());  
        
    }                                            

    private void DivisionButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        expression.append(" / ");
        DisplayText.setText(expression.toString());  
    }                                              

    private void SevenButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        EnterNum("7");
    }                                           

    private void EightButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        EnterNum("8");
    }                                           

    private void NineButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        EnterNum("9");
    }                                          

    private void FourButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        EnterNum("4");
    }                                          

    private void OneButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        EnterNum("1");
    }                                         

    private void TwoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        EnterNum("2");
    }                                         

    private void ThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        EnterNum("3");
    }                                           

    private void PlusButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        expression.append(" + ");
        DisplayText.setText(expression.toString());  
    }                                          

    private void SubtractButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        expression.append(" - ");
        DisplayText.setText(expression.toString());    
    }                                              

    private void ZeroButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        EnterNum("0");
    }                                          

    private void CommaButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(!expression.toString().contains(".")) {
            expression.append(".");
            DisplayText.setText(expression.toString());
        }
    }                                           
    
 
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
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BackspaceButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton CommaButton;
    private javax.swing.JTextField DisplayText;
    private javax.swing.JButton DivisionButton;
    private javax.swing.JButton EightButton;
    private javax.swing.JButton EqualsButton;
    private javax.swing.JButton FiveButton;
    private javax.swing.JButton FourButton;
    private javax.swing.JButton ModuloButton;
    private javax.swing.JButton MultipleButton;
    private javax.swing.JButton NineButton;
    private javax.swing.JButton OneButton;
    private javax.swing.JButton PlusButton;
    private javax.swing.JButton SevenButton;
    private javax.swing.JButton SixButton;
    private javax.swing.JButton SubtractButton;
    private javax.swing.JLabel TextCalculator;
    private javax.swing.JButton ThreeButton;
    private javax.swing.JButton TwoButton;
    private javax.swing.JButton ZeroButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
