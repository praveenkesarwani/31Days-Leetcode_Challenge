class Solution {
    public int findComplement(int num) {
        int  bit = 1;
        int temp = num;
        while(temp > 0){
            num = num ^ bit;
            bit = bit << 1;
            temp = temp >> 1;
        }
        return num;
    }
};
/*
explanation:
input = 5 ;
binary representation = 101
taking xor with bit(1) and left shift the bit by 1 and right shift the temp by 1
when temp becomes zero stop;
return num that is the required ans;

 101
^  1
-----
 100
 
 100
^ 1
-----
 110
 
 110
^1
-----
 010
 
010 -> decimal value -> 2
*/