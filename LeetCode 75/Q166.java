class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder result=new StringBuilder();
        if(((numerator<0)^(denominator<0))&&(numerator!=0 && denominator!=0))
            result.append("-");
        long num=Math.abs((long)numerator);
        long den=Math.abs((long)denominator);
        result.append(num/den);
        long rem=num%den;
        if(rem==0) return result.toString();
        result.append(".");
        Map<Long,Integer> remainder=new HashMap<>();
        while(rem!=0){
            if(remainder.containsKey(rem)){
                int index=remainder.get(rem);
                result.insert(index,"(");
                result.append(")");
                break;
            }
            remainder.put(rem,result.length());
            rem*=10;
            result.append(rem/den);
            rem%=den;
        }
        return result.toString();
    }
}