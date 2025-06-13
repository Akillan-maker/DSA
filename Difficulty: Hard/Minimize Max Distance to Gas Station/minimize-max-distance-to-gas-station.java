// User function Template for Java

class Solution {
     public static class Pair {
        double first;
        int second;

        Pair(double first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    
    public static double findSmallestMaxDist(int stations[], int k) {
        // code here
        int[] gap=new int[stations.length-1];
        PriorityQueue<Pair> gapInd=new PriorityQueue<>((a, b) -> Double.compare(b.first, a.first));
        
        for(int i=0;i<stations.length-1;i++){
            gapInd.add(new Pair(stations[i+1]-stations[i],i));
        }
        
        for(int i=1;i<=k;i++){
             Pair tp = gapInd.poll();
            int secInd = tp.second;

            gap[secInd]++;

            double inidiff = stations[secInd + 1] - stations[secInd];
            double newSecLen = inidiff / (double) (gap[secInd] + 1);
            gapInd.add(new Pair(newSecLen, secInd));
        }

        return gapInd.peek().first;
            
        }
    }

