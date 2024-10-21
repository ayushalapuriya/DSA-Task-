class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveBill=0;
        int tenBill=0;
        for(int i=0;i<bills.length;i++){
            int bill=bills[i];
            if(bill==5) fiveBill++;
            else if(bill==10){
                tenBill++;
                if(fiveBill>0) fiveBill--;
                else return false;
            }
            else if(bill==20){
                if(tenBill>0 && fiveBill>0){
                    tenBill--;
                    fiveBill--;
                }
                else if(fiveBill>=3) fiveBill-=3;
                else return false;
            }
        }
        return true;
    }
}