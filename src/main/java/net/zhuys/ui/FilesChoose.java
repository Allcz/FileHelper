package net.zhuys.ui;

import javax.swing.JFileChooser;
import java.io.File;
import java.util.Arrays;

/**
 * @Description: FileChooseUI
 * @Author: Allz
 * @Date: 2022-07-10 17:19
 */
public class FilesChoose {
    /**
     * 文件、文件夹选择UI
     *
     * @return
     */
    public static String[] filesChoseUI() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setMultiSelectionEnabled(true);
        int status = chooser.showOpenDialog(null);
        if (status != JFileChooser.APPROVE_OPTION) {
            return new String[]{};
        }
        File[] selectedFiles = chooser.getSelectedFiles();
        String[] filesPaths = new String[selectedFiles.length];
        for (int i = 0; i < selectedFiles.length; i++) {
            filesPaths[i] = selectedFiles[i].getAbsolutePath();
        }
        System.out.println(Arrays.toString(filesPaths));
        return filesPaths;
    }
}
