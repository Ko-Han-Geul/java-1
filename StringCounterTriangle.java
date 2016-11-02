class StringCounterTriangle{

void drawTri(){

  String s="*";
  StringBuffer sbuf=new StringBuffer();
  String white=" ";

  for (int i=0;i<5;i++){
    for(int j=5;j>i;j--){
              sbuf.append(white);
    }
    
    for(int k=0;k<i;k++){
    sbuf.append(s);
    }
  System.out.printf("%s%s\n", white ,sbuf);
  sbuf.delete(0,sbuf.length());
  }

}

void main(){
  StringCounterTriangle t=new StringCounterTriangle();
  t.drawTri();
}


}
