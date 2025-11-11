class Time{
    String key,value;
    int timestamp;
    Time(String key,String value,int timestamp){
        this.key=key;
        this.value=value;
        this.timestamp=timestamp;
    }
}
class TimeMap {
    Time[] time=new Time[100000];
    int i;

    public TimeMap() {
        i=0;
    }

    public void set(String key, String value, int timestamp) {
        time[i]=new Time(key,value,timestamp);
        i++;
    }

    public String get(String key, int timestamp) {
        for(int j=i-1;j>=0;j--){
            if(time[j].key.equals(key) && time[j].timestamp<=timestamp)return time[j].value;
        }
        return "";
    }
}