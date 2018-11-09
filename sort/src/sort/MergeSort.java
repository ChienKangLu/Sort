package sort;

public class MergeSort extends Sort {

	public MergeSort() {
		
	}

	public MergeSort(int[] datas) {
		super(datas);
	}

	void merge(int [] Array,int start,int mid,int end) {
		int temp[] = new int [end-start+1];
		int idx = 0;
		int left = start;
		int right = mid+1;
		while(left<=mid&&right<=end) {
			if(Array[left]<Array[right]) {
				temp[idx]=Array[left]; 
				left++;
				idx++;
			}else {
				temp[idx]=Array[right];
				right++;
				idx++;
			}
		}
		while(left<=mid) {
			temp[idx]=Array[left]; 
			left++;
			idx++;
		}
		while(right<=end) {
			temp[idx]=Array[right];
			right++;
			idx++;
		}
		for(int i=0;i<temp.length;i++) {
			Array[start+i]=temp[i]; 
		}
		
	}
	void split(int [] Array,int start,int end) {
		if(start==end) {
			return;
		} 
		int mid = (start+end)/2;
		split(Array,start,mid);
		split(Array,mid+1,end );
		merge(Array, start,mid,end);
	}
	@Override
	public void sort() {
		split(datas,0,datas.length-1);
	}

	@Override
	public String toString() {
		return "MergeSort";
	}


}
