package com.mycompany.heap.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class csvRead<C> {
    public void readFile(String path, ZeroList<C> result) {

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
                ZeroList<C> tmpZL = new ZeroList<>();
                for (int i = 0; i < data.length; i++) {
                    tmpZL.insert(i);
                }
                // System.out.println(data[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFileInt(String path, ZeroList<ZeroList<Integer>> result) {

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
                    tmpZL.insert(Integer.parseInt(data[i]));
                }
                result.insert(tmpZL);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void print(ZeroList<ZeroList<C>> zl) {
        Node<ZeroList<C>> tmo = zl.root;
        while (tmo != null) {
            Node<C> tmi = tmo.data.root;
            while(tmi != null) {
                System.out.print(tmi.data+" - ");
                tmi=tmi.next;
            }
            tmo = tmo.next;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ZeroList<ZeroList<Integer>> z1 = new ZeroList<>();
        csvRead<Integer> c = new csvRead<>();
        c.readFileInt("./data/target_user.csv", z1);
        c.print(z1);
    }
}
