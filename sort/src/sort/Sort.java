package sort;

public abstract class Sort {
	int[] datas;
	public Sort() {
	}
	public Sort(int[] datas) {
		this.datas = datas;
	}
	void swap(int a,int b) {
		int temp = datas[a];
		datas[a] = datas[b];
		datas[b] = temp;
	}
	public void setDatas(int[] datas) {
		this.datas = datas;
	}
	public abstract void sort();
	
}
