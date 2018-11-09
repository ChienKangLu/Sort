package test;

import sort.BubbleSort;
import sort.InsertionSort;
import sort.MergeSort;
import sort.SelectionSort;
import sort.Sort;

public class Test {
	public static int[] createDatas(int size) {
		int datas[]=new int[size];
		for(int i=0;i<datas.length;i++) {
			datas[i] = (int)(Math.random()*10);
		}
		return datas;
	}
	public static void display(int[] datas) {
		for(int i=0;i<datas.length;i++) {
			System.out.printf("%3d",datas[i]);
		}
		System.out.println();
	}
	public static double monteCarloSimulation(Sort sort) {
		double T = 100;
		int N = 5000;
		double avg = 0;
		for(int i = 0 ;i<T;i++) {
			int [] datas = createDatas(N);
			sort.setDatas(datas);
			long start = System.currentTimeMillis();
			sort.sort();
			long end = System.currentTimeMillis();
			avg += (end - start);
		}
		return avg/T;
	}
	public static void RunSort(Sort sort) {
		double avg = monteCarloSimulation(sort);
		System.out.printf("%15s: %5.2f ms\n",sort,avg);
	}
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		RunSort(bubbleSort);
		
		SelectionSort selectionSort = new SelectionSort();
		RunSort(selectionSort);
		
		InsertionSort insertionSort = new InsertionSort();
		RunSort(insertionSort);

		MergeSort mergeSort = new MergeSort();
		RunSort(mergeSort);
		
	}

}
