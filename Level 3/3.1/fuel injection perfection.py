def solution(n):
    count = 0
    n = bin(int(n))[2:]
    condition = 0

    for i in range(len(n) - 1, 0, -1):
        if ((n[i] == '0') & (condition == 0)):
            count += 1
        elif ((n[i] == '0') & (condition == 1)):
            count += 2
            if (i == 1) | (n[i - 1] == '0'):
                condition = 0
        elif ((n[i] == '1') & (condition == 0)):
            count += 2 
            if ((i > 1) & (n[i - 1] == '1')):
                condition = 1
        else:
            count += 1
    return count + condition
    
    k=solution(n)
    return k
