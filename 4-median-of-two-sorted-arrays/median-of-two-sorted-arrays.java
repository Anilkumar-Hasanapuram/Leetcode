class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int arr[]=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++)
        {
            arr[k++]=nums1[i];
        }
        for(int i=0;i<m;i++)
        {
            arr[k++]=nums2[i];
        }
        Arrays.sort(arr);
        int total=arr.length/2;
        if(arr.length%2!=0)
        {
            return (double) arr[total];
        }
        else
        {
        
            return ((double)arr[total]+(double)arr[total-1])/2.0;
        }
    }
}