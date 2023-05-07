class Grade{
	public static void main(String args[]){
		int arr[] = {73, 67, 38, 33};
		
		int size = arr.length;
		int res;
		int ele;
		
		for(int i=0; i<size; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<size; i++){
			
			ele = arr[i];
			
            if(ele < 38){
                res = ele;
            }else if((ele+1) % 5 == 0){
                 res = ele + 1;
            }else if((ele+2) % 5 == 0){
                 res = ele + 2;
            }
            else{
                 res = ele;
            }
			
			System.out.println(res);
        }
			
		
	}
}