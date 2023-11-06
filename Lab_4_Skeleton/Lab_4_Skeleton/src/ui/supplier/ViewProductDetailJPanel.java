/*
 * CreateProductJPanel.java
 *
 */
package ui.supplier;

import model.Product;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Feature;
import model.Supplier;

/**
 *
 * @author Rushabh
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {

    JPanel workArea;
    Product product;
    Supplier supplier;
    /**
     * Creates new form CreateProductJPanel
     */

    public ViewProductDetailJPanel(JPanel workArea, Product selectedProduct, Supplier supplier) {
        initComponents();
        this.workArea = workArea;
        this.product = selectedProduct;

        txtName.setText(this.product.getName());
        txtId.setText(String.valueOf(this.product.getId()));
        txtPrice.setText(String.valueOf(this.product.getPrice()));
        
          if(product.getLogoImage() !=null) {
            imgLogo.setIcon(product.getLogoImage());
        }
        else {
            imgLogo.setText("No Logo");
        }
          
         populateProductList();

        refreshTable();
    }

   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFeatures = new javax.swing.JTable();
        btnAddFeature = new javax.swing.JButton();
        btnRemoveFeature = new javax.swing.JButton();
        imgLogo = new javax.swing.JLabel();
        cmbProductList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnApplyFeatureToProduct = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setText("View Product Details");

        lblName.setText("Product Name:");

        txtName.setEditable(false);

        lblPrice.setText("Price:");

        txtPrice.setEditable(false);

        btnUpdate.setText("Update Product");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        txtId.setEditable(false);

        lblId.setText("ID:");

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblFeatures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Feature Name", "Value"
            }
        ));
        tblFeatures.setEnabled(false);
        jScrollPane1.setViewportView(tblFeatures);

        btnAddFeature.setText("Add Feature");
        btnAddFeature.setEnabled(false);
        btnAddFeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFeatureActionPerformed(evt);
            }
        });

        btnRemoveFeature.setText("Remove Feature");
        btnRemoveFeature.setEnabled(false);
        btnRemoveFeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFeatureActionPerformed(evt);
            }
        });

        imgLogo.setText("<No Image>");
        imgLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        cmbProductList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbProductList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductListActionPerformed(evt);
            }
        });

        jLabel1.setText("Product List");

        btnApplyFeatureToProduct.setText("Apply Feature to Product ");
        btnApplyFeatureToProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyFeatureToProductActionPerformed(evt);
            }
        });

        jLabel2.setText("Add Feature to Existing Product");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(backButton1)
                                    .addGap(38, 38, 38)
                                    .addComponent(lblTitle))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblName)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblId)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblPrice)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnAddFeature)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnRemoveFeature)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                                            .addComponent(btnUpdate))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(174, 174, 174)
                                            .addComponent(jLabel1)
                                            .addGap(30, 30, 30)
                                            .addComponent(cmbProductList, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnApplyFeatureToProduct)))
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSave)
                                    .addGap(41, 41, 41)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel2)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtId, txtName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(backButton1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnUpdate)
                            .addComponent(btnAddFeature)
                            .addComponent(btnRemoveFeature)))
                    .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProductList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnApplyFeatureToProduct))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtId, txtName, txtPrice});

    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtName.setEditable(true);
        txtPrice.setEditable(true);
        btnSave.setEnabled(true);
        tblFeatures.setEnabled(true);
        btnAddFeature.setEnabled(true);
        btnRemoveFeature.setEnabled(true);

}//GEN-LAST:event_btnUpdateActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void backAction() {

        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        product.setPrice(Integer.parseInt(txtPrice.getText()));
        product.setName(txtName.getText());
        saveFeatures();

        txtName.setEditable (false);
        txtPrice.setEditable (false);
        btnSave.setEnabled(false);
        tblFeatures.setEnabled(false);
        btnAddFeature.setEnabled(false);
        btnRemoveFeature.setEnabled(false);

        JOptionPane.showMessageDialog(this, "Product information saved.", "Information", JOptionPane.INFORMATION_MESSAGE);

        refreshTable();
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void saveFeatures() {
       
        DefaultTableModel model = (DefaultTableModel) tblFeatures.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            
            Feature currentFeature = product.getFeatures().get(i);
            currentFeature.setName (tblFeatures.getValueAt (i, 0).toString()); 
            currentFeature.setValue (tblFeatures.getValueAt(i, 1));
        }
    }

    private void btnAddFeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFeatureActionPerformed
        
        Feature newFeature = product.addNewFeature();
        newFeature.setName("New Feature");
        newFeature.setValue("Type value here");
        saveFeatures();
        refreshTable();
       
    }//GEN-LAST:event_btnAddFeatureActionPerformed

    private void btnRemoveFeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFeatureActionPerformed
        // TODO add your handling code here:
    saveFeatures();

    int selectedRow = tblFeatures.getSelectedRow();
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }
    product.getFeatures().remove(selectedRow);
    refreshTable();
       
    }//GEN-LAST:event_btnRemoveFeatureActionPerformed

    private void btnApplyFeatureToProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyFeatureToProductActionPerformed
        
        int selectedRowIndex = tblFeatures.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please selecte feature to add to a product");
            return;
        }
        
        if(cmbProductList.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a product list for the feature to be applied");
            return;
        }
        
        
        DefaultTableModel model = (DefaultTableModel) tblFeatures.getModel();
        Feature currentProductFeature = (Feature) model.getValueAt(selectedRowIndex, 0);
        
        
        Product selectedProduct = (Product) cmbProductList.getSelectedItem();
        
       
        for(Feature f: selectedProduct.getFeatures()) {
            
            if(f.getName().equalsIgnoreCase(currentProductFeature.getName())) {
                JOptionPane.showMessageDialog(this, "Feature already exist in the product "+selectedProduct.getName());
                return;
            }
        }
        
        Feature feature = new Feature(selectedProduct);
        feature.setName(currentProductFeature.getName());
        
        selectedProduct.getFeatures().add(feature);
        JOptionPane.showMessageDialog(this, "Feature added to "+selectedProduct.getName());
    }//GEN-LAST:event_btnApplyFeatureToProductActionPerformed

    private void cmbProductListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductListActionPerformed
       
    }//GEN-LAST:event_cmbProductListActionPerformed

    public void refreshTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblFeatures.getModel();
        model.setRowCount (0);

        for (Feature f: product.getFeatures()) {

            Object row[] = new Object[2];
            row[0] = f;
            row[1] = f.getValue() == null ? "Empty": f.getValue().toString();
            model.addRow(row);
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JButton btnAddFeature;
    private javax.swing.JButton btnApplyFeatureToProduct;
    private javax.swing.JButton btnRemoveFeature;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbProductList;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblFeatures;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    private void populateProductList() {
      cmbProductList.removeAll();
        
        for(Product p: supplier.getProductCatalog().getProductCatalog()) {
            cmbProductList.addItem(p.getName());
        }  
    }
}
