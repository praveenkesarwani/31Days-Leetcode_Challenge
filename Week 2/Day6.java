//Remove K Digits
class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if(k == 0)  return num;
        if(k == len) return "0";
        
        Stack<Character> stack = new Stack<>();
        int index = 0;
        
        while(index < len){
            while(k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(index)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(index++));
        }
        while(k-- > 0) stack.pop();
        
        String output = "";
        while(!stack.isEmpty()) output = stack.pop() + output;
        
		// delete leading zeros
        while(output.length() > 1 && output.charAt(0) == '0')
            output = output.substring(1);
        
        return output;
    }
}