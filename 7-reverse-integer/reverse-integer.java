class Solution {
    public int reverse(int x) {
      int temp=Math.abs(x),rev=0;
      while(temp!=0)
      {
        int val=temp%10;
        if(rev>(Integer.MAX_VALUE-val)/10)
        {
          return 0;
        }
        rev=rev*10+val;
        temp=temp/10;
      }
      return (x<0)?-rev:rev;
    }
}