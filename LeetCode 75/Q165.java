class Solution {
    public int compareVersion(String version1, String version2) {
        String[] splver1=version1.split("\\.");
        String[] splver2=version2.split("\\.");
        int m=splver1.length;
        int n=splver2.length;
        int len=Math.max(m,n);
        for(int i=0;i<len;i++){
            int num1=(i<m)?Integer.parseInt(splver1[i]):0;
            int num2=(i<n)?Integer.parseInt(splver2[i]):0;
            if(num1>num2) return 1;
            if(num1<num2) return -1;
        }
        return 0;
    }
}
