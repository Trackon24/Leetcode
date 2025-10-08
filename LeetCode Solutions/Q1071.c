int gcd(int l1,int l2){
    return ((l2==0)?l1:gcd(l2,l1%l2));
}
int isRepeat(char*str,char *pat){
    int lenstr=strlen(str);
    int lenpat=strlen(pat);
    if(lenstr % lenpat!=0){
        return 0;
    }
    for(int i=0;i<lenstr;i++){
        if(str[i]!=pat[i%lenpat]){
            return 0;
        }
    }
    return 1;
}
char* gcdOfStrings(char* str1, char* str2) {
    int l1=strlen(str1);
    int l2=strlen(str2);
    char *result=(char*)malloc(l1+l2+1);
    char *c1=(char*)malloc(l1+l2+1);
    char *c2=(char*)malloc(l1+l2+1);
    strcpy(c1,str1);
    strcat(c1,str2);
    strcpy(c2,str2);
    strcat(c2,str1);
    if(strcmp(c1,c2)!=0){
        return "";
    }
    int g=gcd(l1,l2);
    strncpy(result,str1,g);
    result[g]='\0';
    if(isRepeat(str1,result)&&(isRepeat(str2,result))){
        return result;
    }
return "";
}