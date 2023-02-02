class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        a = [[1]]
        
        for i in range(numRows-1):
            temp = [0] + a[-1] + [0]
            row = []
            
            for j in range(len(a[-1])+1):
                row.append(temp[j] + temp[j+1])
            
            a.append(row)
        
        return a
