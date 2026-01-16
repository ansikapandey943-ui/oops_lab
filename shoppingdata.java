class shoppingdata{
      public static void main(String[] args){
int qtyA=4;
int qtyB=3;
int qtyC=1;
//cost of each product
int costA=20;
int costB=80;
int costC=600;
//total cost of each product
int totalA=qtyA*costA;
int totalB=qtyB*costB;
int totalC=qtyC*costC;
int totalamt=totalA+totalB+totalC;
double discount= totalamt-(0.12*totalamt);
double aftertax=discount+(0.05*discount);
System.out.println(aftertax);
}
}

