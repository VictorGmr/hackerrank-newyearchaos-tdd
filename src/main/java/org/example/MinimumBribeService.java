package org.example;

import java.util.List;

public class MinimumBribeService {
    protected void execute(List<Integer> q) {
        System.out.println(getMinimumBribes(q));
    }

    protected String getMinimumBribes(List<Integer> q) {
        int minBribes = 0;
        boolean isOrdered = false;

        while(!isOrdered) {
            isOrdered = true;

            for(int i = q.size() - 1; i >= 0; i--) {
                if(i > 0 && q.get(i - 1) > i && (q.get(i - 1) - (i)) > 2) {
                    return "Too chaotic";
                }

                if(i > 0 && q.get(i) < q.get(i - 1)) {
                    isOrdered = false;
                    int temp = q.get(i);
                    q.set(i, q.get(i - 1));
                    q.set(i - 1, temp);
                    minBribes++;
                }
            }
        }

        return String.valueOf(minBribes);
    }
}