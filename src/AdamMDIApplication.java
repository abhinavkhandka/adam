/*
 * AdamMDIApplication.java
 *
 * Created on 29 May 2008, 17:19
 */

/**
 *
 * @author  stattert
 */


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import autotelik.swing.FilteredJList;
import autotelik.swing.*;

public class AdamMDIApplication extends javax.swing.JFrame {

    /** Creates new form AdamMDIApplication */
    public AdamMDIApplication() {
        //System.out.print("AdamMDIApplication - START INIT COMPONENTS");
        initComponents();
        //System.out.print("AdamMDIApplication - DONE INIT COMPONENTS");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        importXSDDialog = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        jCheckBox1 = new javax.swing.JCheckBox();
        navigationTabPane = new javax.swing.JTabbedPane();
        navigatorTab = new javax.swing.JPanel();
        assetsFilterLabel = new javax.swing.JLabel();
        projectsLabel = new javax.swing.JLabel();
        assetsLabel = new javax.swing.JLabel();
        projectListPane = new javax.swing.JScrollPane();
        projectList = new javax.swing.JList();
        assetPane = new javax.swing.JScrollPane();
        workTabPane = new javax.swing.JTabbedPane();
        assetTreePanel = new javax.swing.JPanel();
        assetTreeScrollPane = new javax.swing.JScrollPane();
        outPutDesktop = new javax.swing.JDesktopPane();
        outPutFrame = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        outPutTextArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        statusPanel = new javax.swing.JScrollPane();
        statusTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        toolsToolBar = new javax.swing.JToolBar();
        toXMLButton = new javax.swing.JButton();
        toCalypsoButton = new javax.swing.JButton();
        toExcelButton = new javax.swing.JButton();
        addToolBar = new javax.swing.JToolBar();
        addProjectButton = new javax.swing.JButton();
        addAssetButton = new javax.swing.JButton();
        addLeafNodeButton = new javax.swing.JButton();
        mainMenuBar = new javax.swing.JMenuBar();
        fileMenuItems = new javax.swing.JMenu();
        importXMLItem = new javax.swing.JMenuItem();
        importXSDItem = new javax.swing.JMenuItem();
        saveAsItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        schemaMenu = new javax.swing.JMenu();
        generateExcelItem = new javax.swing.JMenuItem();
        servicesMenu = new javax.swing.JMenu();
        toolsMenu = new javax.swing.JMenu();

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Follow Includes");

        javax.swing.GroupLayout importXSDDialogLayout = new javax.swing.GroupLayout(importXSDDialog.getContentPane());
        importXSDDialog.getContentPane().setLayout(importXSDDialogLayout);
        importXSDDialogLayout.setHorizontalGroup(
            importXSDDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(importXSDDialogLayout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(449, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, importXSDDialogLayout.createSequentialGroup()
                .addContainerGap(493, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addGap(439, 439, 439))
        );
        importXSDDialogLayout.setVerticalGroup(
            importXSDDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(importXSDDialogLayout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADAM");

        assetsFilterLabel.setText("Filter:");

        projectsLabel.setText("Projects");

        assetsLabel.setText("Assets");

        projectList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        projectListPane.setViewportView(projectList);

        javax.swing.GroupLayout navigatorTabLayout = new javax.swing.GroupLayout(navigatorTab);
        navigatorTab.setLayout(navigatorTabLayout);
        navigatorTabLayout.setHorizontalGroup(
            navigatorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigatorTabLayout.createSequentialGroup()
                .addGroup(navigatorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navigatorTabLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(navigatorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projectsLabel)
                            .addComponent(assetsLabel))
                        .addGap(11, 11, 11)
                        .addGroup(navigatorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assetPane, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(projectListPane, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navigatorTabLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(assetsFilterLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        navigatorTabLayout.setVerticalGroup(
            navigatorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigatorTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navigatorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectListPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navigatorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assetsLabel)
                    .addComponent(assetPane, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assetsFilterLabel)
                .addContainerGap())
        );

        navigationTabPane.addTab("Navigator", navigatorTab);

        javax.swing.GroupLayout assetTreePanelLayout = new javax.swing.GroupLayout(assetTreePanel);
        assetTreePanel.setLayout(assetTreePanelLayout);
        assetTreePanelLayout.setHorizontalGroup(
            assetTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assetTreePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(assetTreeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addContainerGap())
        );
        assetTreePanelLayout.setVerticalGroup(
            assetTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assetTreePanelLayout.createSequentialGroup()
                .addComponent(assetTreeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );

        workTabPane.addTab("Asset Definition", assetTreePanel);

        outPutFrame.setVisible(true);

        outPutTextArea.setColumns(20);
        outPutTextArea.setRows(5);
        jScrollPane1.setViewportView(outPutTextArea);

        javax.swing.GroupLayout outPutFrameLayout = new javax.swing.GroupLayout(outPutFrame.getContentPane());
        outPutFrame.getContentPane().setLayout(outPutFrameLayout);
        outPutFrameLayout.setHorizontalGroup(
            outPutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        outPutFrameLayout.setVerticalGroup(
            outPutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        );

        outPutFrame.setBounds(38, 22, 548, 386);
        outPutDesktop.add(outPutFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);

        workTabPane.addTab("OutPut", outPutDesktop);

        statusPanel.setBorder(null);
        statusPanel.setViewportView(statusTextField);

        jLabel2.setText("Status");

        jLabel1.setText("Progress");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        toolsToolBar.setRollover(true);

        toXMLButton.setText("XML");
        toXMLButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        toXMLButton.setFocusable(false);
        toXMLButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toXMLButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolsToolBar.add(toXMLButton);

        toCalypsoButton.setText("Calypso");
        toCalypsoButton.setFocusable(false);
        toCalypsoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toCalypsoButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolsToolBar.add(toCalypsoButton);

        toExcelButton.setText("Excel");
        toExcelButton.setFocusable(false);
        toExcelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toExcelButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolsToolBar.add(toExcelButton);

        addToolBar.setRollover(true);
        addToolBar.setToolTipText("Create new ADAM elements");

        addProjectButton.setText("Project");
        addProjectButton.setFocusable(false);
        addProjectButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addProjectButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addToolBar.add(addProjectButton);

        addAssetButton.setText("Asset");
        addAssetButton.setFocusable(false);
        addAssetButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addAssetButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addToolBar.add(addAssetButton);

        addLeafNodeButton.setText("Node");
        addLeafNodeButton.setFocusable(false);
        addLeafNodeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addLeafNodeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addToolBar.add(addLeafNodeButton);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toolsToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(toolsToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(addToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                .addContainerGap())
        );

        fileMenuItems.setText("File");

        importXMLItem.setText("Import XML");
        fileMenuItems.add(importXMLItem);

        importXSDItem.setText("Import XSD");
        fileMenuItems.add(importXSDItem);

        saveAsItem.setText("Save As");
        fileMenuItems.add(saveAsItem);

        mainMenuBar.add(fileMenuItems);

        editMenu.setText("Edit");
        mainMenuBar.add(editMenu);

        schemaMenu.setText("Schema");

        generateExcelItem.setText("Generate Excel");
        schemaMenu.add(generateExcelItem);

        mainMenuBar.add(schemaMenu);

        servicesMenu.setText("Services");
        mainMenuBar.add(servicesMenu);

        toolsMenu.setText("Tools");
        mainMenuBar.add(toolsMenu);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(navigationTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workTabPane)
                .addGap(18, 18, 18))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(navigationTabPane)
                    .addComponent(workTabPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //public DnDJTree getAssetTree() {
   //     return assetTree;
   // }

   // public void setAssetTree(DnDJTree assetTree) {
    //    this.assetTree = assetTree;
   // }

   // public JTextField getAssetFilter() {
    //    return assetFilter;
   // }

    //public void setAssetFilter(JTextField assetFilter) {
     //   this.assetFilter = assetFilter;
   // }

   // public FilteredJList getAssetList() {
     //   return assetList;
   // }

    //public void setAssetList(FilteredJList assetList) {
   //     this.assetList = assetList;
   // }

    public JScrollPane getAssetPane() {
        return assetPane;
    }

    public void setAssetPane(JScrollPane assetPane) {
        this.assetPane = assetPane;
    }

    public JPanel getAssetTreePanel() {
        return assetTreePanel;
    }

    public void setAssetTreePanel(JPanel assetTreePanel) {
        this.assetTreePanel = assetTreePanel;
    }

    public JScrollPane getAssetTreeScrollPane() {
        return assetTreeScrollPane;
    }

    public void setAssetTreeScrollPane(JScrollPane assetTreeScrollPane) {
        this.assetTreeScrollPane = assetTreeScrollPane;
    }

    public JLabel getAssetsFilterLabel() {
        return assetsFilterLabel;
    }

    public void setAssetsFilterLabel(JLabel assetsFilterLabel) {
        this.assetsFilterLabel = assetsFilterLabel;
    }

    public JLabel getAssetsLabel() {
        return assetsLabel;
    }

    public void setAssetsLabel(JLabel assetsLabel) {
        this.assetsLabel = assetsLabel;
    }

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jFileChooser1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton addAssetButton;
    javax.swing.JButton addLeafNodeButton;
    javax.swing.JButton addProjectButton;
    javax.swing.JToolBar addToolBar;
    javax.swing.JScrollPane assetPane;
    javax.swing.JPanel assetTreePanel;
    public javax.swing.JScrollPane assetTreeScrollPane;
    javax.swing.JLabel assetsFilterLabel;
    javax.swing.JLabel assetsLabel;
    javax.swing.JMenu editMenu;
    javax.swing.JMenu fileMenuItems;
    javax.swing.JMenuItem generateExcelItem;
    javax.swing.JMenuItem importXMLItem;
    javax.swing.JDialog importXSDDialog;
    javax.swing.JMenuItem importXSDItem;
    javax.swing.JCheckBox jCheckBox1;
    javax.swing.JFileChooser jFileChooser1;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JProgressBar jProgressBar1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JMenuBar mainMenuBar;
    javax.swing.JTabbedPane navigationTabPane;
    javax.swing.JPanel navigatorTab;
    javax.swing.JDesktopPane outPutDesktop;
    javax.swing.JInternalFrame outPutFrame;
    javax.swing.JTextArea outPutTextArea;
    javax.swing.JList projectList;
    javax.swing.JScrollPane projectListPane;
    javax.swing.JLabel projectsLabel;
    javax.swing.JMenuItem saveAsItem;
    javax.swing.JMenu schemaMenu;
    javax.swing.JMenu servicesMenu;
    javax.swing.JScrollPane statusPanel;
    javax.swing.JTextField statusTextField;
    javax.swing.JButton toCalypsoButton;
    javax.swing.JButton toExcelButton;
    javax.swing.JButton toXMLButton;
    javax.swing.JMenu toolsMenu;
    javax.swing.JToolBar toolsToolBar;
    javax.swing.JTabbedPane workTabPane;
    // End of variables declaration//GEN-END:variables

}
