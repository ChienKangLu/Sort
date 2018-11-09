package sort;

public class InsertionSort extends Sort {

	public InsertionSort() {
		
	}

	public InsertionSort(int[] datas) {
		super(datas);
	}

	@Override
	public void sort() {
		for(int i=1;i<datas.length;i++) {
			int unsorted = datas[i];
			int insert = i;
			for(int j=i-1;j>=0;j--) {
				if(datas[j]>unsorted) {
					datas[j+1]=datas[j];
					insert = j;
				}else {
					break;
				}
			}
			datas[insert]=unsorted;
		}
	}

	@Override
	public String toString() {
		return "InsertionSort";
	}

}
