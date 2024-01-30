package com.in28minutes.springboot.learnjpaandhibernate;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        Queue<int[]> q = new LinkedList<>();
        
        boolean zeroFound = false;
        // find 0, once found put all zeros on a queue
        for (int i = 0; i < mat.length && zeroFound; i++) {
            for (int j = 0; j < mat[0].length && zeroFound; j++) {
                if (0 == mat[i][j]) {
                    q.add(new int[]{i, j});
                }
            }
        }      
        String s = "hello";
        


        return mat;
    }
}