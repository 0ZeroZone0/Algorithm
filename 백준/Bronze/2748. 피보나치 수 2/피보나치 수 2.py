num =int(input())
list=[]
list.append(0)
list.append(1)

for i in range(2,num+1):
  list.append(list[i-1]+list[i-2])
print(list[num])