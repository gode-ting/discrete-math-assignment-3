/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import app.Interfecaes.CompareSetInterface;

public class CompareSets implements CompareSetInterface {

    public int compareSets(int[] a, int[] b) {
        if (a.length == 0) {
            return b.length == 0 ? 0 : -1;
        }
        if (b.length == 0) {
            return 1;
        }

        int result = 0;
        int indexA = 0;
        int indexB = 0;

        while (indexA < a.length && indexB < b.length) {
            if (a[indexA] == b[indexB]) {
                indexA++;
                indexB++;
            } else if (a[indexA] > b[indexB]) {
                if (result == 1) {
                    return -2;
                }
                indexB++;
                return -1; // a is subset
            } else if (a[indexA] < b[indexB]) {
                if (result == -1) {
                    return -2;
                }
                indexA++;
                result = 1; // a is superset
            }
        }
        if (indexA == a.length && indexB == b.length) {
            return result;
        }
        return -2; // sets
    }

}
