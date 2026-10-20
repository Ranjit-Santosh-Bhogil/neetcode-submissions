class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int arr[] = new int[n+m];

        merge(nums1,nums2,arr,n,m);

        int total = m+n;

        if(total%2==0){
            
            return (arr[total/2]+arr[(total/2)-1])/(double)2;
        }else{
            return arr[total/2];
        }
    }

    public void merge(int nums1[],int nums2[],int arr[],int n ,int m){

        int i=0;//nums1
        int j=0;//nums2

        int k=0;//arr


        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i++];
                
            }else{
                arr[k++]=nums2[j++];
            }
        }

        //remaining from nums1
        while(i<n){
            arr[k++]=nums1[i++];
        }

        //rem from nums2
        while(j<m){
            arr[k++]=nums2[j++];
        }
    }

}
