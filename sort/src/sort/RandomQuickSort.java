package sort;

public class RandomQuickSort extends Sort {

	public RandomQuickSort() {
		
	}

	public RandomQuickSort(int[] datas) {
		super(datas);
	}
	
	int partition(int[] datas,int start,int end) {
		//random pick a pivot and swap to the start
		int step = ( (int)(Math.random()*100 ) % (end - start));
		swap(datas,start+step,start);
		
		int pivot = datas[start];
		int center = start;
		for(int i = start + 1 ; i<= end ;i++) {
			if(datas[i]<pivot) {
				center+=1;
				swap(datas,center, i);
			}
		}
		return center;
	}
	
	void split(int[] datas,int start,int end) {
		if(start>=end) {
			return;
		}
		int center = partition(datas, start, end);
		swap(datas,start,center);
		split(datas,start,center-1);
		split(datas,center+1,end);
	}
	
	@Override
	public void sort() {
		split(datas,0,datas.length-1);
	}

	@Override
	public String toString() {
		return "RandomQucikSort";
	}
}
