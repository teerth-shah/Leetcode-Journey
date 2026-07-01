## Question: 3945.Digit Frequency Score

### Concept Learned
- Sum of nth Number concept

### What this question taught me
- how to calculate sum of nth number 
class Solution {
    public int digitFrequencyScore(int n) {
        int sum =0;
       while(n>0){
          sum +=n%10;
           n/=10;
       }
        return sum ;
            }
        
        }
   
