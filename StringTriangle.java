class StringTriangle{

void drawTri(){

  String s="*";
  StringBuffer sbuf=new StringBuffer();
  String white=" ";

  for (int i=0;i<5;i++){
    for(int k=0;k<i;k++){
    sbuf.append(s);
    }
  System.out.printf("%s\n", sbuf);
  sbuf.delete(0,sbuf.length());
  }

}

void main(){
  StringTriangle t=new StringTriangle();
  t.drawTri();
}


}
