class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n=a.length;
        int m=b.length;
        int i=0,j=0,s=0;
        int[] temp=new int[n+m];
        while(i<n&&j<m){
            if(a[i]<b[j]){
                temp[s]=a[i];
                i++;
            }
            else{
                temp[s]=b[j];
                j++;
            }
            s++;
        }
        while(i!=n){
            temp[s]=a[i];
            i++;
            s++;
        }
        while(j!=m){
            temp[s]=b[j];
            j++;
            s++;
        }
        return temp[k-1];
    }
}