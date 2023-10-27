
sum = 0
result = 0

for _ in range(5):
  number = int(input())
  if number < 40:
    number= 40

  sum += number
  
result = sum / 5

print(int(result))
