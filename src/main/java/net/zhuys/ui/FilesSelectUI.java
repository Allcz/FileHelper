package net.zhuys.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Description: FilesSelectUI
 * @Author: Allz
 * @Date: 2022-07-10 23:16
 */
public class FilesSelectUI {
    private JCheckBox allCheckBox;
    private JPanel panel1;
    private JCheckBox checkBox1;

    public FilesSelectUI() {
        allCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FilesChoose.filesChoseUI();
            }
        });
    }
}
