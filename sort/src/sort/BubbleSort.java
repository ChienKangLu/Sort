package sort;

public class BubbleSort extends Sort {
	
	public BubbleSort() {
		
	}
	
	public BubbleSort(int[] datas) {
		super(datas);
	}
	
	@Override
	public void sort() {
		while(true) {
			boolean flag=false;
			for(int i=1;i<datas.length;i++) {
				if(datas[i-1]>datas[i]) {
					swap(datas,i-1, i);
					flag = true;
				}
			}
			if(!flag) {
				break;
			}
		}
	}
	
	@Override
	public String toString() {
		return "BubbleSort";
	}
}
