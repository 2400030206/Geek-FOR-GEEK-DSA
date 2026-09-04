class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int n=arr.length;
        int f=-1,l=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                if(f==-1){
                    f=i;
                }
                l=i;
            }
        }
    ArrayList<Integer>list=new ArrayList<>();
    list.add(f);
    list.add(l);
    return list;
    }
}
