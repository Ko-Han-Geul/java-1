class Gugudan{

  void makeGu(){
  
    for(int i:x){
    System.out.printf("\n%d - ",i);
      for(int j:x){
      System.out.printf("\t%dx%d=%2d",i,j,i*j);
      }
  
    }
  }
  
  void main(){
  Gugudan g=new Gugudan();
  g.makeGu();
  }

}