class Solution {
    int c=0;
    public int inversionCount(int arr[]) {
        // code here
        c = 0;
               mergesort(arr, 0, arr.length - 1);

        return c;
    }
    
    void mergesort(int[] arr,int left,int right){
        if (left >= right) {
            return;
        }
       int mid = left + (right - left) / 2;
        mergesort(arr,left,mid);
        mergesort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    void merge(int[] arr ,int left,int mid,int right){
        int i=left;
        int j=mid+1;
        int k=0;
        int[] ans=new int[right-left+1];
        while(i<=mid&&j<=right){
            if(arr[i]<=arr[j]){
                ans[k++]=arr[i++];
            }
            else{
                c+=mid-i+1;
                ans[k++]=arr[j++];
            }
        }
        while(i<=mid){
            ans[k++]=arr[i++];
        }
        while(j<=right){
            ans[k++]=arr[j++];
        }
        for (int x = 0; x < ans.length; x++) {
                   arr[left + x] = ans[x];
               }
    }
    
}