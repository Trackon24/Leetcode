char * mergeAlternately(char * word1, char * word2){
   int len1=strlen(word1), len2=strlen(word2);
   int i=0,k=0;
   char *result = (char *) malloc(len1+len2+1);
   while(i<len1 && i<len2){
    result[k++]=word1[i];
    result[k++]=word2[i];
    i++;
   }
   while(i<len1){
    result[k++]=word1[i++];
    }
    while(i<len2){
        result[k++]=word2[i++];
    }
    result[k]='\0';
    return result;
}