A , B = map(int, input().split())
C = int(input())

if C >  60 :
    num = C // 60
    A = A + num
    B = B +(C % 60)

else:
    B = B + C

if B >= 60 :
    num2 = B // 60
    A = A + num2
    B = B % 60

if(A > 23) :
    A = A  % 24 
    
print(str(A), str(B))