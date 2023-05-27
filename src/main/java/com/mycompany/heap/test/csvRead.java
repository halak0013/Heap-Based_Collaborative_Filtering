package com.mycompany.heap.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;

public class csvRead<E extends Comparable<E>> {
    public void readFile(String path, ZeroList<E> result) {

        String line = "";
        String csvDelimiter = ",";
        boolean pass = true;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                if (pass) {
                    pass = false;
                    continue;
                }
                String[] data = line.split(csvDelimiter);
                ZeroList<E> tmpZL = new ZeroList<>();
                for (int i = 0; i < data.length; i++) {
                    tmpZL.insert((E) data[i]);
                }
                result.insert(tmpZL);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFileInt(String path, ZeroList<Integer> result) {

        String line = "";
        String csvDelimiter = ",";
        boolean pass = true;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                if (pass) {
                    pass = false;
                    continue;
                }
                String[] data = line.split(csvDelimiter);
                ZeroList<Integer> tmpZL = new ZeroList<>();
                for (int i = 0; i < data.length; i++) {
                    tmpZL.insertWZ(Integer.parseInt(data[i]));
                }
                result.insert(tmpZL);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void print(ZeroList<E> zl) {
        Node<E> tmo = zl.root;
        while (tmo != null) {
            Node<E> tmi = tmo;
            while (tmi != null) {
                System.out.print(tmi.data + " - ");
                tmi = tmi.next;
            }
            tmo = tmo.next;
            System.out.println();
        }
    }

    void insert(ZeroList<E> zl, int index, DefaultComboBoxModel<String> model) {
        Node<E> tmo = zl.root;
        int currentIndex = 0;
        while (tmo != null) {
            Node<E> tmi = tmo;
            int innerIndex = 0;
            while (tmi != null && innerIndex < index) {
                tmi = tmi.next;
                innerIndex++;
            }    
            if (tmi != null) {
                model.addElement(tmi.data.toString()+". User"); 
            }
            tmo = tmo.next;
            currentIndex++;
        }
    }

    public static void main(String[] args) {
        ZeroList<Integer> z1 = new ZeroList<>();
        csvRead<Integer> c = new csvRead<>();
        c.readFileInt("./data/target_user.csv", z1);
        c.print(z1);

        ZeroList<String> z2 = new ZeroList<>();
        csvRead<String> c2 = new csvRead<>();
        c2.readFile("./data/movies.csv", z2);
        c2.print(z2);
    }
}
