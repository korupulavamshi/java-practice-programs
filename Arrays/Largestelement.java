package arrays;

class largestelement {
	  public static void main(String[] args) {
	    int a[] = {100,88,500,40,250};
	    int largest = a[0];
	    for(int i=0;i<a.length;i++){
	      if(a[i]>largest){
	        largest = a[i];
	      }
	    }
	    System.out.println("The largest element in array is:"+largest);
	  }
}

//output: The largest element in array is:500
