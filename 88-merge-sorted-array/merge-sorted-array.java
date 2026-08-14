class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m -1;  //pointer of nums1 from last
        int p2 = n -1;  //pointer of nums2 from last
        int p = m + n - 1; //new pointer index from last

        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1]; //If value of nums1 with p1 index greater than nums2 with p2 index then new pointer ke sath array me daldo
                p1--;    //p1 index ko front ke side lekar aao
            }else{
                nums1[p] = nums2[p2]; //If value of nums1 with p2 index greater than nums1 with p1 index then new pointer ke sath array me daldo
                p2--;    //p2 index ko front ke side lekar aao
            }
            p--;   //new array pointer ko front index par leke aao
        }
        while(p2 >= 0){   //if any remaining elements left in nums2 with p2 pointer
            nums1[p] = nums2[p2];  //usko bhi naye array pointer me daldo
            p2--;
            p--;
        }
    }
}