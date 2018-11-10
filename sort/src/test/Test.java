package test;

import sort.BubbleSort;
import sort.InsertionSort;
import sort.MergeSort;
import sort.QuickSort;
import sort.RandomQuickSort;
import sort.SelectionSort;
import sort.Sort;

public class Test {
	public static int[] createDatas(int size) {
		int datas[]=new int[size];
		for(int i=0;i<datas.length;i++) {
			datas[i] = (int)(Math.random()*100);
		}
		return datas;
	}
	public static void display(int[] datas) {
		for(int i=0;i<datas.length;i++) {
			System.out.printf("%3d",datas[i]);
		}
		System.out.println();
	}
	public static double run(Sort sort) {
		int N = 1000;
		N = 10;
		int [] datas = createDatas(N);
		sort.setDatas(datas);
		long start = System.currentTimeMillis();
		sort.sort();
		long end = System.currentTimeMillis();
		display(datas);
		return end - start;
	}
	public static double monteCarloSimulation(Sort sort) {
		double T = 20000;
		double avg = 0;
		for(int i = 0 ;i<T;i++) {
			double duration = run(sort);
			avg += duration;
		}
		return avg/T;
	}
	public static void RunSort(Sort sort) {
		System.out.printf("%15s: ",sort);
		double avg = monteCarloSimulation(sort);
		System.out.printf("%5.2f ms\n",avg);
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
		
		QuickSort quickSort = new QuickSort();
		RunSort(quickSort);
		
		RandomQuickSort randomQuickSort = new RandomQuickSort();
		run(randomQuickSort);
		RunSort(randomQuickSort);
		
		
		
	}

}
