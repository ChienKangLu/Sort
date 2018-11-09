package sort;

public class SelectionSort extends Sort {

	public SelectionSort() {
		
	}

	public SelectionSort(int[] datas) {
		super(datas);
	}

	@Override
	public void sort() {
		for (int i = 0; i < datas.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < datas.length; j++) {
				if (datas[index] > datas[j]) {
					index = j;
				}
			}
			swap(index, i);
		}
	}

	@Override
	public String toString() {
		return "SelectionSort";
	}

}
