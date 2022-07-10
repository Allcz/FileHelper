/*
 * Created by JFormDesigner on Sun Jul 10 23:14:57 CST 2022
 */

package net.zhuys.ui;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Objects;
import javax.swing.*;

/**
 * @author unknown
 */
public class MainUi extends JFrame {
    public MainUi() {
        initComponents();
    }

    public void button1(ActionEvent e) {
        // TODO add your code here
        String[] strings = FilesChoose.filesChoseUI();
        this.rootPath.setText(strings[0]);
        File file = new File(strings[0]);
        File[] files = file.listFiles();
        this.filesSelectPanel.removeAll();
        this.filesSelectPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        Checkbox checkbox = new Checkbox("");
        this.filesSelectPanel.add(checkbox);
        checkbox.setBounds(new Rectangle(new Point(15, 20), checkbox.getPreferredSize()));
        for (int i = 0; i < Objects.requireNonNull(files).length; i++) {
            checkbox = new Checkbox(files[i].getName());
            this.filesSelectPanel.add(checkbox);
            checkbox.setBounds(new Rectangle(new Point(15, 20 * (i + 2)), checkbox.getPreferredSize()));
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        menuBar2 = new JMenuBar();
        rootPathName = new JLabel();
        selectRootPath = new JButton();
        rootPath = new JTextField();
        filesSelectPanel = new JScrollPane();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        setJMenuBar(menuBar2);

        //---- rootPathName ----
        rootPathName.setText("\u8def\u5f84");
        contentPane.add(rootPathName);
        rootPathName.setBounds(15, 10, 30, 25);

        //---- selectRootPath ----
        selectRootPath.setText("\u9009\u62e9\u6587\u4ef6\u5939");
        selectRootPath.addActionListener(e -> button1(e));
        contentPane.add(selectRootPath);
        selectRootPath.setBounds(445, 10, 100, 25);

        //---- rootPath ----
        rootPath.setAutoscrolls(false);
        contentPane.add(rootPath);
        rootPath.setBounds(50, 10, 390, 25);
        contentPane.add(filesSelectPanel);
        filesSelectPanel.setBounds(30, 75, 180, 165);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JMenuBar menuBar2;
    public JLabel rootPathName;
    public JButton selectRootPath;
    public JTextField rootPath;
    public JScrollPane filesSelectPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
