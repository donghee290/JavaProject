int[][]a= {{5,1,2},{2,3,9}};

int[][]b= {{8,2,1},{1,6,4}};

int[][]c= new int[a.length][a[0].length];





for(int i=0; i<a.length; i++) {

  for(int j=0; j<a[0].length; j++) {
  
    c[i][j]=a[i][j]+b[i][j];
  
  } 

}





for(int i=0; i<a.length; i++) {

  for(int j=0; j<a[0].length; j++) {
  
    c[i][j]=a[i][j]-b[i][j];
    
  }

}
