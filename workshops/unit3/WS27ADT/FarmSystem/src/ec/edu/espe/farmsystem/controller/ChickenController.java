/** Copyright ESPE-DECC
 */
package ec.edu.espe.farmsystem.controller;

import ec.edu.espe.farmsystem.model.Chicken;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

/**
 *
 * @author Edison Lascano ESPE-DCCO
 */
public class ChickenController {

    public void save(Chicken chicken) {
        Chicken[] chickens = new Chicken[FileManager.countLines("chickens")];
        String[] rows = new String[FileManager.countLines("chickens")];
        read(rows, chickens);
        if (find(chickens, chicken.getName()) != -1) {
            JOptionPane.showMessageDialog(null, "chicken -> " + chicken.getName() + " <- already exists", "USE OTHER NAME",JOptionPane.CANCEL_OPTION);
            return;
        } else {
            String data = chicken.getName() + "," + chicken.getColor() + "," + chicken.getAge() + "," + chicken.isIsMolting();
            FileManager.save(data, "chickens");
        }
    }

    public void read(String[] data, Chicken[] chickens) {

        FileManager.readLines("chickens", data);

        //accessing every line of the file through the FileManager.readLines() method
        for (int i = 0; i < data.length; i++) {

            //separating strings where a comma (,) is found
            String[] dataForChicken = data[i].split(",");

            //building an object with the splitted data
            String name = dataForChicken[0];
            String color = dataForChicken[1];
            int age = Integer.parseInt(dataForChicken[2]);
            boolean isMolting = Boolean.parseBoolean(dataForChicken[3]);

            chickens[i] = new Chicken(name, color, age, isMolting);
        }
    }

    public int find(Chicken[] chickens, String name) {
        for (int i = 0; i < chickens.length; i++) {
            if (name.equals(chickens[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public void populateChickensTable(JTable jTable, Chicken[] chickens) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        Object rowData[] = new Object[chickens.length];
        for (int i = 0; i < chickens.length; i++) {
            rowData[0] = chickens[i].getName();
            rowData[1] = chickens[i].getColor();
            rowData[2] = chickens[i].getAge();
            rowData[3] = chickens[i].isIsMolting();
            model.addRow(rowData);
        }

    }

}
