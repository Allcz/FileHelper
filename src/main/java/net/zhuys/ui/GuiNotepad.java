package net.zhuys.ui;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: GuiNotepad
 * @Author: Allz
 * @Date: 2022-06-25 18:09
 */
@SuppressWarnings("serial")
public class GuiNotepad extends JFrame {
    /**
     * 定义成员
     */
    private static JEditorPane jEditorPane = null;

    /**
     * 构造器
     */
    public GuiNotepad() {
        // 绘制界面
        this.setLayout(null);
        //窗口标题
        setTitle("批文件处理");
        this.setBounds(615, 98, 836, 908);
        setResizable(true);

        // 设置窗口图标
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image image = kit.getImage("src//image//0x1f4dd.png");
        setIconImage(image);


        JFrame frame = new JFrame("HelloWorldSwing");

        JMenuBar jr = new JMenuBar();
        jr.add(selectFilesButton());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setJMenuBar(jr);
        this.setVisible(true);
        this.setSize(800, 500);

    }

    /**
     *
     * @return
     */
    private JButton selectFilesButton() {
        JButton button = new JButton("选择文件（夹）");
        button.addActionListener(e -> {
            FilesChoose.filesChoseUI();
        });
        return button;
    }



    private JMenu newMode() {
        JMenu jMenu = new JMenu("新建");
        jMenu.addActionListener(e -> {
            FilesChoose.filesChoseUI();
        });
        this.add(jMenu);
        return jMenu;
    }

}