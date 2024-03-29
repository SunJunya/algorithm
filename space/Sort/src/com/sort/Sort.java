package com.sort;



/**
 * @author 孙君雅
 *
 */
public class Sort {

	public static void main(String[] args) {
		Sort sort=new Sort();
		int[] a={43,32,23,13,5};
//		sort.InsertionSort(a);
//		System.out.println("123");
//		sort.ShellSort(a);
//		sort.BubbleSort(a);
		int low=0;
		int high=a.length-1;
		sort.QuickSort(a,low,high);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}
	
	public void InsertionSort(int[] a){
		/*
		 * 直接插入排序（Straight insertion sorting）的基本思想：在要排序的一组数组中，假设前面(n-1)[n>=2]
		 * 个数已经排好顺序，现在要把第n个数查到前面的有序数中，使得这个n个数也是排好顺序的。如此反复循环，知道全部排好顺序
		 * 
		 * 时间复杂度O（n^2）
		 * */
		
		int length=a.length;
		int insertnum;
		for(int i=1;i<length;i++)
		{
			insertnum=a[i];
			int j=i-1;
			for(;j>=0;j--){
				if(a[j]>insertnum){
					a[j+1]=a[j];
				}
			}
			a[j+1]=insertnum;
		}
	}

	public void ShellSort(int[] a) {
		/*
		 * 插入排序的升级版
		 * 希尔排序(ShellSort)：先把整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，待整个序列中的记录基本有序时
		 * 再对全体记录惊醒一次直接排序
		 * */
		int i,j,temp;
		int length=a.length;
		do{
			length=length/2;
			for(i=length;i<a.length;i++){
				if(a[i]<a[i-length]){
					temp=a[i];
					for(j=i-length;j>=0 && a[j]>temp;j-=length){
						a[j+length]=a[j];
					}
					a[j+length]=temp;
				}
			}
		}while(length>0);
		
	}
	
	public void BubbleSort(int[] a){
		/*
		 * 冒泡排序（dubble Sort）：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数一次进行比较和调整，让比较大的数往下沉，较小的往上冒。
		 * 即每当相邻的书比较后发现它们的排序与排序要求相反时，就将它互换。
		 * */
/*		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}*/
		
		for(int i=0;i<a.length;i++){
			int low=0;
			int high=a.length-1;
			while(low<high){
				for(int j=low;j<high;++j){
					if(a[j]>a[j+1]){
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
				--high;
				for(int j=high;j>low;--j){
					if(a[j]<a[j+1]){
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
				++low;
			}
			
		}
	}
	
	public void QuickSort (int[] a,int low,int high){
		/*
		 * 快速排序（Quick Sort）：
		 * 1.选择一个基准元素(一般是第一个元素或者最后一个元素)
		 * 2.通过一趟排序将待排序的记录分割成独立的两部分，
		 *   其中一部分的元素值均比基准元素值小，另一部分的元素质均比元素的基准值大。
		 * 3.此时基准元素在其排好序后的正确位置
		 * 4.然后对这两部分的记录采取同样的方法继续进行排序
		 * */
		
		if(low<high){
			Sort sort=new Sort();
			int middle=sort.getMiddle(a, low, high);
			sort.QuickSort(a, 0, middle-1);
			sort.QuickSort(a, middle+1, high);
		}
	}
	
	public int getMiddle(int[] a,int low,int high){
		int key=a[low];
		//取第一个元素为基准元素
		while(low<high){
			for(int i=high;low<high&&a[i]>=key;high--){		
			}
			a[low]=a[high];
			for(int i=low;low<high && a[i]<=key;low++){
			}
			a[high]=a[low];
		}
		a[low]=key;
		return low;//此时数组顺序已经改变
	}

}
