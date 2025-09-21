/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
bool* kidsWithCandies(int* candies, int candiesSize, int extraCandies, int* returnSize) {
    *returnSize=candiesSize;
    bool *result=(bool *)malloc(candiesSize * sizeof(bool));
    int *max=candies;
    for(int i=1;i<candiesSize;i++){
        if(*(candies+i) > *max){
            max=(candies+i);
        }
    }
    for(int i=0;i<candiesSize;i++){
        if((*(candies+i))+extraCandies >= *max){
            result[i]=true;
        }
        else{
            result[i]=false;
        }
    }
    return result;
}