class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;
        
        for (int g : gain) {
            altitude += g;              // update current altitude
            maxAltitude = Math.max(maxAltitude, altitude); // track highest
        }
        
        return maxAltitude;
    }
}
