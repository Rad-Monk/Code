public class _88 {

    public void merger(int[] nums, int left, int mid, int right){
        int leftSize= mid- left +1;
        int rightSize= right -  mid;
        int[] leftarr= new int[leftSize];
        int[] rightarr= new int[rightSize];
        for(int i=0; i< leftSize;i++){
            leftarr[i]= nums[left + i];
        }
        for(int j=0; j<rightSize;j++){
            rightarr[j]= nums[mid + j + 1];
        }
        int i=0; int j=0; int k=left;
        while (i < leftSize && j < rightSize){
            if (leftarr[i] <= rightarr[j]){
                nums[k]=leftarr[i];
                i++;
            }
            else {
                nums[k]=rightarr[j];
                j++;
            }
            k++;
        }
        while (i< leftSize){
            nums[k]=leftarr[i];
            k++;
            i++;
        }
        while(j< rightSize){
            nums[k]=rightarr[j];
            k++;
            j++;
        }

    }
    public void sort(int[] nums, int left, int right){
        if (left< right){
            int mid=  left + (right - left) / 2;
            sort(nums, left, mid);
            sort(nums, mid+1,right);
            merger(nums,left,mid,right);
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m; i< (m+n); i++){
            nums1[i]=nums2[i-m];
        }
        sort(nums1,0,nums1.length-1);
    }
}
