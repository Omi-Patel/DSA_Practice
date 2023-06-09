class MergeTwoArray{
	public static void main(String[] args){
		int a[] = {2, 5, 7, 8, 13, 21};
		int b[] = {3, 4, 6, 14, 16, 20, 25};
		
		// length for array k
		int n = a.length + b.length;
		int k[] = new int[n];
		
		int i = 0;
		int j = 0;
		int t = 0;
		
		while(i < a.length && j < b.length){
			if(a[i] < b[j]){
				k[t] = a[i];
				i++;
				t++;
			}else{
				k[t] = b[j];
				j++;
				t++;
			}
		}
		
		if(i < a.length){
			k[t] = a[i];
			i++;
			t++;
		}
		if(j < b.length){
			k[t] = b[j];
			j++;
			t++;
		}
		
		//Print
		System.out.print("Answer : ");
		for(int itr=0; itr<k.length; itr++){
			System.out.print(k[itr] + " ");
		}
	}
}
